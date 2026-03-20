/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author samuelzun
 */
public abstract class Operacion {
    
    protected ClaseUML claseReferencia;
    
    public Operacion(Metodo mtd) {
        this.claseReferencia = mtd.getClaseOrigen();
    }

    public abstract void logica();
    
}
