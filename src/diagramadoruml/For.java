/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author Ryzen Gaming
 */
public class For extends FlujoUML{
    
    private Variable ciclosI; //tiene que ser tipo INT

    public For(Variable ciclosI, String nombre) {
        super(nombre);
        this.ciclosI = ciclosI;
        this.panel.cambiarLblTipo("for");
    }

    public Variable getCiclosI() {
        return ciclosI;
    }

    public void setCiclosI(Variable ciclosI) {
        this.ciclosI = ciclosI;
    }
    
}
