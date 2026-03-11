package diagramadoruml;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samuelzun
 */
public class Metodo {
    
    private String nombre;
    protected ClaseUML clasePadre;
    private final ArrayList<Operacion> secuencia = new ArrayList<Operacion>();

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
    
    public Metodo() {
        init();
    }
    
    private void init() {
        secuencia.add(new Inicio(this));
        secuencia.add(new Fin(this));
    }
    
}
