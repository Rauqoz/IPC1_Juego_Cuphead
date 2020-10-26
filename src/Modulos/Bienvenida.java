package Modulos;

import java.awt.Color;

public class Bienvenida extends javax.swing.JFrame {

    Contador boot;

    public Bienvenida() {
        initComponents();
        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));
        boot = new Contador();
        boot.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(490, 300));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(490, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreJuego/Logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 500, 280));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PreJuego/Carga4seg.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 470, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
 public class Contador extends Thread {

        int contadorStart = 0;

        boolean ejecutar = true;

        @Override
        public void run() {

            setName("Hilo Boot");
            System.out.println(getName());
            while (ejecutar) {
                contadorStart++;
                try {
                    Thread.sleep(1000);
                    if (contadorStart == 4) {
                        Menu menu = new Menu();
                        menu.setVisible(true);
                        dispose();
                        ejecutar = false;
                        stop();

                    }
                } catch (Exception ex) {
                }

            }
        }

    }

}
