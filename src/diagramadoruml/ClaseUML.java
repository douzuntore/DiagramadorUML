/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author samuelzun
 */
public class ClaseUML implements Serializable{
    
    private String nombre;
    private final ArrayList<Propiedad> propiedades = new ArrayList();
    private final ArrayList<Metodo> metodos = new ArrayList();
    private final ArrayList<ClaseUML> hijos = new ArrayList();
    private ClaseUML clasePadre;

    public ClaseUML() {
    }

    public ClaseUML(String nombre, ClaseUML clasePadre) {
        this.nombre = nombre;
        this.setClasePadre(clasePadre);
    }
    
    public ClaseUML(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ClaseUML getClasePadre() {
        return clasePadre;
    }

    public void setClasePadre(ClaseUML clasePadre) {
        this.clasePadre = clasePadre;
        if (this.clasePadre != null) {
            for (int i = 0; i < this.propiedades.size(); i++) {
                if (this.propiedades.get(i).getClaseOrigen() != null) {
                    this.propiedades.remove(i);
                    i--;
                }
            }
            for (int i = 0; i < this.metodos.size(); i++) {
                if (this.metodos.get(i).getClaseOrigen() != null) {
                    this.metodos.remove(i);
                    i--;
                }
            }
            agregarElementosHeredados(this.clasePadre);
        } else {
            for (int i = 0; i < this.propiedades.size(); i++) {
                if (this.propiedades.get(i).getClaseOrigen() != null) {
                    this.propiedades.remove(i);
                    i--;
                }
            }
            for (int i = 0; i < this.metodos.size(); i++) {
                if (this.metodos.get(i).getClaseOrigen() != null) {
                    this.metodos.remove(i);
                    i--;
                }
            }
        }
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }

    public ArrayList<ClaseUML> getHijos() {
        return hijos;
    }
    
    public DefaultMutableTreeNode formaNodo() {
        
        DefaultMutableTreeNode nodoClase = new DefaultMutableTreeNode(this);
        DefaultMutableTreeNode nodoPropiedades = new DefaultMutableTreeNode("Propiedades");
        DefaultMutableTreeNode nodoMetodos = new DefaultMutableTreeNode("Métodos");
        
        for (Propiedad prop: this.getPropiedades()) {
            nodoPropiedades.add(new DefaultMutableTreeNode(prop));
        }
        for (Metodo met: this.getMetodos()) {
            nodoMetodos.add(new DefaultMutableTreeNode(met));
        }
        
        nodoClase.add(nodoPropiedades); nodoClase.add(nodoMetodos);
        
        return nodoClase;
        
    }
    
    private void agregarElementosHeredados(ClaseUML clasePadre) {
        for (int i = clasePadre.getPropiedades().size()-1; i >= 0; i--) {
            Propiedad prop = clasePadre.getPropiedades().get(i);
            if (prop.getAcceso() != Acceso.PRIVATE) {
                if (this.propiedades.contains(prop)) {
                    this.propiedades.remove(prop);
                }
                prop.setClaseOrigen(clasePadre);
                this.propiedades.add(prop);
            }
        }
        for (int i = clasePadre.getMetodos().size()-1; i >= 0; i--) {
            Metodo metodo = clasePadre.getMetodos().get(i);
            if (metodo.getAcceso() != Acceso.PRIVATE) {
                if (this.metodos.contains(metodo)) {
                    this.metodos.remove(metodo);
                }
                metodo.setClaseOrigen(clasePadre);
                this.metodos.add(metodo);
            }
        }
        if (clasePadre.getClasePadre() != null) {
            agregarElementosHeredados(clasePadre.getClasePadre());
        }
    }
    
    public String claseEnCodigo() {
        String str = "";
        
        str += ""
                + "public class "+this.nombre+" ";
        if (this.clasePadre != null) {
            str += ""
                    + "extends "+this.clasePadre.getNombre()+" ";
        }
        str += ""
                + "{\n"
                + "\n";
        //Propiedades
        for (Propiedad prop: this.propiedades) {
            if (prop.getClaseOrigen() == null) {
                str += "    " //tab
                    + prop.getAcceso().getNombre()+" "+prop.getTipo().getNombre()+" "+prop.getNombre()+";\n";
            }
        }
        //Constructor vacio
        str += ""
                + "\n"
                + "    public "+this.nombre+" () {\n"
                + "    }\n"
                + "\n";
        //Constructor lleno
        if (!this.propiedades.isEmpty()) {
            str += ""
                    + "    public "+this.nombre+" (";
            for (int i = 0; i < propiedades.size(); i++) {
                Propiedad prop = propiedades.get(i);
                str += ""
                        + prop.getTipo().getNombre()+" "+prop.getNombre();
                if (i != propiedades.size()-1) {
                    str += ""
                            + ", ";
                }
            }
            str += ""
                    + ") {\n";
            for (int i = 0; i < 2; i++) {
                ArrayList<Propiedad> props = new ArrayList<>();
                switch (i) {
                    case 0 -> {
                        for (Propiedad prop: propiedades) {
                            if (prop.getClaseOrigen() != null) {
                                props.add(prop);
                            }
                        }
                        if (props.isEmpty()) {
                            continue;
                        }
                        str += ""
                                + "        super(";
                        for (int j = 0; j < props.size(); j++) {
                            Propiedad prop = props.get(j);
                            str += ""
                                    + prop.getNombre();
                            if (j != props.size()-1) {
                                str += ""
                                        + ", ";
                            }
                        }
                        str += ""
                                + ");\n";
                    }
                    case 1 -> {
                        for (Propiedad prop: propiedades) {
                            if (prop.getClaseOrigen() == null) {
                                props.add(prop);
                            }
                        }
                        for (Propiedad prop: props) {
                            str += ""
                                    + "        this."+prop.getNombre()+" = "+prop.getNombre()+";\n";
                        }
                        str += ""
                                + "    }\n";
                    }
                }
            }
        }
        //Metodos
        for (Metodo mtd: this.metodos) {
            if (mtd.getClaseOrigen() == null) {
                str += "    " //tab
                    + mtd.getAcceso().getNombre()+" "+mtd.getTipoRetorno().getNombre()+" "+mtd.getNombre()+" (";
                for (int i = 0; i < mtd.getParametros().size(); i++) {
                    Propiedad param = mtd.getParametros().get(i);
                    str += ""
                            + param.getTipo().getNombre()+" "+param.getNombre();
                    if (i != mtd.getParametros().size()) {
                        str += ""
                                + ", ";
                    }
                }
                str += ") {\n    }\n";
            }
        }
        str += ""
                + "\n}\n";
        
        return str;
    }
    
    public pnl_TreeDeClase crearPanelTree(frm_Main frm) {
        return new pnl_TreeDeClase(this, frm);
    }
    
    @Override public String toString() {
        return nombre;
    }
    
}
