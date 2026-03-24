/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author samuelzun
 */
public abstract class FlujoUML {
    
    protected String nombre;
    protected pnl_FlujoUML panel;

    public FlujoUML() {
    }

    public FlujoUML(String nombre) {
        this.nombre = nombre;
        this.panel = new pnl_FlujoUML(this);
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
