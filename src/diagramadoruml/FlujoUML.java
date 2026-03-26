/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

import java.awt.Dimension;
import java.awt.Point;

/**
 *
 * @author samuelzun
 */
public abstract class FlujoUML {
    
    protected String nombre;
    protected pnl_FlujoUML panel;
    private final Dimension panelSize = new Dimension(102, 68);

    public FlujoUML() {
    }

    public FlujoUML(String nombre, Point location) {
        this.nombre = nombre;
        this.panel = new pnl_FlujoUML(this);
        this.panel.setLocation(location);
        this.panel.setEsquina(new Point(location.x, location.y));
        this.panel.setSize(panelSize);
    }

    public FlujoUML(String nombre, pnl_FlujoUML panel) {
        this.nombre = nombre;
        this.panel = panel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public pnl_FlujoUML getPanel() {
        return panel;
    }
    
}
