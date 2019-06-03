/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Citas;

import Citas.Cita;
import Interfaz.Interfaz;
import static Interfaz.Interfaz.fecha;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 * @author Mirroriced y Rafsniper
 */
public class InterfazCita extends javax.swing.JFrame {

    /**
     * Creates new form InterfazCita
     */
    public InterfazCita() {
        initComponents();
        Cita cit = new Cita();
        lbfecha.setText(cit.getFecha());
        lbHora.setText(cit.getTime().toString());
        lbCiudad.setText(cit.getLocalidad());
        setVisible(true);
        
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
        jLogo = new javax.swing.JLabel();
        BtPtPrinc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        lbfecha = new javax.swing.JLabel();
        lbCiudad = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLbMin = new javax.swing.JLabel();
        jlbCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLogo.setBackground(new java.awt.Color(51, 51, 51));
        jLogo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLogo.setForeground(new java.awt.Color(51, 51, 51));
        jLogo.setText("ITV ERD");

        BtPtPrinc.setBackground(new java.awt.Color(51, 51, 51));
        BtPtPrinc.setForeground(new java.awt.Color(255, 255, 255));
        BtPtPrinc.setText("Menú Principal");
        BtPtPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPtPrincActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Aquí tiene su cita:");

        lbHora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbHora.setForeground(new java.awt.Color(51, 51, 51));
        lbHora.setText("00:00:00");

        lbfecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbfecha.setForeground(new java.awt.Color(51, 51, 51));
        lbfecha.setText("DD/MM/YYYY");

        lbCiudad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCiudad.setForeground(new java.awt.Color(51, 51, 51));
        lbCiudad.setText("Ciudad");

        jLbMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Minimizar.png"))); // NOI18N
        jLbMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLbMin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLbMinMouseMoved(evt);
            }
        });
        jLbMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLbMinMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLbMinMouseExited(evt);
            }
        });

        jlbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Close.png"))); // NOI18N
        jlbCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlbCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlbCerrarMouseMoved(evt);
            }
        });
        jlbCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbCerrarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlbCerrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbfecha)
                            .addComponent(lbHora)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbCiudad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jLogo)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addComponent(BtPtPrinc))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLbMin)
                        .addGap(8, 8, 8)
                        .addComponent(jlbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLogo)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLbMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbfecha)
                .addGap(18, 18, 18)
                .addComponent(lbHora)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(BtPtPrinc)
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

    private void BtPtPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPtPrincActionPerformed
        Interfaz Int=new Interfaz();
        Int.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtPtPrincActionPerformed

    private void jLbMinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseMoved
        jLbMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLbMinMouseMoved

    private void jLbMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseClicked
        this.setState(InterfazCita.ICONIFIED);
    }//GEN-LAST:event_jLbMinMouseClicked

    private void jLbMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseExited
        jLbMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jLbMinMouseExited

    private void jlbCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseMoved
        jlbCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jlbCerrarMouseMoved

    private void jlbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseClicked
        int dialog =JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Desea salir del programa?","Exit",dialog);
        if(result==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jlbCerrarMouseClicked

    private void jlbCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseExited
        jlbCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,255,255)));
    }//GEN-LAST:event_jlbCerrarMouseExited

    
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
            java.util.logging.Logger.getLogger(InterfazCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtPtPrinc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLbMin;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlbCerrar;
    private javax.swing.JLabel lbCiudad;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbfecha;
    // End of variables declaration//GEN-END:variables
}
