/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Interfaz.Documentación.IntAccesoDoc;
import Interfaz.Citas.IntAccesoCita;
import Citas.Cita;
import Interfaz.Taller.IntAccesoTaller;
import Utilidades.ComprobarString;
import Utilidades.pedirDatos;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author rafa2
 */
public class Interfaz extends javax.swing.JFrame implements Runnable {
    String hora,minutos,segundos;
    Thread hilo;
    /**
     * Creates new form Interfaz
     */

    public Interfaz() {
        initComponents();
        lbfecha.setText(fecha());
        hilo=new Thread(this);
        hilo.start();
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

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbfecha = new javax.swing.JLabel();
        lbHora = new javax.swing.JLabel();
        PanelSair = new javax.swing.JPanel();
        jSair = new javax.swing.JLabel();
        BtCitaPrevia = new javax.swing.JButton();
        BtDocumentacion = new javax.swing.JButton();
        BtTaller = new javax.swing.JButton();
        BtAdmin = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("File");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar1.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.blue, java.awt.Color.blue));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("¿Que desea realizar?");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ITV ERD");

        lbfecha.setForeground(new java.awt.Color(255, 255, 255));
        lbfecha.setText("DD/MM/YYYY");

        lbHora.setForeground(new java.awt.Color(255, 255, 255));
        lbHora.setText("00:00:00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbfecha)
                        .addGap(18, 18, 18)
                        .addComponent(lbHora))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbfecha)
                    .addComponent(lbHora))
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addGap(129, 129, 129))
        );

        PanelSair.setBackground(new java.awt.Color(0, 102, 204));
        PanelSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PanelSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelSairMouseClicked(evt);
            }
        });

        jSair.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jSair.setForeground(new java.awt.Color(255, 255, 255));
        jSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jSair.setText("X");
        jSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelSairLayout = new javax.swing.GroupLayout(PanelSair);
        PanelSair.setLayout(PanelSairLayout);
        PanelSairLayout.setHorizontalGroup(
            PanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSair, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelSairLayout.setVerticalGroup(
            PanelSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSairLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSair)
                .addContainerGap())
        );

        BtCitaPrevia.setBackground(new java.awt.Color(0, 102, 204));
        BtCitaPrevia.setForeground(new java.awt.Color(255, 255, 255));
        BtCitaPrevia.setText("Cita Previa");
        BtCitaPrevia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCitaPreviaActionPerformed(evt);
            }
        });

        BtDocumentacion.setBackground(new java.awt.Color(0, 102, 204));
        BtDocumentacion.setForeground(new java.awt.Color(255, 255, 255));
        BtDocumentacion.setText("Documentación");
        BtDocumentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDocumentacionActionPerformed(evt);
            }
        });

        BtTaller.setBackground(new java.awt.Color(0, 102, 204));
        BtTaller.setForeground(new java.awt.Color(255, 255, 255));
        BtTaller.setText("Taller");
        BtTaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtTallerActionPerformed(evt);
            }
        });

        BtAdmin.setBackground(new java.awt.Color(0, 102, 204));
        BtAdmin.setForeground(new java.awt.Color(255, 255, 255));
        BtAdmin.setText("Administrador");
        BtAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(BtCitaPrevia)
                                    .addGap(98, 98, 98))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BtDocumentacion)
                                        .addComponent(BtTaller))
                                    .addContainerGap()))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtAdmin)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PanelSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BtCitaPrevia)
                .addGap(59, 59, 59)
                .addComponent(BtDocumentacion)
                .addGap(63, 63, 63)
                .addComponent(BtTaller)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtAdmin)
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

        setSize(new java.awt.Dimension(566, 422));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void BtCitaPreviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCitaPreviaActionPerformed
       IntAccesoCita IAcita=new IntAccesoCita();
       IAcita.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_BtCitaPreviaActionPerformed

    private void BtTallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtTallerActionPerformed
        IntAccesoTaller IATaller=new IntAccesoTaller();
        IATaller.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtTallerActionPerformed

    private void PanelSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSairMouseClicked
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_PanelSairMouseClicked

    private void BtDocumentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDocumentacionActionPerformed
        IntAccesoDoc IAdoc=new IntAccesoDoc();
        IAdoc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtDocumentacionActionPerformed

    private void jSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseClicked
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_jSairMouseClicked

    private void BtAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAdminActionPerformed
        AccesAdmin adminA=new AccesAdmin();
        adminA.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtAdminActionPerformed

    
    public void hora(){
        Calendar calendario=new GregorianCalendar();
        Date horactual=new Date();
        calendario.setTime(horactual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
    public void run(){
        Thread current=Thread.currentThread();
        while(current==hilo){
            hora();
            lbHora.setText(hora+":"+minutos+":"+segundos);
        }
    }
    /**
     * @param args the command line arguments
     */
        public static String fecha(){
        Date fecha =new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAdmin;
    private javax.swing.JButton BtCitaPrevia;
    private javax.swing.JButton BtDocumentacion;
    private javax.swing.JButton BtTaller;
    private javax.swing.JPanel PanelSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jSair;
    private javax.swing.JLabel lbHora;
    private javax.swing.JLabel lbfecha;
    // End of variables declaration//GEN-END:variables
}
