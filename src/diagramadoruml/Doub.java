/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author samuelzun
 */
public class Doub extends Propiedad {
    
    private double valor;

    public Doub(String nombre, Object valor) {
        super(nombre, valor);
    }

    public void setValor(Object val) {
        this.valor = (Double)val;
    }
    
    public Double getValor() {
        return this.valor;
    }
    
}