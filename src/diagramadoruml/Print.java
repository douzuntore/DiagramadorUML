/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Ryzen Gaming
 */
public class Print extends FlujoUML implements Serializable {
    
    private Variable impresion; //tipo STRING o no se

    public Print(Point location) {
        super("Print", location);
        this.panel.cambiarLblTipo("sout");
    }

    public Variable getImpresion() {
        return impresion;
    }

    public void setImpresion(Variable impresion) {
        this.impresion = impresion;
    }

}