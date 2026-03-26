/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

import java.util.ArrayList;

/**
 *
 * @author Ryzen Gaming
 */
public class Variable {
    
    private String nombre;
    private Tipo tipo;

    public Variable() {
    }

    public Variable(String nombre, Tipo tipo, ArrayList<Variable> variablesUsados, String operacion, String operadorNo) {
        this.nombre = nombre;
        this.tipo = tipo;
        for (Variable var: variablesUsados) {
            this.variablesUsados.add(var);
        }
        this.operacion = operacion;
        this.operadorNo = operadorNo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Variable> getVariablesUsados() {
        return variablesUsados;
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

    @Override
    public String toString() {
        return tipo.getNombre()+" "+nombre;
    }
    
}
