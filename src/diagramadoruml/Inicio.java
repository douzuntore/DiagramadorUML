/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

import java.awt.Point;

/**
 *
 * @author samuelzun
 */
public class Inicio extends FlujoUML{
    
    public Inicio(Point location) {
        super("Inicio", location);
        this.panel.cambiarLblTipo("inicio");
    }

}
