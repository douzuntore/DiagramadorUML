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
public class For extends FlujoUML implements Serializable {
    
    private Variable ciclosI; //tiene que ser tipo INT
    private CerrarLlave llaveDeCierre;

    public For(Point location) {
        super("For", location);
        this.panel.cambiarLblTipo("for {");
        location.translate(0, 100);
        this.llaveDeCierre = new CerrarLlave(
                new Point(location.x, location.y)
        );
    }

    public Variable getCiclosI() {
        return ciclosI;
    }

    public void setCiclosI(Variable ciclosI) {
        this.ciclosI = ciclosI;
    }

    public CerrarLlave getLlaveDeCierre() {
        return llaveDeCierre;
    }
    
}
