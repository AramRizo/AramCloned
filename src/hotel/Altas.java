package hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Altas extends javax.swing.JFrame {
    
    String date;
    String num;
    Conexion cc = new Conexion();
    Connection cn = cc.conexion();
    Statement st;
    ResultSet rs;
    public Altas(String F, String numh) {
        initComponents();
        date = F;
        Fecha.setText(date);
        Fecha.setEditable(false);
        num = numh;
        //SELECT NumH FROM Habitacion WHERE Cupo = 0
        try{
            st = cn.createStatement();
            rs = st.executeQuery("SELECT NumH FROM Habitacion WHERE Cupo = 0");
            while(rs.next()){
                Habitaciones.addItem(rs.getString(1));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error");
        }
        Habitaciones.setSelectedItem(num);
    }
    
    public Altas(){
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

        Nombre = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Correo = new javax.swing.JTextField();
        MetodoP = new javax.swing.JTextField();
        Habitaciones = new javax.swing.JComboBox<>();
        Fecha = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Regresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombre.setText("Nombre");
        Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NombreMouseClicked(evt);
            }
        });
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 90, -1));

        Telefono.setText("Telefono");
        Telefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TelefonoMouseClicked(evt);
            }
        });
        getContentPane().add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 90, -1));

        Correo.setText("Correo");
        Correo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CorreoMouseClicked(evt);
            }
        });
        getContentPane().add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, -1));

        MetodoP.setText("Metodo de Pago");
        MetodoP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MetodoPMouseClicked(evt);
            }
        });
        getContentPane().add(MetodoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 90, -1));

        getContentPane().add(Habitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 90, -1));

        Fecha.setText("Fecha");
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 90, -1));

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 90, -1));

        Regresar.setText("Regresar");
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarMouseClicked(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 140, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NombreMouseClicked
        Nombre.setText("");
    }//GEN-LAST:event_NombreMouseClicked

    private void TelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TelefonoMouseClicked
        Telefono.setText("");
    }//GEN-LAST:event_TelefonoMouseClicked

    private void CorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CorreoMouseClicked
        Correo.setText("");
    }//GEN-LAST:event_CorreoMouseClicked

    private void MetodoPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MetodoPMouseClicked
        MetodoP.setText("");
    }//GEN-LAST:event_MetodoPMouseClicked

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        //UPDATE habitacion Cupo = 1 WHERE NumH = "+Habitaciones.getSelectedItem()+"
        //INSERT INTO customers(Nombre,NumTel,Correo,MetodoP,NumH) VALUES('"+nombre+"',"+numtel+",'"+correo+"','"+metodop+"',"+numh+")
        String nombre = Nombre.getText();
        String numtel = Telefono.getText();
        String correo = Correo.getText();
        String metodop = MetodoP.getText();
        String numh = (String)Habitaciones.getSelectedItem();
        PreparedStatement ps;
        try{
            ps = cn.prepareStatement("INSERT INTO customers(Nombre,NumTel,Correo,MetodoP,NumH) VALUES('"+nombre+"','"+numtel+"','"+correo+"','"+metodop+"',"+numh+")");
            ps.executeUpdate();
            ps = cn.prepareStatement("UPDATE habitacion SET Cupo=1,FInic='"+date+"' WHERE NumH = "+Habitaciones.getSelectedItem()+"");
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se inserto el registro");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        UI ui = new UI();
        this.setVisible(false);
        ui.setVisible(true);
        ui.setSize(700, 500);
        ui.setResizable(false);
        ui.setLocationRelativeTo(null);
    }//GEN-LAST:event_AgregarActionPerformed

    private void RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseClicked
        UI ui = new UI();
        this.setVisible(false);
        ui.setVisible(true);
        ui.setSize(700, 500);
        ui.setResizable(false);
        ui.setLocationRelativeTo(null);
    }//GEN-LAST:event_RegresarMouseClicked

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
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Altas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField Correo;
    private javax.swing.JTextField Fecha;
    private javax.swing.JComboBox<String> Habitaciones;
    private javax.swing.JTextField MetodoP;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel Regresar;
    private javax.swing.JTextField Telefono;
    // End of variables declaration//GEN-END:variables
}
