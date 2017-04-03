/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.LogicaInicio;
import Modelo.Persona;

/**
 *
 * @author Sergi
 */
public class VentaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentaPrincipal
     */
    public VentaPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel6 = new javax.swing.JLabel();
        jNombreField = new javax.swing.JTextField();
        jApellidoField = new javax.swing.JTextField();
        jDNIField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSexoComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Trabajando = new javax.swing.JRadioButton();
        Estudiando = new javax.swing.JRadioButton();
        EnParo = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        limpiarButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jEdadField = new javax.swing.JTextField();
        jConsultarButton = new javax.swing.JButton();
        jEliminarButton = new javax.swing.JButton();
        jModificacionButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jNombreField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 80, -1));
        getContentPane().add(jApellidoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 80, -1));
        getContentPane().add(jDNIField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 80, -1));

        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setText("DNI:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jSexoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        getContentPane().add(jSexoComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));

        jLabel4.setText("Sexo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        buttonGroup1.add(Trabajando);
        Trabajando.setText("Trabajando");
        getContentPane().add(Trabajando, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        buttonGroup1.add(Estudiando);
        Estudiando.setText("Estudiando");
        Estudiando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstudiandoActionPerformed(evt);
            }
        });
        getContentPane().add(Estudiando, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        buttonGroup1.add(EnParo);
        EnParo.setText("En Paro");
        getContentPane().add(EnParo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Estado: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        Guardar.setText("Alta");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        getContentPane().add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 90, 30));

        limpiarButton.setText("Limpiar");
        limpiarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(limpiarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 90, 30));

        salirButton.setText("Salir");
        salirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirButtonActionPerformed(evt);
            }
        });
        getContentPane().add(salirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 350, 80, 30));

        jLabel7.setText("Edad:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jEdadField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEdadFieldActionPerformed(evt);
            }
        });
        getContentPane().add(jEdadField, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 156, 79, -1));

        jConsultarButton.setText("Menú de Consultas");
        getContentPane().add(jConsultarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 236, 149, 60));

        jEliminarButton.setText("Menú para Eliminar");
        jEliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEliminarButtonActionPerformed(evt);
            }
        });
        getContentPane().add(jEliminarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 66, 149, 65));

        jModificacionButton.setText("Menú para Modificar");
        getContentPane().add(jModificacionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 149, -1, 69));

        jLabel8.setText("Interfaz Gráfica de BBDD Personas");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 13, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EstudiandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstudiandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstudiandoActionPerformed

    private void salirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirButtonActionPerformed
        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_salirButtonActionPerformed

    private void limpiarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarButtonActionPerformed
        jNombreField.setText("");
        jApellidoField.setText("");
        jDNIField3.setText("");
        jEdadField.setText("");

// TODO add your handling code here:
    }//GEN-LAST:event_limpiarButtonActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed

        LogicaInicio.altaUsuario(jNombreField.getText(), jApellidoField.getText(),
                Integer.parseInt(jEdadField.getText()), jDNIField3.getText(), jSexoComboBox.getSelectedItem().toString(),
                buttonGroup1.getSelection().getActionCommand());


    }//GEN-LAST:event_GuardarActionPerformed

    private void jEdadFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEdadFieldActionPerformed


    }//GEN-LAST:event_jEdadFieldActionPerformed

    private void jEliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEliminarButtonActionPerformed
        this.dispose();
        VentanaEliminar vEliminar = new VentanaEliminar();
        vEliminar.setVisible(true);
    }//GEN-LAST:event_jEliminarButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton EnParo;
    private javax.swing.JRadioButton Estudiando;
    private javax.swing.JButton Guardar;
    private javax.swing.JRadioButton Trabajando;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField jApellidoField;
    private javax.swing.JButton jConsultarButton;
    private javax.swing.JTextField jDNIField3;
    private javax.swing.JTextField jEdadField;
    private javax.swing.JButton jEliminarButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jModificacionButton;
    private javax.swing.JTextField jNombreField;
    private javax.swing.JComboBox<String> jSexoComboBox;
    private javax.swing.JButton limpiarButton;
    private javax.swing.JButton salirButton;
    // End of variables declaration//GEN-END:variables
}
