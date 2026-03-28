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
public class While extends FlujoUML implements Serializable {
    
    private Variable condicion;
    private CerrarLlave llaveDeCierre;
    
    public While(Point location) {
        super("While", location);
        this.panel.cambiarLblTipo("while {");
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
