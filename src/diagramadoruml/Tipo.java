/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author Ryzen Gaming
 */
public enum Tipo{
    
    BYTE("byte"),
    SHORT("short"),
    INT("int"),
    FLOAT("float"),
    CHAR("char"),
    LONG("long"),
    DOUBLE("double"),
    STRING("String");
    
    private String nombre;

    private Tipo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}
