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
public class Tarjeta {

    long codigo;
    int run, clave, monto;
    String nombre, vigencia;

    public Tarjeta() {
    }

    public Tarjeta(long codigo, int run, int clave, int monto, String vigencia, String trabajador) {

        this.codigo = codigo;
        this.run = run;
        this.clave = clave;
        this.monto = monto;
        this.vigencia = vigencia;
        this.nombre = trabajador;
    }

    public long getCodigo() {
        return codigo;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public String getTrabajador() {
        return nombre;
    }

    public void setTrabajador(String trabajador) {
        this.nombre = trabajador;
    }
}
