/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author Ryzen Gaming
 */
public class While extends FlujoUML{
    
    private Variable condicion;

    public While(Variable condicion, String nombre) {
        super(nombre);
        this.condicion = condicion;
        this.panel.cambiarLblTipo("if");
    }

    public Variable getCondicion() {
        return condicion;
    }

    public void setCondicion(Variable condicion) {
        this.condicion = condicion;
    }
    
}
