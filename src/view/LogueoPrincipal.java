/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: Interfaz del logeo
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class LogueoPrincipal extends javax.swing.JFrame {

    public LogueoPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inicioSesion = new javax.swing.JButton();
        cajaContraseña = new javax.swing.JPasswordField();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/logoRestaurante.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel2.setText("Usuario:");

        jLabel3.setFont(new java.awt.Font("Century", 1, 24)); // NOI18N
        jLabel3.setText("Contraseña:");

        inicioSesion.setText("Iniciar Sesión");
        inicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioSesionActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(inicioSesion)
                        .addGap(55, 55, 55)
                        .addComponent(cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel2)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(cajaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cajaContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inicioSesion)
                    .addComponent(cancelar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioSesionActionPerformed
        // Usuario y contraseña correctos
        String usuarioCorrecto = "admin";
        String contraseñacorrecta = "admin";

        // Comprobar si el usuario ingresado coincide con el usuario correcto
        if (usuarioCorrecto.equals(cajaUsuario.getText())) {
            String contraseña = "";

            // Obtener la contraseña ingresada
            for (int i = 0; i < cajaContraseña.getPassword().length; i++) {
                contraseña += cajaContraseña.getPassword()[i];
            }
            // Comprobar si la contraseña ingresada coincide
            if (contraseñacorrecta.equals(contraseña)) {
                JOptionPane.showMessageDialog(null, 
                        "Ingresaste al Sistema");
                ComidaView comida = new ComidaView();
                comida.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, 
                        "Error Contraseña Desconocida");
            }
        } else {
            JOptionPane.showMessageDialog(null, 
                    "Error, Usuario desconocido");
        }
    }//GEN-LAST:event_inicioSesionActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_cancelarActionPerformed

    public static void main(String args[]) {
        // Configurar el aspecto visual de la interfaz de usuario con jtattoo
        try {
            UIManager.setLookAndFeel
        ("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {

        } catch (InstantiationException ex) {

        } catch (IllegalAccessException ex) {

        } catch (UnsupportedLookAndFeelException ex) {

        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogueoPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cajaContraseña;
    private javax.swing.JTextField cajaUsuario;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton inicioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
