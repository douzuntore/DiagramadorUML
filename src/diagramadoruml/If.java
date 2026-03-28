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
public class If extends FlujoUML implements Serializable {
    
    private Variable condicion; //tipo BOOLEAN
    private CerrarLlave llaveDeCierre;

    public If(Point location) {
        super("If", location);
        this.panel.cambiarLblTipo("if {");
        location.translate(0, 100);
        this.llaveDeCierre = new CerrarLlave(
                new Point(location.x, location.y)
        );
    }

    public Variable getCondicion() {
        return condicion;
    }

    public void setCondicion(Variable condicion) {
        this.condicion = condicion;
    }

    public CerrarLlave getLlaveDeCierre() {
        return llaveDeCierre;
    }
    
}
