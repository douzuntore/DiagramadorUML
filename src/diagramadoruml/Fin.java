/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author samuelzun
 */
public class Fin extends FlujoUML implements Serializable {

    public Fin(Point location) {
        super("Fin", location);
        this.panel.cambiarLblTipo("fin");
    }
    
}
