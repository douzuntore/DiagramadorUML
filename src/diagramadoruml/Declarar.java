/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author samuelzun
 */
public class Declarar extends FlujoUML{
    
    private Variable variable;
    private Variable valorCambio;

    public Declarar() {
    }

    public Declarar(String nombre, Variable variable, Variable valorCambio) {
        super(nombre);
        this.variable = variable;
        this.valorCambio = valorCambio;
        this.panel.cambiarLblTipo("declarar");
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public Variable getValorCambio() {
        return valorCambio;
    }

    public void setValorCambio(Variable valorCambio) {
        this.valorCambio = valorCambio;
    }
    
}
