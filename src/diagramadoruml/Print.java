/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramadoruml;

/**
 *
 * @author Ryzen Gaming
 */
public class Print extends FlujoUML{
    
    private Variable impresion;

    public Print(Variable impresion, String nombre) {
        super(nombre);
        this.impresion = impresion;
        this.panel.cambiarLblTipo("sout");
    }

    public Variable getImpresion() {
        return impresion;
    }

    public void setImpresion(Variable impresion) {
        this.impresion = impresion;
    }

}