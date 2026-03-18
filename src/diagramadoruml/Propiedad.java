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
    private ClaseUML clase;

    public Propiedad() {
    }

    public Propiedad(String nombre, Tipo tipo, Acceso acceso, ClaseUML clase) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.acceso = acceso;
        this.clase = clase;
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

    @Override
    public String toString() {
        return "["+acceso.getNombre()+"] ("+tipo.getNombre()+") "+nombre;
    }
    
}
