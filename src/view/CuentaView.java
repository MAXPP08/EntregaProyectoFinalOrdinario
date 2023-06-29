/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: Interfaz de cuenta
 */
package view;

import controller.ReciboController;
import entity.Recibo;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class CuentaView extends javax.swing.JFrame {

    private ReciboController controllerRecibo = new ReciboController();
    private Recibo recibo;

    /**
     * Este constructor configura la ventana de la vista de la cuenta y muestra
     * el recibo proporcionado en la tabla de la interfaz gráfica.
     * @param recibo 
     */
    public CuentaView(Recibo recibo) {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.recibo = recibo;
        //Utilizar el controlador del recibo para imprimir el recibo en la tabla
        controllerRecibo.imprimirRecibo(recibo,
                (DefaultTableModel) tblRecibo.getModel());
    }

    public CuentaView() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRecibo = new javax.swing.JTable();
        btnEliminarRegistro = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGenerarCuenta = new javax.swing.JButton();
        lblTotalAPagar = new javax.swing.JLabel();
        CampoTotalAPagar = new javax.swing.JTextField();
        lblCantidadProporcionada = new javax.swing.JLabel();
        campoCantidadProporcionada = new javax.swing.JTextField();
        btnPagar = new javax.swing.JButton();
        lblCambio = new javax.swing.JLabel();
        campoCambio = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        miMenu = new javax.swing.JMenu();
        menuInicio = new javax.swing.JMenuItem();
        menuMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/logoRestaurante.png"))); // NOI18N

        tblRecibo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Precio", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRecibo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReciboMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRecibo);
        if (tblRecibo.getColumnModel().getColumnCount() > 0) {
            tblRecibo.getColumnModel().getColumn(0).setResizable(false);
            tblRecibo.getColumnModel().getColumn(1).setResizable(false);
            tblRecibo.getColumnModel().getColumn(2).setResizable(false);
        }

        btnEliminarRegistro.setText("Eliminar");
        btnEliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarRegistroActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGenerarCuenta.setText("Generar Cuenta");
        btnGenerarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCuentaActionPerformed(evt);
            }
        });

        lblTotalAPagar.setText("Total a pagar:");

        CampoTotalAPagar.setEditable(false);

        lblCantidadProporcionada.setText("Cantidad Proporcionada:");

        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        lblCambio.setText("Cambio:");

        campoCambio.setEditable(false);

        miMenu.setText("Usos");
        miMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMenuActionPerformed(evt);
            }
        });

        menuInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/hogar.png"))); // NOI18N
        menuInicio.setText("Inicio");
        menuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioActionPerformed(evt);
            }
        });
        miMenu.add(menuInicio);

        menuMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/menu.png"))); // NOI18N
        menuMenu.setText("Menú");
        menuMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMenuActionPerformed(evt);
            }
        });
        miMenu.add(menuMenu);

        jMenuBar1.add(miMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(btnGenerarCuenta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnEliminarRegistro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEditar)
                            .addComponent(btnCancelar)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTotalAPagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblCantidadProporcionada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCantidadProporcionada, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnPagar)
                        .addGap(35, 35, 35)
                        .addComponent(lblCambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarRegistro)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEditar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGenerarCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotalAPagar)
                    .addComponent(CampoTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidadProporcionada)
                    .addComponent(campoCantidadProporcionada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPagar)
                    .addComponent(lblCambio)
                    .addComponent(campoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este método genera la cuenta del recibo y muestra el total a pagar en 
     * el campo de texto.
     * @param evt 
     */
    private void btnGenerarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCuentaActionPerformed
        controllerRecibo.generarCuenta(recibo);
        double pagarCuenta;
        pagarCuenta = controllerRecibo.generarCuenta(recibo);

        CampoTotalAPagar.setText(Double.valueOf(pagarCuenta).toString());
    }//GEN-LAST:event_btnGenerarCuentaActionPerformed

    /**
     * Este método permite al usuario eliminar un registro del recibo, 
     * actualiza la tabla y muestra el total a pagar actualizado.
     * @param evt 
     */
    private void btnEliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarRegistroActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tblRecibo.getModel();
        int filaSeleccionada = tblRecibo.getSelectedRow();

        int opcion = JOptionPane.showConfirmDialog(null,
                "¿Estás seguro de eliminar?", "Confirmación",
                JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {
            controllerRecibo.eliminarRecibo(filaSeleccionada, recibo);
            controllerRecibo.imprimirRecibo(recibo, modelo);
        }

        controllerRecibo.generarCuenta(recibo);
        double pagarCuenta;
        pagarCuenta = controllerRecibo.generarCuenta(recibo);

        CampoTotalAPagar.setText(new DecimalFormat("0.00").format(
                pagarCuenta));
    }//GEN-LAST:event_btnEliminarRegistroActionPerformed

    private void tblReciboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReciboMouseClicked
        
    }//GEN-LAST:event_tblReciboMouseClicked

    /**
     * Este método permite al usuario cancelar la operación actual y regresar a
     * la pantalla de inicio de sesión.
     * @param evt 
     */
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(null,
                "Usted sera enviado al Logueo", "Confirmación",
                JOptionPane.OK_CANCEL_OPTION);

        if (opcion == JOptionPane.OK_OPTION) {
            LogueoPrincipal logueo = new LogueoPrincipal();
            logueo.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        ComidaView comida = new ComidaView(recibo);
        comida.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void miMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMenuActionPerformed
        ComidaView comida = new ComidaView(recibo);
        comida.setVisible(true);
        dispose();
    }//GEN-LAST:event_miMenuActionPerformed

    private void menuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioActionPerformed
        LogueoPrincipal logueo = new LogueoPrincipal();
        logueo.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuInicioActionPerformed

    private void menuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMenuActionPerformed
        ComidaView comida = new ComidaView(recibo);
        comida.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuMenuActionPerformed

    /**
     * Este método se encarga de realizar las operaciones de pago, validar los
     * campos ingresados y proporcionar información al usuario sobre el
     * resultado de la transacción.
     * @param evt 
     */
    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        //Se llevan a cabo las operaciones de pago por parte del usuario y 
        //válida los campos
        if (CampoTotalAPagar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, 
                    "No existen pedidos agregados");
        } else {
            String cantidadProporcionadaText = 
                    campoCantidadProporcionada.getText().trim();
            if (cantidadProporcionadaText.isEmpty()) {
                JOptionPane.showMessageDialog(null, 
                "Ingrese un valor para la cantidad proporcionada");
            } else if (!cantidadProporcionadaText.matches("\\d*")) {
                // Verificar si la cantidad proporcionada contiene caracteres no numéricos
                JOptionPane.showMessageDialog(null, 
                "Ingrese solo números en la cantidad proporcionada");
            } else {
                // Convertir la cantidad proporcionada y el total a números
                double pago = Double.parseDouble(cantidadProporcionadaText);
                double total = Double.parseDouble(CampoTotalAPagar.getText());

                if (total > pago) {
                    JOptionPane.showMessageDialog(null, 
                    "El pago es menor a la cuenta total, "
                            + "ingrese un valor mayor");
                } else {
                    double cambio = pago - total;
                    campoCambio.setText(new 
                    DecimalFormat("0.00").format(cambio));
                    JOptionPane.showMessageDialog(null, 
                            "Gracias por su preferencia");
                }
            }
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    public static void main(String args[]) {
        /**
         * Implementación de libreria jtattoo para el diseño de ventanas
         */
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
                new CuentaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoTotalAPagar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarRegistro;
    private javax.swing.JButton btnGenerarCuenta;
    private javax.swing.JButton btnPagar;
    private javax.swing.JTextField campoCambio;
    private javax.swing.JTextField campoCantidadProporcionada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCambio;
    private javax.swing.JLabel lblCantidadProporcionada;
    private javax.swing.JLabel lblTotalAPagar;
    private javax.swing.JMenuItem menuInicio;
    private javax.swing.JMenuItem menuMenu;
    private javax.swing.JMenu miMenu;
    private javax.swing.JTable tblRecibo;
    // End of variables declaration//GEN-END:variables
}
