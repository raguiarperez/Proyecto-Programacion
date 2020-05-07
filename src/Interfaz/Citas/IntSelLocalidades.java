package Interfaz.Citas;

import Interfaz.Interfaz;
import javax.swing.JOptionPane;
import Citas.Cita;

/**
 * @author Mirroriced y Rafsniper
 */
public class IntSelLocalidades extends javax.swing.JFrame {

    String ciudad;

    /**
     * Creates new form IntSelLocalidades
     */
    public IntSelLocalidades() {
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

        jPanel1 = new javax.swing.JPanel();
        jLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BtContinuar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BtMenuPrincipal = new javax.swing.JButton();
        jSeleccionLoc = new javax.swing.JComboBox<>();
        jlbCerrar = new javax.swing.JLabel();
        jLbMin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.darkGray));

        jLogo.setText("ITV ERD");
        jLogo.setBackground(new java.awt.Color(51, 51, 51));
        jLogo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLogo.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setText("Acceso a Cita Previa");
        jLabel2.setBackground(new java.awt.Color(51, 51, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));

        BtContinuar.setText("Continuar");
        BtContinuar.setBackground(new java.awt.Color(51, 51, 51));
        BtContinuar.setForeground(new java.awt.Color(255, 255, 255));
        BtContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtContinuarActionPerformed(evt);
            }
        });

        jLabel3.setText("Selección de Localidad");
        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));

        BtMenuPrincipal.setText("Menú Principal");
        BtMenuPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        BtMenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        BtMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMenuPrincipalActionPerformed(evt);
            }
        });

        jSeleccionLoc.setForeground(new java.awt.Color(51, 51, 51));
        jSeleccionLoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vigo", "A Coruña", "Pontovedra", "Lugo", "Ourense" }));
        jSeleccionLoc.setAutoscrolls(true);
        jSeleccionLoc.setName(""); // NOI18N
        jSeleccionLoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jSeleccionLocItemStateChanged(evt);
            }
        });
        jSeleccionLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSeleccionLocActionPerformed(evt);
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
                        .addGap(0, 118, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLogo)
                                .addGap(73, 73, 73)
                                .addComponent(jLbMin)
                                .addGap(8, 8, 8)
                                .addComponent(jlbCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(jSeleccionLoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(137, 137, 137))))))
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
                .addComponent(jLabel2)
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jSeleccionLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
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

    private void BtContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtContinuarActionPerformed
        Cita.localidad = (String) jSeleccionLoc.getSelectedItem();

        IntSelFecha Ifecha = new IntSelFecha();
        Ifecha.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtContinuarActionPerformed

    private void BtMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMenuPrincipalActionPerformed
        Interfaz Int = new Interfaz();
        Int.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtMenuPrincipalActionPerformed

    private void jSeleccionLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSeleccionLocActionPerformed

    }//GEN-LAST:event_jSeleccionLocActionPerformed

    private void jSeleccionLocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jSeleccionLocItemStateChanged

    }//GEN-LAST:event_jSeleccionLocItemStateChanged

    private void jlbCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseMoved
        jlbCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jlbCerrarMouseMoved

    private void jlbCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir del programa?", "Exit", dialog);
        if (result == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jlbCerrarMouseClicked

    private void jlbCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbCerrarMouseExited
        jlbCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jlbCerrarMouseExited

    private void jLbMinMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseMoved
        jLbMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLbMinMouseMoved

    private void jLbMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseClicked
        this.setState(IntSelLocalidades.ICONIFIED);
    }//GEN-LAST:event_jLbMinMouseClicked

    private void jLbMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLbMinMouseExited
        jLbMin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLbMinMouseExited

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
            java.util.logging.Logger.getLogger(IntSelLocalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntSelLocalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntSelLocalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntSelLocalidades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntSelLocalidades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtContinuar;
    private javax.swing.JButton BtMenuPrincipal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLbMin;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JComboBox<String> jSeleccionLoc;
    private javax.swing.JLabel jlbCerrar;
    // End of variables declaration//GEN-END:variables
}
