package diagramadoruml;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samuelzun
 */
public class Metodo {
    
    private String nombre;
    private Tipo tipoRetorno;
    private Acceso acceso;
    private ArrayList<Propiedad> parametros = new ArrayList();
    private ClaseUML claseOrigen;

    public Metodo() {
    }
    
    public Metodo(String nombre, Tipo tipoRetorno, Acceso acceso) {
        this.nombre = nombre;
        this.tipoRetorno = tipoRetorno;
        this.acceso = acceso;
    }

    public Metodo(String nombre, Tipo tipoRetorno, Acceso acceso, ClaseUML clase) {
        this.nombre = nombre;
        this.tipoRetorno = tipoRetorno;
        this.acceso = acceso;
        this.claseOrigen = clase;
    }

    public Metodo(Metodo mtd, ClaseUML claseOrigen) {
        this.nombre = mtd.getNombre();
        this.tipoRetorno = mtd.getTipoRetorno();
        this.acceso = mtd.getAcceso();
        this.parametros = mtd.getParametros();
        this.claseOrigen = claseOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipoRetorno() {
        return tipoRetorno;
    }

    public void setTipoRetorno(Tipo tipoRetorno) {
        this.tipoRetorno = tipoRetorno;
    }

    public Acceso getAcceso() {
        return acceso;
    }

    public void setAcceso(Acceso acceso) {
        this.acceso = acceso;
    }

    public ClaseUML getClaseOrigen() {
        return claseOrigen;
    }

    public void setClaseOrigen(ClaseUML clase) {
        this.claseOrigen = clase;
    }

    public ArrayList<Propiedad> getParametros() {
        return parametros;
    }

    @Override
    public String toString() {
        return acceso.getNombre()+" "+tipoRetorno.getNombre()+" "+nombre;
    }
    
}
