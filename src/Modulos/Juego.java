package Modulos;

import static Modulos.Configurar_Controles.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

    String ladoC = "D", agachadoC = "N", disparoC = "N", ladoDisparoC = "D", ladoPapa = "D", robotPegar = "N";
    Recursos recursos = new Recursos();
    public static int HP_E1 = 100, HP_Cuphead = 200, HP_E2 = 200, segundos = 0, minutos = 0;
    int XC, YC, vecesPapa = 0, vecesRobot = 0;
    JLabel lHP_E1 = new JLabel(String.valueOf(HP_E1));
    JLabel lHP_Cuphead = new JLabel(String.valueOf(HP_Cuphead));
    JLabel Cuphead = new JLabel(new ImageIcon(recursos.iCPD_noD));
    JLabel Papa = new JLabel(new ImageIcon(recursos.iE1A));
    JLabel Robot = new JLabel(new ImageIcon(recursos.iE2A));

    JLabel PapaM1 = new JLabel(new ImageIcon(recursos.iE1MP));
    JLabel PapaM2 = new JLabel(new ImageIcon(recursos.iE1MGI));
    JLabel RobotM1 = new JLabel(new ImageIcon(recursos.iE2MP));
    JLabel RobotM2 = new JLabel(new ImageIcon(recursos.iE2MP));
    JLabel RobotM3 = new JLabel(new ImageIcon(recursos.iE2MP));
    JLabel RobotM4 = new JLabel(new ImageIcon(recursos.iE2MP));
    JLabel RobotM5 = new JLabel(new ImageIcon(recursos.iE2MP));
    JLabel RobotM6 = new JLabel(new ImageIcon(recursos.iE2MP));

    Contador contador = new Contador();
    E1_DisparosI e1_DisparosI = new E1_DisparosI();
    E1_DisparosD e1_DisparosD = new E1_DisparosD();
    E2_Aparece e2_Aparece = new E2_Aparece();
    E2_MovimientoAR e2_MovimientoAR = new E2_MovimientoAR();
    E2_MovimientoAB e2_MovimientoAB = new E2_MovimientoAB();
    E2_MisilesP e2_MisilesP = new E2_MisilesP();
    E2_MisilesC1 e2_MisilesC1 = new E2_MisilesC1();
    E2_MisilesC2 e2_MisilesC2 = new E2_MisilesC2();
    E2_MisilesC3 e2_MisilesC3 = new E2_MisilesC3();
    E2_MisilesC4 e2_MisilesC4 = new E2_MisilesC4();
    E2_MisilesC5 e2_MisilesC5 = new E2_MisilesC5();
    E2_MisilesC6 e2_MisilesC6 = new E2_MisilesC6();

    Menu menu = new Menu();

    boolean ejE1disparos = true, ejCupheadDisparo = true, ejCambioLadoPapa = true, Cuphead_Saltando = false, Cuphead_Muere = false, E2_Vivo;

    public Juego() {
        initComponents();

        setLocationRelativeTo(null);
        setBackground(new Color(0, 0, 0, 0));

        Papa.setBounds(610, 340, 347, 257);
        Cuphead.setBounds(30, 480, 90, 120);
        Fondo.add(Cuphead);
        Fondo.add(Papa);

        new E1_Estatico().start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lHora = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textoHPEnemigo = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 600));
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lHora.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lHora.setForeground(new java.awt.Color(255, 255, 255));
        lHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lHora.setText("00");
        lHora.setFocusable(false);
        getContentPane().add(lHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 100, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("HP CUPHEAD =");
        jLabel2.setFocusable(false);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 190, 30));

        textoHPEnemigo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        textoHPEnemigo.setForeground(new java.awt.Color(0, 0, 204));
        textoHPEnemigo.setText("HP PAPA = ");
        textoHPEnemigo.setFocusable(false);
        getContentPane().add(textoHPEnemigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 150, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Nivel1.gif"))); // NOI18N
        Fondo.setFocusable(false);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
        int n = evt.getKeyCode();
        if (Cuphead_Muere == false) {
            if (n == evtMoverse_Adelante) {
                ladoC = "D";
                Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                if (disparoC.equalsIgnoreCase("S")) {
                    Cuphead.setIcon(new ImageIcon(recursos.iCPD_D));
                }
                if (!(Cuphead.getLocation().x + Cuphead.getWidth() > this.getWidth() - 25)) {
                    Cuphead.setLocation(Cuphead.getLocation().x + 5, Cuphead.getLocation().y);
                    XC = Cuphead.getLocation().x;
                    YC = Cuphead.getLocation().y;
                }
            }
            if (n == evtMoverse_Atras) {
                ladoC = "I";
                Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                if (disparoC.equalsIgnoreCase("S")) {
                    Cuphead.setIcon(new ImageIcon(recursos.iCPI_D));
                }
                if (!(Cuphead.getLocation().x <= 1)) {
                    Cuphead.setLocation(Cuphead.getLocation().x - 5, Cuphead.getLocation().y);
                    XC = Cuphead.getLocation().x;
                    YC = Cuphead.getLocation().y;
                }
            }
            if (n == evtSalto) {
                if (Cuphead_Saltando == false) {
                    new Cuphead_SaltoAR().start();
                }
            }
            if (n == evtDisparo) {
                disparoC = "N";
                if (ladoC.equalsIgnoreCase("D")) {
                    ladoDisparoC = "D";
                    Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                }
                if (ladoC.equalsIgnoreCase("I")) {
                    ladoDisparoC = "I";
                    Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                }
                if (Cuphead_Saltando == false) {
                    if (iconoDisparo1 == 1) {
                        new Cuphead_Disparos().start();
                    } else if (iconoDisparo1 == 2) {
                        new Cuphead_Disparos2().start();
                    }
                }

            }
        }
        if (n == evtDisparo2) {
            disparoC = "N";
            if (ladoC.equalsIgnoreCase("D")) {
                ladoDisparoC = "D";
                Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
            }
            if (ladoC.equalsIgnoreCase("I")) {
                ladoDisparoC = "I";
                Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
            }
            if (Cuphead_Saltando == false) {
                if (iconoDisparo2 == 1) {
                    new Cuphead_Disparos().start();
                } else if (iconoDisparo2 == 2) {
                    new Cuphead_Disparos2().start();
                }
            }

        }
        if (n == KeyEvent.VK_F1) {
            HP_Cuphead = 200;
            if (HP_E1 >= 0) {
                HP_E1 = 100;
            }
            if (HP_E2 >= 0) {
                HP_E2 = 200;
            }
            if (segundos >= 0) {
                segundos = 0;
            }
            if (minutos >= 0) {
                minutos = 0;
            }
            menu.setVisible(true);
            dispose();
        }
        if (n == KeyEvent.VK_F2) {
            if (Cuphead_Saltando == false) {
                Cuphead_Saltando = true;
                System.out.println("Modo Invencible Estatico");
            } else if (Cuphead_Saltando == true) {
                Cuphead_Saltando = false;
                System.out.println("Modo Normal");
            }
        }

    }//GEN-LAST:event_formKeyReleased

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        int n = evt.getKeyCode();
        if (Cuphead_Muere == false) {
            if (n == evtMoverse_Adelante) {
                ladoC = "D";
                Cuphead.setIcon(new ImageIcon(recursos.iCCD_noD));
                if (disparoC.equalsIgnoreCase("S")) {
                    Cuphead.setIcon(new ImageIcon(recursos.iCCD_D));

                }
                if (!(Cuphead.getLocation().x + Cuphead.getWidth() > this.getWidth() - 25)) {
                    Cuphead.setLocation(Cuphead.getLocation().x + 15, Cuphead.getLocation().y);
                    XC = Cuphead.getLocation().x;
                    YC = Cuphead.getLocation().y;
                }
            }
            if (n == evtMoverse_Atras) {
                ladoC = "I";
                Cuphead.setIcon(new ImageIcon(recursos.iCCI_noD));
                if (disparoC.equalsIgnoreCase("S")) {
                    Cuphead.setIcon(new ImageIcon(recursos.iCCI_D));
                }
                if (!(Cuphead.getLocation().x <= 1)) {
                    Cuphead.setLocation(Cuphead.getLocation().x - 15, Cuphead.getLocation().y);
                    XC = Cuphead.getLocation().x;
                    YC = Cuphead.getLocation().y;
                }
            }
            if (n == evtDisparo) {
                disparoC = "S";
                if (ladoC.equalsIgnoreCase("D")) {
                    Cuphead.setIcon(new ImageIcon(recursos.iCPD_D));
                }
                if (ladoC.equalsIgnoreCase("I")) {
                    Cuphead.setIcon(new ImageIcon(recursos.iCPI_D));
                }
            }
        }

    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lHora;
    private javax.swing.JLabel textoHPEnemigo;
    // End of variables declaration//GEN-END:variables

    public class Contador extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
                segundos += 1;
                if (segundos == 60) {
                    segundos = 1;
                    minutos += 1;
                }
                if (segundos <= 9) {
                    lHora.setText(String.valueOf(minutos) + ":0" + String.valueOf(segundos));
                } else {
                    lHora.setText(String.valueOf(minutos) + ":" + String.valueOf(segundos));
                }
            }

        }
    }

    public class E1_Estatico extends Thread {

        @Override
        public void run() {
            Cuphead_Muere = true;
            JLabel Ready = new JLabel(new ImageIcon(recursos.ready));

            Ready.setBounds(280, 190, 389, 172);
            lHP_E1.setBounds(710, 10, 150, 30);
            lHP_E1.setFont(new Font("arial", Font.BOLD, 30));
            lHP_E1.setForeground(Color.yellow);
            lHP_Cuphead.setBounds(230, 10, 150, 30);
            lHP_Cuphead.setFont(new Font("arial", Font.BOLD, 30));
            lHP_Cuphead.setForeground(Color.yellow);

            Fondo.add(lHP_E1);
            Fondo.add(lHP_Cuphead);
            Fondo.add(Ready);

            try {
                sleep(1050);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }

            Papa.setIcon(new ImageIcon(recursos.iE1PI));

            try {
                sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }

            Papa.setIcon(new ImageIcon(recursos.iE1AI));
            Ready.setVisible(false);
            e1_DisparosI.start();
            Cuphead_Muere = false;
            contador.start();
            stop();

        }

    }

    public class E1_DisparosI extends Thread {

        @Override
        public void run() {

            System.out.println("derecha");
            ladoPapa = "D";
            Fondo.add(PapaM1);
            Fondo.add(PapaM2);
            PapaM1.setBounds(Papa.getLocation().x, 550, 55, 57);
            PapaM2.setBounds(Papa.getLocation().x, 490, 55, 57);

            while (true) {
                if (ladoPapa.equalsIgnoreCase("D")) {
                    try {
                        sleep(40);

                        PapaM1.setLocation(PapaM1.getLocation().x - 10, PapaM1.getLocation().y);
                        PapaM2.setLocation(PapaM2.getLocation().x - 5, PapaM2.getLocation().y);

                        if (((PapaM1.getLocation().x) == (Cuphead.getLocation().x + Cuphead.getWidth()) || (PapaM1.getLocation().x + PapaM1.getWidth()) == (Cuphead.getLocation().x)) && Cuphead_Saltando == false) {
                            PapaM1.setLocation(Papa.getLocation().x, 550);
                            HP_Cuphead -= 20;

                            lHP_Cuphead.setText(String.valueOf(HP_Cuphead));
                            if (HP_Cuphead == 0) {
                                Cuphead_Muere = true;
                                contador.stop();
                                Cuphead.setIcon(new ImageIcon(recursos.iCF));
                                JOptionPane.showMessageDialog(null, "JAJAJAJA MAAANCOOO");
                                stop();
                            }
                            Cuphead.setIcon(new ImageIcon(recursos.iCL));
                            try {
                                sleep(500);
                                if (ladoC.equalsIgnoreCase("D")) {
                                    Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                                }
                                if (ladoC.equalsIgnoreCase("I")) {
                                    Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                                }
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if (((PapaM2.getLocation().x) == (Cuphead.getLocation().x + Cuphead.getWidth()) || (PapaM2.getLocation().x + PapaM2.getWidth()) == (Cuphead.getLocation().x)) && Cuphead_Saltando == false) {
                            PapaM2.setLocation(Papa.getLocation().x, 490);
                            HP_Cuphead -= 20;

                            lHP_Cuphead.setText(String.valueOf(HP_Cuphead));
                            if (HP_Cuphead == 0) {
                                Cuphead_Muere = true;
                                contador.stop();
                                Cuphead.setIcon(new ImageIcon(recursos.iCF));
                                JOptionPane.showMessageDialog(null, "JAJAJAJA MAAANCOOO");
                                stop();
                            }
                            Cuphead.setIcon(new ImageIcon(recursos.iCL));
                            try {
                                sleep(500);
                                if (ladoC.equalsIgnoreCase("D")) {
                                    Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                                }
                                if (ladoC.equalsIgnoreCase("I")) {
                                    Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                                }
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if (PapaM1.getLocation().x < 0) {
                            PapaM1.setLocation(Papa.getLocation().x, 550);
                        }

                        if (PapaM2.getLocation().x < 0) {
                            PapaM2.setLocation(Papa.getLocation().x, 490);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

        }

    }

    public class E1_DisparosD extends Thread {

        @Override
        public void run() {

            System.out.println("Izquierda");
            ladoPapa = "I";
            Fondo.add(PapaM1);
            Fondo.add(PapaM2);
            PapaM2.setIcon(new ImageIcon(recursos.iE1MGD));
            PapaM1.setBounds(Papa.getLocation().x + Papa.getWidth(), 550, 55, 57);
            PapaM2.setBounds(Papa.getLocation().x + Papa.getWidth(), 490, 55, 57);

            while (ejE1disparos) {

                if (ladoPapa.equalsIgnoreCase("I")) {
                    try {
                        sleep(40);

                        PapaM1.setLocation(PapaM1.getLocation().x + 10, PapaM1.getLocation().y);
                        PapaM2.setLocation(PapaM2.getLocation().x + 5, PapaM2.getLocation().y);

                        if (((PapaM1.getLocation().x) == (Cuphead.getLocation().x + Cuphead.getWidth()) || (PapaM1.getLocation().x + PapaM1.getWidth()) == (Cuphead.getLocation().x)) && Cuphead_Saltando == false) {
                            System.out.println("golpe derecha");
                            PapaM1.setBounds(Papa.getLocation().x + Papa.getWidth(), 550, 55, 57);
                            HP_Cuphead -= 20;

                            lHP_Cuphead.setText(String.valueOf(HP_Cuphead));
                            if (HP_Cuphead == 0) {
                                Cuphead_Muere = true;
                                contador.stop();
                                Cuphead.setIcon(new ImageIcon(recursos.iCF));
                                JOptionPane.showMessageDialog(null, "JAJAJAJA MAAANCOOO");
                                stop();
                            }
                            Cuphead.setIcon(new ImageIcon(recursos.iCL));
                            try {
                                sleep(500);
                                if (ladoC.equalsIgnoreCase("D")) {
                                    Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                                }
                                if (ladoC.equalsIgnoreCase("I")) {
                                    Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                                }
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if (((PapaM2.getLocation().x) == (Cuphead.getLocation().x + Cuphead.getWidth()) || (PapaM2.getLocation().x + PapaM2.getWidth()) == (Cuphead.getLocation().x)) && Cuphead_Saltando == false) {
                            System.out.println("golpe derecha");
                            PapaM2.setBounds(Papa.getLocation().x + Papa.getWidth(), 490, 55, 57);
                            HP_Cuphead -= 20;

                            lHP_Cuphead.setText(String.valueOf(HP_Cuphead));
                            if (HP_Cuphead == 0) {
                                Cuphead_Muere = true;
                                contador.stop();
                                Cuphead.setIcon(new ImageIcon(recursos.iCF));
                                JOptionPane.showMessageDialog(null, "JAJAJAJA MAAANCOOO");
                                stop();
                            }
                            Cuphead.setIcon(new ImageIcon(recursos.iCL));
                            try {
                                sleep(500);
                                if (ladoC.equalsIgnoreCase("D")) {
                                    Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                                }
                                if (ladoC.equalsIgnoreCase("I")) {
                                    Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                                }
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                        if (PapaM1.getLocation().x > 960) {
                            PapaM1.setLocation(Papa.getLocation().x + Papa.getWidth(), 550);
                        }

                        if (PapaM2.getLocation().x > 960) {
                            PapaM2.setLocation(Papa.getLocation().x + Papa.getWidth(), 490);
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

        }
    }

    public class E1_CambioLadoInicio extends Thread {

        @Override
        public void run() {

            while (true) {
                try {
                    sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
                Papa.setLocation(Papa.getLocation().x + 10, Papa.getLocation().y);
                if (Papa.getLocation().x > 960) {
                    new E1_CambioLadoFinal().start();
                    stop();
                }

            }

        }

    }

    public class E1_CambioLadoFinal extends Thread {

        @Override
        public void run() {
            Papa.setBounds(0, 340, 347, 257);
            Papa.setIcon(new ImageIcon(recursos.iE1A2));
            try {
                sleep(1050);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }

            Papa.setIcon(new ImageIcon(recursos.iE1PD));
            Cuphead.setLocation(Cuphead.getLocation().x, Cuphead.getLocation().y);

            try {
                sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }

            Papa.setIcon(new ImageIcon(recursos.iE1AD));
            e1_DisparosD.start();
            stop();

        }
    }

    public class Cuphead_Disparos extends Thread {

        @Override
        public void run() {
            JLabel CM1 = new JLabel();

            if (ladoC.equalsIgnoreCase("D")) {
                CM1.setBounds(Cuphead.getLocation().x + Cuphead.getWidth(), 520, 70, 44);
            } else if (ladoC.equalsIgnoreCase("I")) {
                CM1.setBounds(Cuphead.getLocation().x - Cuphead.getWidth(), 520, 70, 44);
            }

            while (ejCupheadDisparo) {

                if (ladoDisparoC.equalsIgnoreCase("D") && ladoPapa.equalsIgnoreCase("D")) {
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Fondo.add(CM1);
                    CM1.setIcon(new ImageIcon(recursos.iCMD));
                    CM1.setLocation(CM1.getLocation().x + 15, CM1.getLocation().y);
                    if ((CM1.getLocation().x + CM1.getWidth()) >= Papa.getLocation().x && ladoPapa.equalsIgnoreCase("D")) {
                        CM1.setBounds(Cuphead.getLocation().x + Cuphead.getWidth(), 520, 70, 44);
                        Fondo.remove(CM1);
                        if (HP_E1 > 0) {
                            HP_E1 -= 20;
                        }
                        lHP_E1.setText(String.valueOf(HP_E1));
                        if (HP_E1 <= 50) {
                            vecesPapa += 1;
                            if (vecesPapa == 1) {
                                Fondo.remove(PapaM1);
                                Fondo.remove(PapaM2);
                                Papa.setIcon(new ImageIcon(recursos.iE1PerdioI));
                                e1_DisparosI.stop();
                                new E1_CambioLadoInicio().start();
                                stop();
                            }
                        }
                        stop();

                    }

                }

                if (ladoDisparoC.equalsIgnoreCase("I") && ladoPapa.equalsIgnoreCase("I")) {
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Fondo.add(CM1);
                    CM1.setIcon(new ImageIcon(recursos.iCMI));
                    CM1.setLocation(CM1.getLocation().x - 15, CM1.getLocation().y);
                    if ((CM1.getLocation().x) <= (Papa.getLocation().x + Papa.getWidth()) && ladoPapa.equalsIgnoreCase("I")) {
                        CM1.setBounds(Cuphead.getLocation().x - Cuphead.getWidth(), 520, 70, 44);
                        Fondo.remove(CM1);
                        if (HP_E1 > 0) {
                            HP_E1 -= 20;
                        }
                        lHP_E1.setText(String.valueOf(HP_E1));
                        if (HP_E1 <= 0) {
                            Cuphead_Muere = true;
                            ladoPapa = "NO";
                            Fondo.remove(PapaM1);
                            Fondo.remove(PapaM2);
                            Fondo.remove(CM1);
                            Papa.setIcon(new ImageIcon(recursos.iE1PerdioD));
                            e1_DisparosD.stop();
                            JOptionPane.showMessageDialog(null, "LE GANASTE D: !! \nPero toca el Siguiente nivel manco :3");
                            try {
                                sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            Fondo.remove(Papa);
                            e2_Aparece.start();
                            stop();
                        }
                        stop();

                    }

                }
                if (ladoDisparoC.equalsIgnoreCase("D") && E2_Vivo == true) {
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Fondo.add(CM1);
                    CM1.setIcon(new ImageIcon(recursos.iCMD));
                    CM1.setLocation(CM1.getLocation().x + 15, CM1.getLocation().y);
                    if ((CM1.getLocation().x >= Robot.getLocation().x) && robotPegar.equalsIgnoreCase("S")) {
                        CM1.setBounds(Cuphead.getLocation().x + Cuphead.getWidth(), 520, 70, 44);
                        Fondo.remove(CM1);
                        if (HP_E2 > 0) {
                            HP_E2 -= 20;
                        }
                        lHP_E1.setText(String.valueOf(HP_E2));
                        if (HP_E2 <= 0) {
                            vecesRobot += 1;
                            if (vecesRobot == 1) {
                                Cuphead_Muere = true;
                                Fondo.remove(CM1);
                                contador.stop();
                                e2_MisilesC1.stop();
                                e2_MisilesC2.stop();
                                e2_MisilesC3.stop();
                                e2_MisilesC4.stop();
                                e2_MisilesC5.stop();
                                e2_MisilesC6.stop();
                                e2_MovimientoAR.stop();
                                e2_MovimientoAB.stop();
                                JOptionPane.showMessageDialog(null, "Ta Bien :v \nSupongamos que no estas taaaaaan Manco ");
                                HP_Cuphead = 200;
                                if (HP_E1 >= 0) {
                                    HP_E1 = 100;
                                }
                                if (HP_E2 >= 0) {
                                    HP_E2 = 200;
                                }
                                if (segundos >= 0) {
                                    segundos = 0;
                                }
                                if (minutos >= 0) {
                                    minutos = 0;
                                }
                                menu.setVisible(true);
                                dispose();
                                stop();
                            }
                        }
                        stop();

                    }

                }
                if (ladoDisparoC.equalsIgnoreCase("I") && E2_Vivo == true) {
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Fondo.add(CM1);
                    CM1.setIcon(new ImageIcon(recursos.iCMI));
                    CM1.setLocation(CM1.getLocation().x - 15, CM1.getLocation().y);
                    if (CM1.getLocation().x < 0) {
                        Fondo.remove(CM1);
                    }

                }

            }

        }

    }

    public class Cuphead_Disparos2 extends Thread {

        @Override
        public void run() {
            JLabel CM2 = new JLabel();

            if (ladoC.equalsIgnoreCase("D")) {
                CM2.setBounds(Cuphead.getLocation().x + Cuphead.getWidth(), 520, 70, 44);
            } else if (ladoC.equalsIgnoreCase("I")) {
                CM2.setBounds(Cuphead.getLocation().x - Cuphead.getWidth(), 520, 70, 44);
            }

            while (ejCupheadDisparo) {

                if (ladoDisparoC.equalsIgnoreCase("D") && ladoPapa.equalsIgnoreCase("D")) {
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Fondo.add(CM2);
                    CM2.setIcon(new ImageIcon(recursos.iCM2D));
                    CM2.setLocation(CM2.getLocation().x + 10, CM2.getLocation().y);
                    if ((CM2.getLocation().x + CM2.getWidth()) >= Papa.getLocation().x && ladoPapa.equalsIgnoreCase("D")) {
                        CM2.setBounds(Cuphead.getLocation().x + Cuphead.getWidth(), 520, 70, 44);
                        Fondo.remove(CM2);
                        if (HP_E1 > 0) {
                            HP_E1 -= 20;
                        }
                        lHP_E1.setText(String.valueOf(HP_E1));
                        if (HP_E1 <= 50) {
                            vecesPapa += 1;
                            if (vecesPapa == 1) {
                                Fondo.remove(PapaM1);
                                Fondo.remove(PapaM2);
                                Papa.setIcon(new ImageIcon(recursos.iE1PerdioI));
                                e1_DisparosI.stop();
                                new E1_CambioLadoInicio().start();
                                stop();
                            }
                        }
                        stop();

                    }

                }

                if (ladoDisparoC.equalsIgnoreCase("I") && ladoPapa.equalsIgnoreCase("I")) {
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Fondo.add(CM2);
                    CM2.setIcon(new ImageIcon(recursos.iCM2I));
                    CM2.setLocation(CM2.getLocation().x - 10, CM2.getLocation().y);
                    if ((CM2.getLocation().x) <= (Papa.getLocation().x + Papa.getWidth()) && ladoPapa.equalsIgnoreCase("I")) {
                        CM2.setBounds(Cuphead.getLocation().x - Cuphead.getWidth(), 520, 70, 44);
                        Fondo.remove(CM2);
                        if (HP_E1 > 0) {
                            HP_E1 -= 20;
                        }
                        lHP_E1.setText(String.valueOf(HP_E1));
                        if (HP_E1 <= 0) {
                            Cuphead_Muere = true;
                            ladoPapa = "NO";
                            Fondo.remove(PapaM1);
                            Fondo.remove(PapaM2);
                            Fondo.remove(CM2);
                            Papa.setIcon(new ImageIcon(recursos.iE1PerdioD));
                            e1_DisparosD.stop();
                            JOptionPane.showMessageDialog(null, "LE GANASTE D: !! \nPero toca el Siguiente nivel manco :3");
                            try {
                                sleep(500);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            Fondo.remove(Papa);
                            e2_Aparece.start();
                            stop();
                        }
                        stop();

                    }

                }
                if (ladoDisparoC.equalsIgnoreCase("D") && E2_Vivo == true) {
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Fondo.add(CM2);
                    CM2.setIcon(new ImageIcon(recursos.iCM2D));
                    CM2.setLocation(CM2.getLocation().x + 10, CM2.getLocation().y);
                    if ((CM2.getLocation().x >= Robot.getLocation().x) && robotPegar.equalsIgnoreCase("S")) {
                        CM2.setBounds(Cuphead.getLocation().x + Cuphead.getWidth(), 520, 70, 44);
                        Fondo.remove(CM2);
                        if (HP_E2 > 0) {
                            HP_E2 -= 20;
                        }
                        lHP_E1.setText(String.valueOf(HP_E2));
                        if (HP_E2 <= 0) {
                            vecesRobot += 1;
                            if (vecesRobot == 1) {
                                Cuphead_Muere = true;
                                Fondo.remove(CM2);
                                contador.stop();
                                e2_MisilesC1.stop();
                                e2_MisilesC2.stop();
                                e2_MisilesC3.stop();
                                e2_MisilesC4.stop();
                                e2_MisilesC5.stop();
                                e2_MisilesC6.stop();
                                e2_MovimientoAR.stop();
                                e2_MovimientoAB.stop();
                                JOptionPane.showMessageDialog(null, "Ta Bien :v \nSupongamos que no estas taaaaaan Manco ");
                                HP_Cuphead = 200;
                                if (HP_E1 >= 0) {
                                    HP_E1 = 100;
                                }
                                if (HP_E2 >= 0) {
                                    HP_E2 = 200;
                                }
                                if (segundos >= 0) {
                                    segundos = 0;
                                }
                                if (minutos >= 0) {
                                    minutos = 0;
                                }
                                menu.setVisible(true);
                                dispose();
                                stop();
                            }
                        }
                        stop();

                    }

                }
                if (ladoDisparoC.equalsIgnoreCase("I") && E2_Vivo == true) {
                    try {
                        sleep(40);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Fondo.add(CM2);
                    CM2.setIcon(new ImageIcon(recursos.iCM2I));
                    CM2.setLocation(CM2.getLocation().x - 10, CM2.getLocation().y);
                    if (CM2.getLocation().x < 0) {
                        Fondo.remove(CM2);
                    }

                }

            }

        }

    }

    public class Cuphead_SaltoAR extends Thread {

        @Override
        public void run() {

            while (true) {
                Cuphead_Saltando = true;

                if (ladoC.equalsIgnoreCase("D")) {
                    Cuphead.setIcon(new ImageIcon(recursos.iCSD));
                }
                if (ladoC.equalsIgnoreCase("I")) {
                    Cuphead.setIcon(new ImageIcon(recursos.iCSI));
                }
                try {
                    sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }

                Cuphead.setLocation(Cuphead.getLocation().x, Cuphead.getLocation().y - 15);

                if (Cuphead.getLocation().y <= 330) {
                    new Cuphead_SaltoAB().start();
                    stop();
                }

            }

        }
    }

    public class Cuphead_SaltoAB extends Thread {

        @Override
        public void run() {

            while (true) {
                Cuphead_Saltando = true;
                if (ladoC.equalsIgnoreCase("D")) {
                    Cuphead.setIcon(new ImageIcon(recursos.iCSD));
                }
                if (ladoC.equalsIgnoreCase("I")) {
                    Cuphead.setIcon(new ImageIcon(recursos.iCSI));
                }
                try {
                    sleep(50);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }

                Cuphead.setLocation(Cuphead.getLocation().x, Cuphead.getLocation().y + 15);

                if (Cuphead.getLocation().y >= 480) {
                    if (ladoC.equalsIgnoreCase("D")) {
                        Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                    }
                    if (ladoC.equalsIgnoreCase("I")) {
                        Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                    }
                    Cuphead_Saltando = false;
                    stop();
                }

            }

        }
    }

    public class E2_Aparece extends Thread {

        @Override
        public void run() {
            Robot.setBounds(800, 370, 160, 228);
            E2_Vivo = true;
            textoHPEnemigo.setText("HP Robot = ");
            lHP_E1.setText(String.valueOf(HP_E2));

            Fondo.add(Robot);
            e2_MisilesP.start();

            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            Robot.setIcon(new ImageIcon(recursos.iE2P));
            boolean ejecutar = true;
            while (ejecutar) {
                try {
                    sleep(40);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
                Robot.setLocation(Robot.getLocation().x, Robot.getLocation().y - 15);
                if (Robot.getLocation().y <= 170) {
                    ejecutar = false;
                    Robot.setIcon(new ImageIcon(recursos.iE2Ataca));
                    Cuphead_Muere = false;
                    e2_MovimientoAR.start();
                    stop();
                }
            }

        }
    }

    public class E2_MovimientoAR extends Thread {

        @Override
        public void run() {
            while (true) {

                try {
                    sleep(40);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
                Robot.setLocation(Robot.getLocation().x, Robot.getLocation().y - 10);
                if (Robot.getLocation().y < 310) {
                    robotPegar = "N";
                }

                if (Robot.getLocation().y <= 50) {
                    if (e2_MovimientoAB.isAlive()) {
                        e2_MovimientoAB.resume();
                    } else {
                        e2_MovimientoAB.start();
                    }

                    suspend();
                }

            }

        }
    }

    public class E2_MovimientoAB extends Thread {

        @Override
        public void run() {
            while (true) {
                try {
                    sleep(40);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
                Robot.setLocation(Robot.getLocation().x, Robot.getLocation().y + 10);
                if (Robot.getLocation().y >= 310) {
                    robotPegar = "S";
                }
                if (Robot.getLocation().y >= 370) {
                    e2_MovimientoAR.resume();
                    suspend();
                }

            }

        }
    }

    public class E2_MisilesP extends Thread {

        @Override
        public void run() {

            RobotM1.setBounds(890, 50, 72, 86);
            RobotM2.setBounds(890, 50, 72, 86);
            RobotM3.setBounds(890, 50, 72, 86);
            RobotM4.setBounds(890, 50, 72, 86);
            RobotM5.setBounds(890, 50, 72, 86);
            RobotM6.setBounds(890, 50, 72, 86);

            Fondo.add(RobotM1);
            Fondo.add(RobotM2);
            Fondo.add(RobotM3);
            Fondo.add(RobotM4);
            Fondo.add(RobotM5);
            Fondo.add(RobotM6);

            while (true) {
                try {
                    sleep(40);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (RobotM1.getLocation().x > 20) {
                    RobotM1.setLocation(RobotM1.getLocation().x - 15, RobotM1.getLocation().y);
                }
                if (RobotM2.getLocation().x > 140) {
                    RobotM2.setLocation(RobotM2.getLocation().x - 15, RobotM2.getLocation().y);
                }
                if (RobotM3.getLocation().x > 270) {
                    RobotM3.setLocation(RobotM3.getLocation().x - 15, RobotM3.getLocation().y);
                }
                if (RobotM4.getLocation().x > 390) {
                    RobotM4.setLocation(RobotM4.getLocation().x - 15, RobotM4.getLocation().y);
                }
                if (RobotM5.getLocation().x > 520) {
                    RobotM5.setLocation(RobotM5.getLocation().x - 15, RobotM5.getLocation().y);
                }
                if (RobotM6.getLocation().x > 660) {
                    RobotM6.setLocation(RobotM6.getLocation().x - 15, RobotM6.getLocation().y);
                }
                if (RobotM1.getLocation().x <= 20 && RobotM2.getLocation().x <= 140 && RobotM3.getLocation().x <= 270 && RobotM4.getLocation().x <= 390 && RobotM5.getLocation().x <= 520 && RobotM6.getLocation().x <= 660) {
                    System.out.println("Listos Misiles");
                    e2_MisilesC1.start();
                    e2_MisilesC2.start();
                    e2_MisilesC3.start();
                    e2_MisilesC4.start();
                    e2_MisilesC5.start();
                    e2_MisilesC6.start();

                    stop();
                }

            }

        }

    }

    public class E2_MisilesC1 extends Thread {

        @Override
        public void run() {
            RobotM1.setIcon(new ImageIcon(recursos.iE2MC));

            while (true) {
                try {
                    sleep(40);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
                RobotM1.setLocation(RobotM1.getLocation().x, RobotM1.getLocation().y + 10);

                if ((Cuphead.getLocation().x <= 92 && Cuphead.getLocation().x >= 0) && (RobotM1.getLocation().y + RobotM1.getHeight()) >= Cuphead.getLocation().y && Cuphead_Saltando == false) {
                    RobotM1.setBounds(20, 0, 72, 86);
                    HP_Cuphead -= 20;

                    lHP_Cuphead.setText(String.valueOf(HP_Cuphead));
                    if (HP_Cuphead == 0) {
                        Cuphead_Muere = true;
                        contador.stop();
                        Cuphead.setIcon(new ImageIcon(recursos.iCF));

                        e2_MisilesC2.stop();
                        e2_MisilesC3.stop();
                        e2_MisilesC4.stop();
                        e2_MisilesC5.stop();
                        e2_MisilesC6.stop();
                        e2_MovimientoAR.stop();
                        e2_MovimientoAB.stop();
                        JOptionPane.showMessageDialog(null, "JAJAJAJA MAAANCOOO");
                        stop();
                    }
                    Cuphead.setIcon(new ImageIcon(recursos.iCL));
                    try {
                        sleep(500);
                        if (ladoC.equalsIgnoreCase("D")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                        }
                        if (ladoC.equalsIgnoreCase("I")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Le Pego el 1");

                }
                if (RobotM1.getLocation().y > 600) {
                    RobotM1.setBounds(20, 0, 72, 86);
                }

            }

        }
    }

    public class E2_MisilesC2 extends Thread {

        @Override
        public void run() {
            RobotM2.setIcon(new ImageIcon(recursos.iE2MC));

            while (true) {
                try {
                    sleep(40);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
                RobotM2.setLocation(RobotM2.getLocation().x, RobotM2.getLocation().y + 10);

                if ((Cuphead.getLocation().x <= 212 && Cuphead.getLocation().x >= 130) && (RobotM2.getLocation().y + RobotM2.getHeight()) >= Cuphead.getLocation().y && Cuphead_Saltando == false) {
                    RobotM2.setBounds(140, 0, 72, 86);
                    HP_Cuphead -= 20;

                    lHP_Cuphead.setText(String.valueOf(HP_Cuphead));
                    if (HP_Cuphead == 0) {
                        Cuphead_Muere = true;
                        contador.stop();
                        Cuphead.setIcon(new ImageIcon(recursos.iCF));

                        e2_MisilesC1.stop();
                        e2_MisilesC3.stop();
                        e2_MisilesC4.stop();
                        e2_MisilesC5.stop();
                        e2_MisilesC6.stop();
                        e2_MovimientoAR.stop();
                        e2_MovimientoAB.stop();
                        JOptionPane.showMessageDialog(null, "JAJAJAJA MAAANCOOO");
                        stop();
                    }
                    Cuphead.setIcon(new ImageIcon(recursos.iCL));
                    try {
                        sleep(500);
                        if (ladoC.equalsIgnoreCase("D")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                        }
                        if (ladoC.equalsIgnoreCase("I")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Le Pego el 2");

                }
                if (RobotM2.getLocation().y > 600) {
                    RobotM2.setBounds(140, 0, 72, 86);
                }

            }

        }
    }

    public class E2_MisilesC3 extends Thread {

        @Override
        public void run() {
            RobotM3.setIcon(new ImageIcon(recursos.iE2MC));

            while (true) {
                try {
                    sleep(40);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
                RobotM3.setLocation(RobotM3.getLocation().x, RobotM3.getLocation().y + 10);

                if ((Cuphead.getLocation().x <= 342 && Cuphead.getLocation().x >= 260) && (RobotM3.getLocation().y + RobotM3.getHeight()) >= Cuphead.getLocation().y && Cuphead_Saltando == false) {
                    RobotM3.setBounds(270, 0, 72, 86);
                    HP_Cuphead -= 20;

                    lHP_Cuphead.setText(String.valueOf(HP_Cuphead));
                    if (HP_Cuphead == 0) {
                        Cuphead_Muere = true;
                        contador.stop();
                        Cuphead.setIcon(new ImageIcon(recursos.iCF));

                        e2_MisilesC1.stop();
                        e2_MisilesC2.stop();
                        e2_MisilesC4.stop();
                        e2_MisilesC5.stop();
                        e2_MisilesC6.stop();
                        e2_MovimientoAR.stop();
                        e2_MovimientoAB.stop();
                        JOptionPane.showMessageDialog(null, "JAJAJAJA MAAANCOOO");
                        stop();
                    }
                    Cuphead.setIcon(new ImageIcon(recursos.iCL));
                    try {
                        sleep(500);
                        if (ladoC.equalsIgnoreCase("D")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                        }
                        if (ladoC.equalsIgnoreCase("I")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Le Pego el 3");

                }
                if (RobotM3.getLocation().y > 600) {
                    RobotM3.setBounds(270, 0, 72, 86);
                }

            }

        }
    }

    public class E2_MisilesC4 extends Thread {

        @Override
        public void run() {
            RobotM4.setIcon(new ImageIcon(recursos.iE2MC));

            while (true) {
                try {
                    sleep(40);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
                RobotM4.setLocation(RobotM4.getLocation().x, RobotM4.getLocation().y + 10);

                if ((Cuphead.getLocation().x <= 462 && Cuphead.getLocation().x >= 380) && (RobotM4.getLocation().y + RobotM4.getHeight()) >= Cuphead.getLocation().y && Cuphead_Saltando == false) {
                    RobotM4.setBounds(390, 0, 72, 86);
                    HP_Cuphead -= 20;

                    lHP_Cuphead.setText(String.valueOf(HP_Cuphead));
                    if (HP_Cuphead == 0) {
                        Cuphead_Muere = true;
                        contador.stop();
                        Cuphead.setIcon(new ImageIcon(recursos.iCF));

                        e2_MisilesC1.stop();
                        e2_MisilesC2.stop();
                        e2_MisilesC3.stop();
                        e2_MisilesC5.stop();
                        e2_MisilesC6.stop();
                        e2_MovimientoAR.stop();
                        e2_MovimientoAB.stop();
                        JOptionPane.showMessageDialog(null, "JAJAJAJA MAAANCOOO");
                        stop();
                    }
                    Cuphead.setIcon(new ImageIcon(recursos.iCL));
                    try {
                        sleep(500);
                        if (ladoC.equalsIgnoreCase("D")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                        }
                        if (ladoC.equalsIgnoreCase("I")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Le Pego el 4");

                }
                if (RobotM4.getLocation().y > 600) {
                    RobotM4.setBounds(390, 0, 72, 86);
                }

            }

        }
    }

    public class E2_MisilesC5 extends Thread {

        @Override
        public void run() {
            RobotM5.setIcon(new ImageIcon(recursos.iE2MC));

            while (true) {
                try {
                    sleep(40);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
                RobotM5.setLocation(RobotM5.getLocation().x, RobotM5.getLocation().y + 10);

                if ((Cuphead.getLocation().x <= 592 && Cuphead.getLocation().x >= 510) && (RobotM5.getLocation().y + RobotM5.getHeight()) >= Cuphead.getLocation().y && Cuphead_Saltando == false) {
                    RobotM5.setBounds(520, 0, 72, 86);
                    HP_Cuphead -= 20;

                    lHP_Cuphead.setText(String.valueOf(HP_Cuphead));
                    if (HP_Cuphead == 0) {
                        Cuphead_Muere = true;
                        contador.stop();
                        Cuphead.setIcon(new ImageIcon(recursos.iCF));

                        e2_MisilesC1.stop();
                        e2_MisilesC2.stop();
                        e2_MisilesC3.stop();
                        e2_MisilesC4.stop();
                        e2_MisilesC6.stop();
                        e2_MovimientoAR.stop();
                        e2_MovimientoAB.stop();
                        JOptionPane.showMessageDialog(null, "JAJAJAJA MAAANCOOO");
                        stop();
                    }
                    Cuphead.setIcon(new ImageIcon(recursos.iCL));
                    try {
                        sleep(500);
                        if (ladoC.equalsIgnoreCase("D")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                        }
                        if (ladoC.equalsIgnoreCase("I")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Le Pego el 5");

                }
                if (RobotM5.getLocation().y > 600) {
                    RobotM5.setBounds(520, 0, 72, 86);
                }

            }

        }
    }

    public class E2_MisilesC6 extends Thread {

        @Override
        public void run() {
            RobotM6.setIcon(new ImageIcon(recursos.iE2MC));

            while (true) {
                try {
                    sleep(40);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                }
                RobotM6.setLocation(RobotM6.getLocation().x, RobotM6.getLocation().y + 10);

                if ((Cuphead.getLocation().x <= 732 && Cuphead.getLocation().x >= 650) && (RobotM6.getLocation().y + RobotM6.getHeight()) >= Cuphead.getLocation().y && Cuphead_Saltando == false) {
                    RobotM6.setBounds(660, 0, 72, 86);
                    HP_Cuphead -= 20;

                    lHP_Cuphead.setText(String.valueOf(HP_Cuphead));
                    if (HP_Cuphead == 0) {
                        Cuphead_Muere = true;
                        contador.stop();
                        Cuphead.setIcon(new ImageIcon(recursos.iCF));

                        e2_MisilesC1.stop();
                        e2_MisilesC2.stop();
                        e2_MisilesC3.stop();
                        e2_MisilesC4.stop();
                        e2_MisilesC5.stop();
                        e2_MovimientoAR.stop();
                        e2_MovimientoAB.stop();
                        JOptionPane.showMessageDialog(null, "JAJAJAJA MAAANCOOO");
                        stop();
                    }
                    Cuphead.setIcon(new ImageIcon(recursos.iCL));
                    try {
                        sleep(500);
                        if (ladoC.equalsIgnoreCase("D")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPD_noD));
                        }
                        if (ladoC.equalsIgnoreCase("I")) {
                            Cuphead.setIcon(new ImageIcon(recursos.iCPI_noD));
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    System.out.println("Le Pego el 6");

                }
                if (RobotM6.getLocation().y > 600) {
                    RobotM6.setBounds(660, 0, 72, 86);
                }

            }

        }
    }

}
