/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

import java.util.ArrayList;

/**
 *
 * @author samuelzun
 */
public class ClaseUML {
    
    private String nombre;
    private final ArrayList<Propiedad> propiedades = new ArrayList<Propiedad>();
    private final ArrayList<Metodo> metodos = new ArrayList<Metodo>();
    private ClaseUML clasePadre;

    public ClaseUML() {
    }

    public ClaseUML(String nombre, ClaseUML clasePadre) {
        this.nombre = nombre;
        this.clasePadre = clasePadre;
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
    }

    public ArrayList<Propiedad> getPropiedades() {
        return propiedades;
    }

    public ArrayList<Metodo> getMetodos() {
        return metodos;
    }
    
    @Override public String toString() {
        return nombre;
    }
    
}
