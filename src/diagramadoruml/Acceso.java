/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author Ryzen Gaming
 */
public enum Acceso{
    
    PUBLIC("public"),
    PRIVATE("private"),
    PROTECTED("protected");
    
    private final String nombre;

    private Acceso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
}
