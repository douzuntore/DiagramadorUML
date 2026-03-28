/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

import java.awt.Dimension;
import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Ryzen Gaming
 */
public class CerrarLlave extends FlujoUML implements Serializable {
    
    private final Dimension panelSize = new Dimension(51, 34);
    
    public CerrarLlave(Point location) {
        super("", location);
        this.panel.setEsquina(
                new Point(location.x, location.y)
        );
        this.panel.setSize(panelSize);
        this.panel.cambiarLblTipo("}");
    }
    
}
