/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author samuelzun
 */
public class Str extends Propiedad {
    
    private String valor;

    public Str(String nombre, Object valor) {
        super(nombre, valor);
    }

    public void setValor(Object val) {
        this.valor = (String)val;
    }
    
    public String getValor() {
        return this.valor;
    }
    
}