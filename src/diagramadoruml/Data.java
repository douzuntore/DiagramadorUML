/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Ryzen Gaming
 */
public class Data {
    
    private final static ArrayList<ClaseUML> clases = new ArrayList<>();
    private final static ArrayList<Variable> variables = new ArrayList<>();
    private final static ArrayList<FlujoUML> operaciones = new ArrayList<>();

    public static ArrayList<ClaseUML> getClases() {
        return clases;
    }

    public static ArrayList<Variable> getVariables() {
        return variables;
    }

    public static ArrayList<FlujoUML> getOperaciones() {
        return operaciones;
    }
    
    public static void anidarCBoxModel(DefaultComboBoxModel modelo1, DefaultComboBoxModel modeloAnidar) {
        for (int i = 0; i < modeloAnidar.getSize(); i++) {
            modelo1.addElement(
                    modeloAnidar.getElementAt(i)
            );
        }
    }
    
    public static DefaultComboBoxModel crearCBoxModelVariablesInt() {
        return crearCBoxModelVariablesXTipo(Tipo.INT);
    }
    
    public static DefaultComboBoxModel crearCBoxModelVariablesBool() {
        return crearCBoxModelVariablesXTipo(Tipo.BOOLEAN);
    }
    
    public static DefaultComboBoxModel crearCBoxModelVariablesXTipo(Tipo tipo) {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Variable var: Data.getVariables()) {
            if (var.getTipo() == tipo) {
                modelo.addElement(var);
            }
        }
        return modelo;
    }
    
    public static DefaultComboBoxModel crearCBoxModelVariables() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (Variable var: Data.getVariables()) {
            modelo.addElement(var);
        }
        return modelo;
    }
    
    public static boolean UnaOMasVariableDeTipo(Tipo tipo) {
        return crearCBoxModelVariablesXTipo(tipo).getSize() >= 1;
    }
    
    public static boolean DosOMasVariableDeTipo(Tipo tipo) {
        return crearCBoxModelVariablesXTipo(tipo).getSize() >= 2;
    }
    
    public static DefaultListModel crearListModelVariables() {
        DefaultListModel modelo = new DefaultListModel();
        for (Variable var: Data.getVariables()) {
            modelo.addElement(var);
        }
        return modelo;
    }
    
    public static ArrayList<Object> guardadoDeFlujos() {
        ArrayList<Object> objetos = new ArrayList<>();
        objetos.add(
                Data.getOperaciones()
        );
        objetos.add(    
                Data.getVariables()
        );
        return objetos;
    }
    
    public static void cargadoDeFlujos(ArrayList<Object> objetos) {
        Data.getOperaciones().clear();
        Data.getVariables().clear();
        try {
            ArrayList<Variable> variables = (ArrayList<Variable>) objetos.get(0);
            for (Variable var: variables) {
                Data.getVariables().add(var);
            }
        }
        catch (Exception e) {
            Data.getVariables().clear();
        }
        try {
            ArrayList<FlujoUML> flujos = (ArrayList<FlujoUML>) objetos.get(1);
            for (FlujoUML flujo: flujos) {
                Data.getOperaciones().add(flujo);
            }
        }
        catch (Exception e) {
            Data.getOperaciones().clear();
        }
    }
    
    public static ArrayList<ClaseUML> todasLasClases() {
        return todasLasClases(new ArrayList(), Data.getClases());
    }
    
    public static ArrayList<ClaseUML> todasLasClases(ArrayList<ClaseUML> clases) {
        return todasLasClases(new ArrayList(), clases);
    }
    
    private static ArrayList<ClaseUML> todasLasClases(ArrayList<ClaseUML> clases, ArrayList<ClaseUML> clasesRecorrer) {
        for (ClaseUML clase: clasesRecorrer) {
            clases.add(clase);
            if (!clase.getHijos().isEmpty()) {
                return todasLasClases(clases, clase.getHijos());
            }
        }
        return clases;
    }
    
    public static String clasesACodigo() {
        System.out.println(clasesACodigo("", Data.getClases()));
        return clasesACodigo("", Data.getClases());
    }
    
    private static String clasesACodigo(String str, ArrayList<ClaseUML> clases) {
        for (ClaseUML clase: clases) {
            str += clase.claseEnCodigo()+"\n\n";
            if (!clase.getHijos().isEmpty()) {
                str = clasesACodigo(str, clase.getHijos());
            }
        }
        return str;
    }
    
    public static DefaultTreeModel crearTreeModelClases() {
        return crearTreeModelClases(
                new DefaultMutableTreeNode("Clases"),
                Data.getClases()
        );
    }
    
    private static DefaultTreeModel crearTreeModelClases(DefaultMutableTreeNode nodoRaiz, ArrayList<ClaseUML> clases) {
        
        for (ClaseUML clase: clases) {
            nodoRaiz.add(clase.formaNodo());
            if (!clase.getHijos().isEmpty()) {
                crearTreeModelClases(
                        nodoRaiz
                        ,clase.getHijos()
                );
            }
        }
        
        return new DefaultTreeModel(nodoRaiz);
        
    }
    
    public static DefaultListModel crearListModelClases() {
        return crearListModelClases(new DefaultListModel(), Data.getClases());
    }
    
    private static DefaultListModel crearListModelClases(DefaultListModel modelo, ArrayList<ClaseUML> clases) {
        
        for (ClaseUML clase: clases) {
            
            modelo.addElement(clase);
            if (!clase.getHijos().isEmpty()) {
                crearListModelClases(
                        modelo,
                        clase.getHijos()
                );
            }
                    
        }
        return modelo;
        
    }
    
    public static DefaultListModel crearListModelClases(DefaultListModel modelo) {
        
        DefaultListModel elementos = crearListModelClases();
        for (int i = 0; i < elementos.getSize(); i++) {
            modelo.addElement(
                    (ClaseUML) elementos.get(i)
            );
        }
        return modelo;
        
    }
    
    public static DefaultComboBoxModel crearCBoxModelParaClasesPadre() {
        return crearCBoxModelParaClasesPadre(new DefaultComboBoxModel(), Data.getClases());
    }
    
    public static DefaultComboBoxModel crearCBoxModelParaClasesPadre(DefaultComboBoxModel modelo) {
        
        DefaultComboBoxModel elementos = crearCBoxModelParaClasesPadre();
        for (int i = 0; i < elementos.getSize(); i++) {
            modelo.addElement(
                    (ClaseUML) elementos.getElementAt(i)
            );
        }
        return modelo;
        
    }
    
    private static DefaultComboBoxModel crearCBoxModelParaClasesPadre(DefaultComboBoxModel modelo, ArrayList<ClaseUML> clases) {
        
        for (ClaseUML clase: clases) {
            
            modelo.addElement(clase);
            if (!clase.getHijos().isEmpty()) {
                crearCBoxModelParaClasesPadre(
                        modelo,
                        clase.getHijos()
                );
            }
                    
        }
        return modelo;
    }
    
}
