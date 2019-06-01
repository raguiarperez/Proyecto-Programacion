/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Documentación;

import Interfaz.Interfaz;
import Utilidades.ComprobarString;
import Utilidades.pedirDatos;
import javax.swing.JOptionPane;

/**
 *
 * @author rafa2
 */
public class IntAccesoDoc extends javax.swing.JFrame {

    /**
     * Creates new form InterfazDoc
     */
    public IntAccesoDoc() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jTextDNI1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextDNI = new javax.swing.JTextField();
        jLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextMATRICULA = new javax.swing.JTextField();
        BtContinuar = new javax.swing.JButton();
        PanelSair = new javax.swing.JPanel();
        jSair1 = new javax.swing.JLabel();
        BtPtPrincipal = new javax.swing.JButton();

        jTextDNI1.setForeground(new java.awt.Color(0, 102, 204));
        jTextDNI1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jTextDNI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDNI1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
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

        jLogo.setBackground(new java.awt.Color(0, 102, 204));
        jLogo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLogo.setForeground(new java.awt.Color(0, 102, 204));
        jLogo.setText("ITV ERD");

        jLabel2.setBackground(new java.awt.Color(0, 102, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Acceso a Documentación Previa");

        jLabel3.setBackground(new java.awt.Color(0, 102, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("MATRICULA:");

        jTextMATRICULA.setForeground(new java.awt.Color(0, 102, 204));
        jTextMATRICULA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204)));
        jTextMATRICULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextMATRICULAActionPerformed(evt);
            }
        });

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

        BtPtPrincipal.setBackground(new java.awt.Color(0, 102, 204));
        BtPtPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        BtPtPrincipal.setText("Menú Principal");
        BtPtPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPtPrincipalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextMATRICULA, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtPtPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtContinuar)
                .addContainerGap())
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
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextMATRICULA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtContinuar)
                    .addComponent(BtPtPrincipal))
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

        setSize(new java.awt.Dimension(420, 307));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDNIActionPerformed
        String dni = jTextDNI.getText();

    }//GEN-LAST:event_jTextDNIActionPerformed

    private void jTextDNI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDNI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDNI1ActionPerformed

    private void jTextMATRICULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextMATRICULAActionPerformed
        String matricula = jTextMATRICULA.getText();

    }//GEN-LAST:event_jTextMATRICULAActionPerformed

    private void BtContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtContinuarActionPerformed
        if(ComprobarString.longitudLetraFinal(9, jTextDNI.getText())==true&&ComprobarString.longitud(7, jTextMATRICULA.getText())==true){
        InterfazDoc Idoc= new InterfazDoc();
        Idoc.setVisible(true);
        this.setVisible(false);
        }
        
    }//GEN-LAST:event_BtContinuarActionPerformed

    private void jSair1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSair1MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jSair1MouseClicked

    private void PanelSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSairMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_PanelSairMouseClicked

    private void BtPtPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPtPrincipalActionPerformed
        Interfaz Int=new Interfaz();
        Int.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtPtPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(IntAccesoDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntAccesoDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntAccesoDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntAccesoDoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntAccesoDoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtContinuar;
    private javax.swing.JButton BtPtPrincipal;
    private javax.swing.JPanel PanelSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jSair1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextDNI;
    private javax.swing.JTextField jTextDNI1;
    private javax.swing.JTextField jTextMATRICULA;
    // End of variables declaration//GEN-END:variables
}
