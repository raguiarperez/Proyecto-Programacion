package Interfaz.Taller;

import Interfaz.Interfaz;
import Utilidades.ComprobarString;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafa2
 */
public class IntAccesoTaller extends javax.swing.JFrame {

    /**
     * Creates new form InterfazTaller
     */
    

    
    
    
    
    public IntAccesoTaller() {
        initComponents();
        jProgressBar1.setVisible(false);

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
        jTextDNI = new javax.swing.JTextField();
        jLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtContinuar = new javax.swing.JButton();
        PanelSair = new javax.swing.JPanel();
        jSair1 = new javax.swing.JLabel();
        BtMenuPrincipal = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));

        jLabel1.setBackground(new java.awt.Color(0, 102, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("DNI :");

        jTextDNI.setForeground(new java.awt.Color(0, 102, 204));
        jTextDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jTextDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDNIActionPerformed(evt);
            }
        });
        jTextDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextDNIKeyPressed(evt);
            }
        });

        jLogo.setBackground(new java.awt.Color(0, 102, 204));
        jLogo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLogo.setForeground(new java.awt.Color(0, 102, 204));
        jLogo.setText("ITV ERD");

        jLabel2.setBackground(new java.awt.Color(0, 102, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Acceso a Taller");

        BtContinuar.setBackground(new java.awt.Color(0, 102, 204));
        BtContinuar.setForeground(new java.awt.Color(255, 255, 255));
        BtContinuar.setText("Continuar");
        BtContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtContinuarActionPerformed(evt);
            }
        });

        PanelSair.setBackground(new java.awt.Color(0, 102, 204));
        PanelSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelSairMouseClicked(evt);
            }
        });

        jSair1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSair1.setForeground(new java.awt.Color(255, 255, 255));
        jSair1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSair1.setText("X");
        jSair1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSair1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSair1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelSairLayout = new javax.swing.GroupLayout(PanelSair);
        PanelSair.setLayout(PanelSairLayout);
        PanelSairLayout.setHorizontalGroup(
            PanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSair1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSairLayout.setVerticalGroup(
            PanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSairLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSair1)
                .addContainerGap())
        );

        BtMenuPrincipal.setBackground(new java.awt.Color(0, 102, 204));
        BtMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        BtMenuPrincipal.setText("Menú Principal");
        BtMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMenuPrincipalActionPerformed(evt);
            }
        });

        jProgressBar1.setStringPainted(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BtMenuPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtContinuar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 91, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)))
                                .addGap(132, 132, 132))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLogo)
                                    .addGap(146, 146, 146)
                                    .addComponent(PanelSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel2))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLogo))
                    .addComponent(PanelSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtContinuar)
                    .addComponent(BtMenuPrincipal))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDNIActionPerformed
        String dni = jTextDNI.getText();
    }//GEN-LAST:event_jTextDNIActionPerformed

    private void BtContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtContinuarActionPerformed
        if(ComprobarString.longitudLetraFinal(9, jTextDNI.getText())){
            jProgressBar1.setVisible(true);
            final Thread t;
            //Inicializamos
            t = new Thread(new Runnable() {
            //Implementamos el método run()
            @Override
            public void run() {
                //Permite mostrar el valor del progreso
                jProgressBar1.setStringPainted(true);
                int x = 1;
                //Utilizamos un while para emular el valor mínimo y máximo
                //En este caso 0 - 100
                while(x <= 100){
                    //Asignamos valor a nuestro JProgressBar por cada siclo del bucle
                    jProgressBar1.setValue(x);
                    if(x<=50){
                        jProgressBar1.setString("Cargando Datos..");
                    }else if(x>50&&x<=75){
                        jProgressBar1.setString("Seleccionando Puerta..");
                    }
                    
                    //Hacemos una parada de medio segundo por cada siclo while
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                    //Se incrementa el valor de x
                    x++;
                }
            }
        });
        //Se ejecuta el Thread
        t.start();
    }
    

  
            
            
            
       
    }//GEN-LAST:event_BtContinuarActionPerformed

    private void jSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSair1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jSair1MouseClicked

    private void PanelSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSairMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_PanelSairMouseClicked

    private void BtMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMenuPrincipalActionPerformed
        Interfaz Int=new Interfaz();
        Int.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtMenuPrincipalActionPerformed

    private void jTextDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDNIKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(ComprobarString.longitudLetraFinal(9, jTextDNI.getText())){

                this.setVisible(false);
        }
        }
    }//GEN-LAST:event_jTextDNIKeyPressed

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
            java.util.logging.Logger.getLogger(IntAccesoTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntAccesoTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntAccesoTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntAccesoTaller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntAccesoTaller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtContinuar;
    private javax.swing.JButton BtMenuPrincipal;
    private javax.swing.JPanel PanelSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel jSair1;
    private javax.swing.JTextField jTextDNI;
    // End of variables declaration//GEN-END:variables
}
