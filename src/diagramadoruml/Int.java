/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author samuelzun
 */
public class Int extends Propiedad {
    
    private int valor;

    public Int(String nombre, Object valor) {
        super(nombre, valor);
    }

    public void setValor(Object val) {
        this.valor = (Integer)val;
    }
    
    public Integer getValor() {
        return this.valor;
    }
    
}