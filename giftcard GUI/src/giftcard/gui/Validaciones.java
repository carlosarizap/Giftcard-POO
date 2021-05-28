/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giftcard.gui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Validaciones {

    public boolean validarNombre(String nombre) {
        if (nombre.isEmpty() || nombre.equalsIgnoreCase("Nombre del trabajador")) {
            JOptionPane.showMessageDialog(null, "El nombre no puede ir vacio... Favor ingresar de nuevo.");
            return (false);
        } else {
            return (true);
        }

    }

    public boolean validarRun(int run) {

        if (run <= 0) {
            JOptionPane.showMessageDialog(null, "El RUN no puede ir vacio... Favor ingresar de nuevo.");

            return false;
        } else {
            return true;
        }

    }

    public boolean validarDv(String dv) {
        if (dv.equals("0") || dv.equals("1") || dv.equals("2") || dv.equals("3") || dv.equals("4") || dv.equals("5") || dv.equals("6") || dv.equals("7") || dv.equals("8") || dv.equals("9") || dv.equalsIgnoreCase("K")) {
            return (true);
        } else {
            JOptionPane.showMessageDialog(null, "Digito verificador incorrecto... Favor ingresar de nuevo.");
            return (false);
        }
    }

    public boolean validarFecha(String fecha) {
        try {
            Date hoy = new Date();
            hoy.setHours(0);
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");

            formato.format(hoy);

            Date fechaF = new SimpleDateFormat("dd-MM-yyyy").parse(fecha);

            if (hoy.before(fechaF)) {
                return (true);

            } else {
                JOptionPane.showMessageDialog(null, "Fecha no vigente... Favor ingresar de nuevo.");
                return (false);
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto... Favor ingresar de nuevo.");
            return (false);
        }

    }

    public boolean validarMonto(int montoTotal) {

        if (montoTotal < 0) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
            return (false);
        }
        return (true);

    }

    public boolean validarUsuario(int usuario, int contraseña) {

        if (contraseña == 0) {
            JOptionPane.showMessageDialog(null, "Digite constraseña.");
            return false;

        }

        if (usuario == contraseña) {
            return (true);
        } else {

            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta.");
            return false;
        }

    }

    public boolean validarMonto2(int monto) {
        if (monto <= 0) {
            JOptionPane.showMessageDialog(null, "Monto invalido.");
            return false;
        } else {
            return true;

        }

    }

    public boolean validarUsuario(String nombre) {
        if (nombre.equals("0") || nombre.equalsIgnoreCase("RUN sin DV")) {
            JOptionPane.showMessageDialog(null, "El usuario no puede ir vacio... Favor ingresar de nuevo.");
            return (false);
        } else {
            return (true);
        }

    }

    public boolean validarTres(String a1, String b2, String c3) {

        if (a1.equals("RUN sin DV") && b2.equals("") && c3.equals("")) {
            JOptionPane.showMessageDialog(null, "Campos vacios... Favor ingresar de nuevo.");
            return false;
        } else {
            return true;
        }

    }
}
