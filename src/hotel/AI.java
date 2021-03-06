/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

/**
 *
 * @author xjlop
 */
public class AI extends javax.swing.JFrame {

    /**
     * Creates new form AI
     */
    public AI() {
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

        HabAltas = new javax.swing.JButton();
        HabBajas = new javax.swing.JButton();
        LabelHab = new javax.swing.JLabel();
        THabAltas = new javax.swing.JButton();
        THabBajas = new javax.swing.JButton();
        LabelTHab = new javax.swing.JLabel();
        UserAltas = new javax.swing.JButton();
        UserBajas = new javax.swing.JButton();
        LabelUser = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HabAltas.setText("Altas");
        HabAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabAltasActionPerformed(evt);
            }
        });
        getContentPane().add(HabAltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 80, -1));

        HabBajas.setText("Bajas");
        HabBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabBajasActionPerformed(evt);
            }
        });
        getContentPane().add(HabBajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 80, -1));

        LabelHab.setText("Habitaciones");
        getContentPane().add(LabelHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 70, -1));

        THabAltas.setText("Altas");
        THabAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THabAltasActionPerformed(evt);
            }
        });
        getContentPane().add(THabAltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 90, -1));

        THabBajas.setText("Bajas");
        THabBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                THabBajasActionPerformed(evt);
            }
        });
        getContentPane().add(THabBajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 90, -1));

        LabelTHab.setText("Tipo de Hab");
        getContentPane().add(LabelTHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 60, -1));

        UserAltas.setText("Altas");
        UserAltas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserAltasActionPerformed(evt);
            }
        });
        getContentPane().add(UserAltas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 90, -1));

        UserBajas.setText("Bajas");
        UserBajas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserBajasActionPerformed(evt);
            }
        });
        getContentPane().add(UserBajas, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 90, -1));

        LabelUser.setText("Usuarios");
        getContentPane().add(LabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 60, -1));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        jLabel2.setText("Funciones de Administrador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 170, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Back.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HabAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabAltasActionPerformed
        AdminAddHab consultas = new AdminAddHab();
        this.setVisible(false);
        consultas.setVisible(true);
        consultas.setLocationRelativeTo(null);
        consultas.setSize(700,500);
        consultas.setResizable(false);
    }//GEN-LAST:event_HabAltasActionPerformed

    private void HabBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabBajasActionPerformed
        AdminDelHab consultas = new AdminDelHab();
        this.setVisible(false);
        consultas.setVisible(true);
        consultas.setLocationRelativeTo(null);
        consultas.setSize(700,500);
        consultas.setResizable(false);
    }//GEN-LAST:event_HabBajasActionPerformed

    private void THabAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THabAltasActionPerformed
        AdminAddTHab consultas = new AdminAddTHab();
        this.setVisible(false);
        consultas.setVisible(true);
        consultas.setLocationRelativeTo(null);
        consultas.setSize(700,500);
        consultas.setResizable(false);
    }//GEN-LAST:event_THabAltasActionPerformed

    private void THabBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_THabBajasActionPerformed
        AdminDelTHab consultas = new AdminDelTHab();
        this.setVisible(false);
        consultas.setVisible(true);
        consultas.setLocationRelativeTo(null);
        consultas.setSize(700,500);
        consultas.setResizable(false);
    }//GEN-LAST:event_THabBajasActionPerformed

    private void UserAltasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserAltasActionPerformed
        AdminAddUser consultas = new AdminAddUser();
        this.setVisible(false);
        consultas.setVisible(true);
        consultas.setLocationRelativeTo(null);
        consultas.setSize(700,500);
        consultas.setResizable(false);
    }//GEN-LAST:event_UserAltasActionPerformed

    private void UserBajasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserBajasActionPerformed
        AdminDelUser consultas = new AdminDelUser();
        this.setVisible(false);
        consultas.setVisible(true);
        consultas.setLocationRelativeTo(null);
        consultas.setSize(700,500);
        consultas.setResizable(false);
    }//GEN-LAST:event_UserBajasActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(AI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HabAltas;
    private javax.swing.JButton HabBajas;
    private javax.swing.JLabel LabelHab;
    private javax.swing.JLabel LabelTHab;
    private javax.swing.JLabel LabelUser;
    private javax.swing.JButton Salir;
    private javax.swing.JButton THabAltas;
    private javax.swing.JButton THabBajas;
    private javax.swing.JButton UserAltas;
    private javax.swing.JButton UserBajas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
