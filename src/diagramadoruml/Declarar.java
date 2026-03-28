/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author samuelzun
 */
public class Declarar extends FlujoUML implements Serializable {
    
    private Variable variable;
    private final ArrayList<Variable> valoresCambio = new ArrayList<>();
    private String operacion;
    private String operadorNo;

    public Declarar(Point location) {
        super("Declarar", location);
        this.panel.cambiarLblTipo("declarar");
    }

    public Variable getVariable() {
        return variable;
    }

    public void setVariable(Variable variable) {
        this.variable = variable;
    }

    public ArrayList<Variable> getValoresCambio() {
        return valoresCambio;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getOperadorNo() {
        return operadorNo;
    }

    public void setOperadorNo(String operadorNo) {
        this.operadorNo = operadorNo;
    }

    
    
}
