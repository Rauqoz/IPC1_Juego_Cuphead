package Modulos;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Configurar_Controles extends javax.swing.JFrame {

    boolean eMoverse_Adelante = false, eMoverse_Atras = false, eSalto = false, eDisparo1 = false, eDisparo2 = false;
    public static int evtMoverse_Adelante = 0, evtMoverse_Atras = 0, evtSalto = 0, evtDisparo = 0, evtDisparo2 = 0, iconoDisparo1 = 0, iconoDisparo2 = 0;

    public Configurar_Controles() {
        initComponents();
        setLocationRelativeTo(null);

        ImageIcon fondo = new ImageIcon(getClass().getResource("/Recursos/Fondo_Configurar.jpg"));
        Icon rfondo = new ImageIcon(fondo.getImage().getScaledInstance(lFondo.getWidth(), lFondo.getHeight(), Image.SCALE_DEFAULT));
        lFondo.setIcon(rfondo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tDisparo2 = new javax.swing.JTextField();
        tDisparo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tMoverse_Adelante = new javax.swing.JTextField();
        tMoverse_Atras = new javax.swing.JTextField();
        tSalto = new javax.swing.JTextField();
        cDisparo1 = new javax.swing.JComboBox<>();
        cDisparo2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tDisparo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tDisparo2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tDisparo2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tDisparo2.setEnabled(false);
        tDisparo2.setFocusable(false);
        tDisparo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDisparo2MouseClicked(evt);
            }
        });
        tDisparo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDisparo2ActionPerformed(evt);
            }
        });
        getContentPane().add(tDisparo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 140, -1));

        tDisparo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tDisparo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tDisparo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tDisparo.setEnabled(false);
        tDisparo.setFocusable(false);
        tDisparo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tDisparoMouseClicked(evt);
            }
        });
        tDisparo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tDisparoActionPerformed(evt);
            }
        });
        getContentPane().add(tDisparo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 140, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Disparo 1");
        jLabel10.setFocusable(false);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Configurar Controles");
        jLabel1.setFocusable(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 335, 56));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Moverse Adelante");
        jLabel2.setFocusable(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Moverse Atras");
        jLabel3.setFocusable(false);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Salto");
        jLabel4.setFocusable(false);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Disparo 2");
        jLabel5.setFocusable(false);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Disparo 1");
        jLabel6.setFocusable(false);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Disparo 2");
        jLabel7.setFocusable(false);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        tMoverse_Adelante.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tMoverse_Adelante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tMoverse_Adelante.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tMoverse_Adelante.setEnabled(false);
        tMoverse_Adelante.setFocusable(false);
        tMoverse_Adelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMoverse_AdelanteMouseClicked(evt);
            }
        });
        tMoverse_Adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMoverse_AdelanteActionPerformed(evt);
            }
        });
        tMoverse_Adelante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tMoverse_AdelanteKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tMoverse_AdelanteKeyReleased(evt);
            }
        });
        getContentPane().add(tMoverse_Adelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 140, -1));

        tMoverse_Atras.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tMoverse_Atras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tMoverse_Atras.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tMoverse_Atras.setEnabled(false);
        tMoverse_Atras.setFocusable(false);
        tMoverse_Atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tMoverse_AtrasMouseClicked(evt);
            }
        });
        tMoverse_Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tMoverse_AtrasActionPerformed(evt);
            }
        });
        getContentPane().add(tMoverse_Atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 140, -1));

        tSalto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tSalto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tSalto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        tSalto.setEnabled(false);
        tSalto.setFocusable(false);
        tSalto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tSaltoMouseClicked(evt);
            }
        });
        tSalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tSaltoActionPerformed(evt);
            }
        });
        getContentPane().add(tSalto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 140, -1));

        cDisparo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cDisparo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puño", "Bala" }));
        cDisparo1.setSelectedItem(null);
        cDisparo1.setFocusable(false);
        cDisparo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cDisparo1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cDisparo1KeyTyped(evt);
            }
        });
        getContentPane().add(cDisparo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 140, -1));

        cDisparo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cDisparo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Puño", "Bala" }));
        cDisparo2.setSelectedItem(null);
        cDisparo2.setFocusable(false);
        cDisparo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cDisparo2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cDisparo2KeyTyped(evt);
            }
        });
        getContentPane().add(cDisparo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 140, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/CPI_noDamage.gif"))); // NOI18N
        jLabel9.setFocusable(false);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 90, 120));

        jButton2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, 120, 50));

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Aceptar");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 120, 50));

        lFondo.setFocusable(false);
        getContentPane().add(lFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tMoverse_AdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMoverse_AdelanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMoverse_AdelanteActionPerformed

    private void tMoverse_AtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tMoverse_AtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tMoverse_AtrasActionPerformed

    private void tSaltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tSaltoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tSaltoActionPerformed

    private void tMoverse_AdelanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMoverse_AdelanteMouseClicked
        // TODO add your handling code here:
        eMoverse_Adelante = true;
        System.out.println("entra");

    }//GEN-LAST:event_tMoverse_AdelanteMouseClicked

    private void tMoverse_AdelanteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tMoverse_AdelanteKeyPressed
        // TODO add your handling code here:


    }//GEN-LAST:event_tMoverse_AdelanteKeyPressed

    private void tMoverse_AdelanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tMoverse_AdelanteKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tMoverse_AdelanteKeyReleased

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
        int codigo = evt.getKeyCode();
        String tecla = String.valueOf(evt.getKeyChar());
        if (eMoverse_Adelante == true) {
            System.out.println("Codigo " + String.valueOf(codigo) + " Tecla " + tecla);
            tMoverse_Adelante.setText(tecla);
            evtMoverse_Adelante = codigo;
            eMoverse_Adelante = false;
        }
        if (eMoverse_Atras == true) {
            System.out.println("Codigo " + String.valueOf(codigo) + " Tecla " + tecla);
            tMoverse_Atras.setText(tecla);
            evtMoverse_Atras = codigo;
            eMoverse_Atras = false;
        }
        if (eSalto == true) {
            System.out.println("Codigo " + String.valueOf(codigo) + " Tecla " + tecla);
            tSalto.setText(tecla);
            evtSalto = codigo;
            eSalto = false;
        }
        if (eDisparo1 == true) {
            System.out.println("Codigo " + String.valueOf(codigo) + " Tecla " + tecla);
            tDisparo.setText(tecla);
            evtDisparo = codigo;
            eDisparo1 = false;
        }
        if (eDisparo2 == true) {
            System.out.println("Codigo " + String.valueOf(codigo) + " Tecla " + tecla);
            tDisparo2.setText(tecla);
            evtDisparo2 = codigo;
            eDisparo2 = false;
        }
    }//GEN-LAST:event_formKeyReleased

    private void tMoverse_AtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tMoverse_AtrasMouseClicked
        // TODO add your handling code here:
        eMoverse_Atras = true;
    }//GEN-LAST:event_tMoverse_AtrasMouseClicked

    private void tSaltoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tSaltoMouseClicked
        // TODO add your handling code here:
        eSalto = true;
    }//GEN-LAST:event_tSaltoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (tMoverse_Adelante.getText().isEmpty() || tMoverse_Atras.getText().isEmpty() || tSalto.getText().isEmpty() || tDisparo.getText().isEmpty()) {
            evtMoverse_Adelante = 0;
            evtDisparo = 0;
            evtMoverse_Atras = 0;
            evtSalto = 0;
        }

        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (tMoverse_Adelante.getText().isEmpty() || tMoverse_Atras.getText().isEmpty() || tSalto.getText().isEmpty() || tDisparo.getText().isEmpty() || cDisparo1.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(null, "Faltan Teclas");
        } else {
            if (cDisparo1.getSelectedItem().equals("Puño")) {
                iconoDisparo1 = 1;
                iconoDisparo2 = 2;
                cDisparo2.setSelectedItem("Bala");
            }
            if (cDisparo1.getSelectedItem().equals("Bala")) {
                iconoDisparo1 = 2;
                iconoDisparo2 = 1;
                cDisparo2.setSelectedItem("Puño");
            }
            JOptionPane.showMessageDialog(null, "Guardado");
            Menu menu = new Menu();
            menu.setVisible(true);
            dispose();
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void tDisparoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDisparoMouseClicked
        // TODO add your handling code here:
        eDisparo1 = true;
    }//GEN-LAST:event_tDisparoMouseClicked

    private void tDisparoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDisparoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDisparoActionPerformed

    private void tDisparo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tDisparo2MouseClicked
        // TODO add your handling code here:
        eDisparo2 = true;
    }//GEN-LAST:event_tDisparo2MouseClicked

    private void tDisparo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tDisparo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tDisparo2ActionPerformed

    private void cDisparo1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDisparo1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cDisparo1KeyReleased

    private void cDisparo2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDisparo2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cDisparo2KeyReleased

    private void cDisparo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDisparo1KeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_cDisparo1KeyTyped

    private void cDisparo2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cDisparo2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cDisparo2KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cDisparo1;
    private javax.swing.JComboBox<String> cDisparo2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lFondo;
    private javax.swing.JTextField tDisparo;
    private javax.swing.JTextField tDisparo2;
    private javax.swing.JTextField tMoverse_Adelante;
    private javax.swing.JTextField tMoverse_Atras;
    private javax.swing.JTextField tSalto;
    // End of variables declaration//GEN-END:variables

}
