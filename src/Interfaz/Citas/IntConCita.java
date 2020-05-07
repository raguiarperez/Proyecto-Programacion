/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Citas;

import Interfaz.Citas.IntAccesoCita;
import Interfaz.Citas.InterfazCita;
import Interfaz.Interfaz;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * @author 
 */
public class IntConCita extends javax.swing.JFrame {

    /**
     * Creates new form InterfazDoc
     */
    public IntConCita() {
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

        dateTimePicker1 = new com.github.lgooddatepicker.components.DateTimePicker();
        jPanel1 = new javax.swing.JPanel();
        jLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCoche = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaSeguro = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLbMin = new javax.swing.JLabel();
        jlbCerrar = new javax.swing.JLabel();
        BtReCita = new javax.swing.JButton();
        BtPtPrinc2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLogo.setText("ITV GAL");
        jLogo.setBackground(new java.awt.Color(51, 51, 51));
        jLogo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLogo.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 13, -1, -1));

        jLabel2.setText("Consulta de Citas");
        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 47, 110, 20));

        TablaCoche.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DNI", "Localidad", "Fecha", "Matricula", "Resultado"
            }
        ));
        TablaCoche.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(TablaCoche);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 301, 699, 155));

        TablaSeguro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "DNI", "Localidad", "Fecha", "Matrícula"
            }
        ));
        TablaSeguro.setForeground(new java.awt.Color(51, 51, 51));
        jScrollPane2.setViewportView(TablaSeguro);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 118, 699, 155));

        jLabel3.setText("Citas Próximas");
        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 170, 20));

        jLabel4.setText("Citas Pasadas");
        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 190, 30));

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
        jPanel1.add(jLbMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 2, -1, 40));

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
        jPanel1.add(jlbCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(681, 2, 30, 40));

        BtReCita.setBackground(new java.awt.Color(51, 51, 51));
        BtReCita.setForeground(new java.awt.Color(255, 255, 255));
        BtReCita.setText("Resumen Cita");
        BtReCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtReCitaActionPerformed(evt);
            }
        });
        jPanel1.add(BtReCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        BtPtPrinc2.setBackground(new java.awt.Color(51, 51, 51));
        BtPtPrinc2.setForeground(new java.awt.Color(255, 255, 255));
        BtPtPrinc2.setText("Menú Principal");
        BtPtPrinc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtPtPrinc2ActionPerformed(evt);
            }
        });
        jPanel1.add(BtPtPrinc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 470, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLbMinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseMoved
        jLbMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLbMinMouseMoved

    private void jLbMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseClicked
        this.setState(IntConCita.ICONIFIED);
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

    private void BtReCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtReCitaActionPerformed

        
    }//GEN-LAST:event_BtReCitaActionPerformed

    private void BtPtPrinc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtPtPrinc2ActionPerformed
        Interfaz Int=new Interfaz();
        Int.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtPtPrinc2ActionPerformed

    
    
    public JFrame inte(){
        return this;
    }
    
    
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
            java.util.logging.Logger.getLogger(IntConCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntConCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntConCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntConCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntConCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtPtPrinc2;
    private javax.swing.JButton BtReCita;
    public static javax.swing.JTable TablaCoche;
    public static javax.swing.JTable TablaSeguro;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePicker1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLbMin;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlbCerrar;
    // End of variables declaration//GEN-END:variables
}
