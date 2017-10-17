

package proyecto_analisis;

import javax.swing.JOptionPane;

public class Acceso extends javax.swing.JFrame {

    public Acceso() {
        initComponents();
               setLocationRelativeTo(null);
       setResizable(true);
       setTitle("Acceso");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        USUAR_ = new javax.swing.JTextField();
        jbtnIngresar = new javax.swing.JButton();
        CONTRA_ = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("USUARIO:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 48, -1, -1));

        jLabel2.setText("CONTRASEÑA:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 98, -1, -1));
        getContentPane().add(USUAR_, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 40, 118, 31));

        jbtnIngresar.setText("INGRESAR");
        jbtnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 90, 40));
        getContentPane().add(CONTRA_, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 120, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresarActionPerformed
        String usuario="admin";
        String contra="123456";
         String Pass=new String(CONTRA_.getPassword());
        
        if(USUAR_.getText().equalsIgnoreCase(usuario)&& Pass.equalsIgnoreCase(contra)){
            
            Menu MN=new Menu();
            MN.setVisible(true);
            dispose();
        }
        else
            
            JOptionPane.showMessageDialog(this,"contraseña y/o usuario incorrectos");
            
            
    }//GEN-LAST:event_jbtnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField CONTRA_;
    private javax.swing.JTextField USUAR_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbtnIngresar;
    // End of variables declaration//GEN-END:variables
}
