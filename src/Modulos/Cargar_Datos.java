package Modulos;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Cargar_Datos extends javax.swing.JFrame {

    JFileChooser escoger;
    File archivo;
    String extension = ".cuphead", tipo = "cuphead", parametro = "cuphead";
    String titulos[] = {"Tipo", "Nombre", "Nivel", "Frecuencia", "Velocidad", "Daño", "Rutaimagen"};
    DefaultTableModel modelo = new DefaultTableModel();

    public Cargar_Datos() {
        initComponents();
        setLocationRelativeTo(null);

        ImageIcon fondo = new ImageIcon(getClass().getResource("/Recursos/Fondo_Configurar.jpg"));
        Icon rfondo = new ImageIcon(fondo.getImage().getScaledInstance(lFondo2.getWidth(), lFondo2.getHeight(), Image.SCALE_DEFAULT));
        lFondo2.setIcon(rfondo);

        modelo.setColumnCount(titulos.length);
        modelo.setColumnIdentifiers(titulos);
        tDatos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bCargar = new javax.swing.JButton();
        bRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tDatos = new javax.swing.JTable();
        lFondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bCargar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bCargar.setText("Cargar Datos");
        bCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCargarActionPerformed(evt);
            }
        });
        getContentPane().add(bCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 60));

        bRegresar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        bRegresar.setText("Regresar");
        bRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(bRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 130, 60));

        tDatos.setEnabled(false);
        jScrollPane1.setViewportView(tDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 700, 200));
        getContentPane().add(lFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegresarActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_bRegresarActionPerformed

    private void bCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCargarActionPerformed
        // TODO add your handling code here:

        System.out.println("abrir");

        escoger = new JFileChooser();
        escoger.setApproveButtonText("Abrir");
        escoger.setFileFilter(new FileNameExtensionFilter(tipo, parametro));
        int a = escoger.showOpenDialog(null);
        if (a == JFileChooser.APPROVE_OPTION) {
            archivo = new File(escoger.getSelectedFile().toString());
            try {
                BufferedReader lector = new BufferedReader(new FileReader(archivo));
                String fila = "";
                int columnas = 0;
                while ((fila = lector.readLine()) != null) {
                    System.out.println("muestra tabla");
                    columnas += 1;
                    String resultado[] = fila.split("\\$\\$");
                    modelo.setRowCount(columnas);
                    tDatos.setValueAt(resultado[0], columnas - 1, 0);
                    tDatos.setValueAt(resultado[1], columnas - 1, 1);
                    tDatos.setValueAt(resultado[2], columnas - 1, 2);
                    tDatos.setValueAt(resultado[3], columnas - 1, 3);
                    tDatos.setValueAt(resultado[4], columnas - 1, 4);
                    tDatos.setValueAt(resultado[5], columnas - 1, 5);
                    tDatos.setValueAt(resultado[6], columnas - 1, 6);

                }

            } catch (Exception ex) {
            }

        }


    }//GEN-LAST:event_bCargarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCargar;
    private javax.swing.JButton bRegresar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lFondo2;
    private javax.swing.JTable tDatos;
    // End of variables declaration//GEN-END:variables
}
