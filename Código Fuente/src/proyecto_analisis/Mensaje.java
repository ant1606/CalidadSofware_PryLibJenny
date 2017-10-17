
package proyecto_analisis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;


public class Mensaje extends javax.swing.JFrame {

    public Mensaje() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtdni = new javax.swing.JTextField();
        jbtnBuscar = new javax.swing.JButton();
        jbtnAtras = new javax.swing.JButton();
        jbtnNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensaje", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Número de orden: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 46, -1, -1));
        jPanel1.add(jtxtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 30));

        jbtnBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtnBuscar.setText("Buscar Cliente");
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 30));

        jbtnAtras.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtnAtras.setText("Atras");
        jbtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtrasActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 90, 30));

        jbtnNuevo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtnNuevo.setText(" Cliente Nuevo");
        jbtnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 310, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
       String linea, dniBuscado, nombre,apellido, dni,direccion,telefono;
        boolean encontrado = false;
        dniBuscado = jtxtdni.getText();
        //Verificando la apertura del archivo con el try .. catch
        try {
            FileReader fr = new FileReader("clientes.txt");
            BufferedReader br = new BufferedReader(fr);
            //Extrayendo la primera linea del texto
            linea = br.readLine();
            //Inicializando el ciclo repetitivo para extraer todas las lineas del archivo
            while (linea != null && !encontrado) {  // Inicializando el tokens
                StringTokenizer st = new StringTokenizer(linea, ",");
                //Extrayendo los datos de la linea ==> nombre y sueldo
                nombre = st.nextToken();
                apellido = st.nextToken();
                dni = st.nextToken();
                direccion = st.nextToken();
                telefono = st.nextToken();
                //Verificando el nombre buscado
                if (dniBuscado.equalsIgnoreCase(dni)) {
                    JOptionPane.showMessageDialog(null, "El DNI del cliente es: " + dniBuscado
                            + "su Nombre es:  " + nombre + " su apellido es: "+ apellido
                    + "su direccion es: " + direccion + "su telefono es: " + telefono );
                    //Rompemos el ciclo repetitivo modificando la variable encontrado
                    encontrado = true;
                }
                //Leemos la siguiente linea del archivo de texto
                linea = br.readLine();
            }
            //Cerramos la conexión con el archivo de texto
            br.close();
            //Verificamos la variable encontrado por el empleado que buscamos no existe
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, dniBuscado + " no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la lectura del archivo.....");
        }
      
        
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private void jbtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtrasActionPerformed
        Menu obj=new Menu();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jbtnAtrasActionPerformed

    private void jbtnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNuevoActionPerformed
        cliente_nuevo MN=new cliente_nuevo();
            MN.setVisible(true);
            dispose();
    }//GEN-LAST:event_jbtnNuevoActionPerformed

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
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mensaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mensaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnAtras;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnNuevo;
    private javax.swing.JTextField jtxtdni;
    // End of variables declaration//GEN-END:variables
}
