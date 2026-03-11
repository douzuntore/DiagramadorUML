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

    public ClaseUML(ClaseUML padre) {
        this.clasePadre = padre;
    }
    
    
    
}
