/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giftcard.gui;

/**
 *
 * @author Carlos
 */
public class Trabajador {

    int run;
    String nombre, dv;

    public Trabajador() {
    }

    public Trabajador(int run, String nombre, String dv) {
        this.run = run;
        this.nombre = nombre;
        this.dv = dv;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "Nombre=" + nombre + ", RUN=" + run + "-" + dv + '}';
    }

}
