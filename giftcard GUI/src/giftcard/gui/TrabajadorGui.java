/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giftcard.gui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class TrabajadorGui extends javax.swing.JFrame {

    ArrayList<Trabajador> listaTrabajadores;
    String fila1[] = new String[]{"Nombre", "RUN", "DV"};
    DefaultTableModel tabla;
    int fila, columna;

    /**
     * Creates new form CrearTrabajador
     */
    public TrabajadorGui() {
        initComponents();
        listaTrabajadores = new ArrayList<>();
        tabla = new DefaultTableModel(fila1, 0);
        tablaTrabajador.setModel(tabla);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        salir1 = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDv = new javax.swing.JTextField();
        txtRun = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JLabel();
        txtMensaje1 = new javax.swing.JLabel();
        crearTrabajador = new javax.swing.JButton();
        eliminarTrabajador = new javax.swing.JButton();
        modificarTrabajador = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTrabajador = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giftcard/gui/Trabajador.png"))); // NOI18N
        jLabel1.setText("Trabajadores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));
        jPanel2.setForeground(new java.awt.Color(0, 0, 102));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        salir1.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        salir1.setText("Salir");
        salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir1ActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel3.setText("RUN:");

        txtDv.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtRun.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRunActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        jLabel4.setText("-");

        txtMensaje.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(0, 0, 0));

        txtMensaje1.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        txtMensaje1.setForeground(new java.awt.Color(0, 0, 0));

        crearTrabajador.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        crearTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giftcard/gui/addTrabajador.png"))); // NOI18N
        crearTrabajador.setText("Crear");
        crearTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearTrabajadorActionPerformed(evt);
            }
        });

        eliminarTrabajador.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        eliminarTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giftcard/gui/deleteTrabajador.png"))); // NOI18N
        eliminarTrabajador.setText("Eliminar");
        eliminarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarTrabajadorActionPerformed(evt);
            }
        });

        modificarTrabajador.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        modificarTrabajador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giftcard/gui/modTrabajador.png"))); // NOI18N
        modificarTrabajador.setText("Modificar");
        modificarTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarTrabajadorActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giftcard/gui/info.png"))); // NOI18N
        jLabel6.setText("Para modificar/eliminar, se debe tener seleccionada");

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("la fila que desea cambiar o eliminar.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(4, 4, 4)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel4)
                                        .addGap(4, 4, 4)
                                        .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(crearTrabajador)
                        .addGap(33, 33, 33)
                        .addComponent(modificarTrabajador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(eliminarTrabajador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMensaje1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearTrabajador)
                            .addComponent(modificarTrabajador)
                            .addComponent(eliminarTrabajador))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(salir1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel7)))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setForeground(new java.awt.Color(0, 0, 102));

        tablaTrabajador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaTrabajador.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tablaTrabajadorAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tablaTrabajador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTrabajadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTrabajador);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir1ActionPerformed
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_salir1ActionPerformed

    private void txtRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRunActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void crearTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearTrabajadorActionPerformed
        // TODO add your handling code here:
        Validaciones v = new Validaciones();
        String nombre = txtNombre.getText();
        String run1 = txtRun.getText();

        if (run1.equals("")) {
            run1 = "0";

        }
        int run = Integer.parseInt(run1);
        String dv = txtDv.getText();
        boolean a = v.validarNombre(nombre);
        boolean b = v.validarDv(dv);
        boolean c = v.validarRun(run);
        if (a == true && b == true && c == true) {

            listaTrabajadores.add(new Trabajador(run, nombre, dv));
            tabla.setRowCount(0);
            for (int contador = 0; contador < listaTrabajadores.size(); contador++) {
                Object[] datos = {listaTrabajadores.get(contador).nombre, listaTrabajadores.get(contador).run, listaTrabajadores.get(contador).dv};
                tabla.addRow(datos);
            }
            borrar();
        }


    }//GEN-LAST:event_crearTrabajadorActionPerformed
    private void borrar() {

        txtNombre.setText("");
        txtRun.setText("");
        txtDv.setText("");

    }
    private void eliminarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarTrabajadorActionPerformed
        try {
            tabla.removeRow(fila);
            listaTrabajadores.remove(fila);
            tabla.setRowCount(0);
            for (int contador = 0; contador < listaTrabajadores.size(); contador++) {
                Object[] datos = {listaTrabajadores.get(contador).nombre, listaTrabajadores.get(contador).run, listaTrabajadores.get(contador).dv};
                tabla.addRow(datos);
            }
            borrar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Recuerde seleccionar fila.");
        }
    }//GEN-LAST:event_eliminarTrabajadorActionPerformed

    private void modificarTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarTrabajadorActionPerformed
        // TODO add your handling code here:
        try {
            Validaciones v = new Validaciones();

            String cambiarNombre = txtNombre.getText();

            String cambiarDv = txtDv.getText();

            String run1 = txtRun.getText();

            if (run1.equals("")) {
                run1 = "0";

            }
            int cambiarRun = Integer.parseInt(run1);

            boolean a = v.validarNombre(cambiarNombre);
            boolean b = v.validarDv(cambiarDv);
            boolean c = v.validarRun(cambiarRun);

            if (a == true && b == true && c == true) {

                listaTrabajadores.get(fila).nombre = cambiarNombre;
                listaTrabajadores.get(fila).run = cambiarRun;
                listaTrabajadores.get(fila).dv = cambiarDv;
                tabla.setRowCount(0);
                for (int contador = 0; contador < listaTrabajadores.size(); contador++) {
                    Object[] datos = {listaTrabajadores.get(contador).nombre,
                        listaTrabajadores.get(contador).run, listaTrabajadores.get(contador).dv};
                    tabla.addRow(datos);
                }
                borrar();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea modificar.");

        }


    }//GEN-LAST:event_modificarTrabajadorActionPerformed

    private void tablaTrabajadorAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tablaTrabajadorAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaTrabajadorAncestorAdded

    private void tablaTrabajadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTrabajadorMouseClicked
        // TODO add your handling code here:
        fila = tablaTrabajador.getSelectedRow();
        columna = tablaTrabajador.getColumnCount();
        txtNombre.setText(tabla.getValueAt(fila, 0).toString());
        txtRun.setText(tabla.getValueAt(fila, 1).toString());
        txtDv.setText(tabla.getValueAt(fila, 2).toString());

    }//GEN-LAST:event_tablaTrabajadorMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrabajadorGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton crearTrabajador;
    private javax.swing.JButton eliminarTrabajador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarTrabajador;
    private javax.swing.JButton salir1;
    private javax.swing.JTable tablaTrabajador;
    private javax.swing.JTextField txtDv;
    private javax.swing.JLabel txtMensaje;
    private javax.swing.JLabel txtMensaje1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRun;
    // End of variables declaration//GEN-END:variables
}
