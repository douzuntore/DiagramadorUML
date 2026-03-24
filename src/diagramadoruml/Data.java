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
    
    private static Data data; 
    
    private Data() {}
    
    public static Data getData() {
        if (data == null) {
            data = new Data();
        }
        return data;
    }
    
    private static ArrayList<ClaseUML> clases = new ArrayList<>();
    private static ArrayList<Variable> variables = new ArrayList<>();

    public static ArrayList<ClaseUML> getClases() {
        return clases;
    }
    
    public static ArrayList<ClaseUML> todasLasClases() {
        return todasLasClases(new ArrayList(), data.getClases());
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
        System.out.println(clasesACodigo("", data.getClases()));
        return clasesACodigo("", data.getClases());
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
                data.getClases()
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
        return crearListModelClases(new DefaultListModel(), data.getClases());
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
        return crearCBoxModelParaClasesPadre(new DefaultComboBoxModel(), data.getClases());
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
