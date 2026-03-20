/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author samuelzun
 */
public class Propiedad {
    
    private String nombre;
    private Tipo tipo;
    private Acceso acceso;
    private ClaseUML claseOrigen;

    public Propiedad() {
    }
    
    public Propiedad(String nombre, Tipo tipo, Acceso acceso) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.acceso = acceso;
    }

    public Propiedad(String nombre, Tipo tipo, Acceso acceso, ClaseUML clase) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.acceso = acceso;
        this.claseOrigen = clase;
    }
    
    public Propiedad(String nombre, Tipo tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
    public Propiedad(Propiedad prop, ClaseUML padre) {
        this.nombre = prop.getNombre();
        this.tipo = prop.getTipo();
        this.acceso = prop.getAcceso();
        this.claseOrigen = padre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Acceso getAcceso() {
        return acceso;
    }
    public void setAcceso(Acceso acceso) {
        this.acceso = acceso;
    }

    public ClaseUML getClaseOrigen() {
        return claseOrigen;
    }
    public void setClaseOrigen(ClaseUML claseOrigen) {
        this.claseOrigen = claseOrigen;
    }
    
    @Override
    public String toString() {
        if (acceso == null && claseOrigen == null) {
            return tipo.getNombre()+" "+nombre;
        } else {
            return "["+acceso.getNombre()+"] ("+tipo.getNombre()+") "+nombre;
        }
        
    }
    
    public boolean esIgualA(Propiedad prop) {
        return (
                this.nombre.equals(prop.getNombre()) &&
                this.tipo == prop.getTipo() &&
                this.acceso == prop.getAcceso() //&&
                //this.claseOrigen.esIgualA
        );
    }
    
}
