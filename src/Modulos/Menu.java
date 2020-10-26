package Modulos;

import static Modulos.Configurar_Controles.*;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lMenu = new javax.swing.JLabel();
        bConfigurarControles = new javax.swing.JButton();
        bCargarDatos = new javax.swing.JButton();
        bSalir = new javax.swing.JButton();
        bIniciarJuego = new javax.swing.JButton();
        lFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lMenu.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        lMenu.setForeground(new java.awt.Color(255, 255, 0));
        lMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMenu.setText("Menu");
        getContentPane().add(lMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 100, 40));

        bConfigurarControles.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bConfigurarControles.setMnemonic('c');
        bConfigurarControles.setText("Configurar Controles");
        bConfigurarControles.setBorder(null);
        bConfigurarControles.setBorderPainted(false);
        bConfigurarControles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bConfigurarControles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConfigurarControlesActionPerformed(evt);
            }
        });
        getContentPane().add(bConfigurarControles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 260, 40));

        bCargarDatos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bCargarDatos.setMnemonic('d');
        bCargarDatos.setText("Cargar Datos");
        bCargarDatos.setBorder(null);
        bCargarDatos.setBorderPainted(false);
        bCargarDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCargarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(bCargarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 170, 40));

        bSalir.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bSalir.setMnemonic('s');
        bSalir.setText("Salir");
        bSalir.setBorder(null);
        bSalir.setBorderPainted(false);
        bSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalirActionPerformed(evt);
            }
        });
        getContentPane().add(bSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 170, 40));

        bIniciarJuego.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        bIniciarJuego.setMnemonic('i');
        bIniciarJuego.setText("Iniciar Juego");
        bIniciarJuego.setBorder(null);
        bIniciarJuego.setBorderPainted(false);
        bIniciarJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bIniciarJuego.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bIniciarJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(bIniciarJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 170, 40));

        lFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_Menu.png"))); // NOI18N
        getContentPane().add(lFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalirActionPerformed
        dispose();
    }//GEN-LAST:event_bSalirActionPerformed

    private void bIniciarJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarJuegoActionPerformed
        // TODO add your handling code here:
        if (evtDisparo == 0 || evtMoverse_Adelante == 0 || evtMoverse_Atras == 0 || evtSalto == 0 || evtDisparo2 == 0) {
            JOptionPane.showMessageDialog(null, "Falta Configurar Teclas");
        } else {
            new Juego().setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_bIniciarJuegoActionPerformed

    private void bConfigurarControlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConfigurarControlesActionPerformed
        // TODO add your handling code here:
        new Configurar_Controles().setVisible(true);
        dispose();
    }//GEN-LAST:event_bConfigurarControlesActionPerformed

    private void bCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCargarDatosActionPerformed
        // TODO add your handling code here:
        new Cargar_Datos().setVisible(true);
        dispose();
    }//GEN-LAST:event_bCargarDatosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCargarDatos;
    private javax.swing.JButton bConfigurarControles;
    private javax.swing.JButton bIniciarJuego;
    private javax.swing.JButton bSalir;
    private javax.swing.JLabel lFondo;
    private javax.swing.JLabel lMenu;
    // End of variables declaration//GEN-END:variables
}
