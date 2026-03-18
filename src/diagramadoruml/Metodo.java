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
    private Tipo tipoRetorno;
    private Acceso acceso;
    private final ArrayList<Propiedad> parametros = new ArrayList();
    private ClaseUML clase;

    public Metodo() {
    }

    public Metodo(String nombre, Tipo tipoRetorno, Acceso acceso, ClaseUML clase) {
        this.nombre = nombre;
        this.tipoRetorno = tipoRetorno;
        this.acceso = acceso;
        this.clase = clase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ClaseUML getClase() {
        return clase;
    }

    public void setClase(ClaseUML clase) {
        this.clase = clase;
    }
    
}
