/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author samuelzun
 */
public class Declarar extends Operacion{
    
    private int propID;
    private boolean esNuevo;
    private Object nuevoValor;

    public Declarar(int propID, boolean esNuevo, Object nuevoValor, Metodo mtd) {
        super(mtd);
        this.propID = propID;
        this.esNuevo = esNuevo;
        this.nuevoValor = nuevoValor;
    }
    
    public void logica() {
    }
    
}
