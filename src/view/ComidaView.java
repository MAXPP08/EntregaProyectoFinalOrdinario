/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: Interfaz principal
 */
package view;

import controller.ElementoMenuController;
import controller.ReciboController;
import controller.RestauranteController;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import entity.Recibo;
import entity.Comida;
import entity.ElementoMenu;
import entity.Restaurante;
import java.awt.event.ItemEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ComidaView extends javax.swing.JFrame {

    private RestauranteController controllerRestaurante;
    private Restaurante restaurante;
    private ReciboController controllerRecibo;
    private Recibo recibo;

    private ElementoMenuController controllerElementoMenu;
    private ElementoMenu elemento;
    
    public ComidaView() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);

        this.controllerRestaurante = new RestauranteController();
        this.restaurante = controllerRestaurante.crearRegistro();
        cargarDatos();

        this.controllerRecibo = new ReciboController();
        this.recibo = controllerRecibo.crearRegistro();

        this.controllerElementoMenu = new ElementoMenuController();
    }
    
    public ComidaView(Recibo recibo){
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
        this.recibo = recibo;
        this.controllerRestaurante = new RestauranteController();
        this.restaurante = controllerRestaurante.crearRegistro();
        
        this.controllerRecibo = new ReciboController();

        this.controllerElementoMenu = new ElementoMenuController();
        
        cargarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelLogo = new javax.swing.JLabel();
        labelPescado = new javax.swing.JLabel();
        labelComidasExoticas = new javax.swing.JLabel();
        labelComidaFuerte = new javax.swing.JLabel();
        cmbComidasPescado = new javax.swing.JComboBox<>();
        cmbComidasExoticas = new javax.swing.JComboBox<>();
        cmbComidasFuertes = new javax.swing.JComboBox<>();
        cantidadComidasPescado = new javax.swing.JSpinner();
        cantidadComidasExoticas = new javax.swing.JSpinner();
        cantidadComidasFuertes = new javax.swing.JSpinner();
        btnAgregarComidaPescado = new javax.swing.JButton();
        precioComidasFuertes = new javax.swing.JLabel();
        precioComidasPescado = new javax.swing.JLabel();
        precioComidasExoticas = new javax.swing.JLabel();
        btnAgregarComidasFuertes = new javax.swing.JButton();
        btnAgregarComidasExoticas = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblPrecioCantidadPescado = new javax.swing.JLabel();
        lblPrecioCantidadComidasExoticas = new javax.swing.JLabel();
        lblPrecioCantidadFuertes = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/logoRestaurante.png"))); // NOI18N
        getContentPane().add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 6, -1, -1));

        labelPescado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/Pescado-Frito.jpg"))); // NOI18N
        getContentPane().add(labelPescado, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 210, -1, -1));

        labelComidasExoticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/Ostiones-Gratinados.jpg"))); // NOI18N
        getContentPane().add(labelComidasExoticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        labelComidaFuerte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/CamaronesEmpanizados.png"))); // NOI18N
        getContentPane().add(labelComidaFuerte, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        cmbComidasPescado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbComidasPescadoItemStateChanged(evt);
            }
        });
        cmbComidasPescado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbComidasPescadoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbComidasPescado, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 342, -1, -1));

        cmbComidasExoticas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbComidasExoticasItemStateChanged(evt);
            }
        });
        cmbComidasExoticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbComidasExoticasActionPerformed(evt);
            }
        });
        getContentPane().add(cmbComidasExoticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        cmbComidasFuertes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbComidasFuertesItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbComidasFuertes, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        cantidadComidasPescado.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(cantidadComidasPescado, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 396, -1, -1));

        cantidadComidasExoticas.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        cantidadComidasExoticas.setToolTipText("");
        getContentPane().add(cantidadComidasExoticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        cantidadComidasFuertes.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(cantidadComidasFuertes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, 20));

        btnAgregarComidaPescado.setText("Agregar Orden");
        btnAgregarComidaPescado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidaPescadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarComidaPescado, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 396, -1, -1));

        precioComidasFuertes.setText("Precio");
        getContentPane().add(precioComidasFuertes, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        precioComidasPescado.setText("Precio");
        getContentPane().add(precioComidasPescado, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 370, -1, -1));

        precioComidasExoticas.setText("Precio");
        getContentPane().add(precioComidasExoticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        btnAgregarComidasFuertes.setText("Agregar Orden");
        btnAgregarComidasFuertes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidasFuertesActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarComidasFuertes, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        btnAgregarComidasExoticas.setText("Agregar Orden");
        btnAgregarComidasExoticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarComidasExoticasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarComidasExoticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 403, -1, -1));

        btnContinuar.setText("Pagar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 425, -1, -1));

        lblPrecioCantidadPescado.setText("0");
        getContentPane().add(lblPrecioCantidadPescado, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 370, -1, -1));

        lblPrecioCantidadComidasExoticas.setText("0");
        getContentPane().add(lblPrecioCantidadComidasExoticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        lblPrecioCantidadFuertes.setText("0");
        getContentPane().add(lblPrecioCantidadFuertes, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 50, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/comida.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/bebida.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/postre.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, -1, -1));

        jMenu1.setText("Usos");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/hogar.png"))); // NOI18N
        jMenuItem1.setText("Inicio");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/menu.png"))); // NOI18N
        jMenuItem2.setText("Menú");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void cmbComidasPescadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbComidasPescadoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombrePlatillo = (String) cmbComidasPescado.getSelectedItem();
            
            // Busca el platillo correspondiente en la lista de comidas
            Comida platilloSeleccionado = null;
            for (Comida comida : restaurante.getComidasPescado()) {
                if (comida.getNombre().equals(nombrePlatillo)) {
                    platilloSeleccionado = comida;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (platilloSeleccionado != null) {
                double precio = platilloSeleccionado.getPrecio();
                lblPrecioCantidadPescado.setText(String.valueOf(precio));
                // Reemplaza "ruta_de_la_imagen.jpg" con la ruta de tu imagen
                ImageIcon icon = new ImageIcon(platilloSeleccionado.getRutaImagen()); 
                labelPescado.setIcon(icon);
            }
        }
    }//GEN-LAST:event_cmbComidasPescadoItemStateChanged

    private void btnAgregarComidaPescadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidaPescadoActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt
        (cantidadComidasPescado.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;

            Double precioElemento;

            nombreElemento = cmbComidasPescado.getSelectedItem().toString();

            precioElemento = Double.valueOf(lblPrecioCantidadPescado.getText());

            elemento = controllerElementoMenu.crearRegistro();
            elemento.setCantidad(cantidadElemento);
            elemento.setNombre(nombreElemento);
            elemento.setPrecio(precioElemento);
            
            this.controllerRecibo.agregarElemento(recibo, elemento);

            JOptionPane.showMessageDialog(null,
                    "Pedido agregado");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Seleccione una cantidad");
        }
    }//GEN-LAST:event_btnAgregarComidaPescadoActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        new CuentaView(recibo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnAgregarComidasExoticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidasExoticasActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt
        (cantidadComidasExoticas.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;

            Double precioElemento;

            nombreElemento = cmbComidasExoticas.getSelectedItem().toString();

            precioElemento = Double.valueOf(lblPrecioCantidadComidasExoticas.getText());

            elemento = controllerElementoMenu.crearRegistro();
            elemento.setCantidad(cantidadElemento);
            elemento.setNombre(nombreElemento);
            elemento.setPrecio(precioElemento);

            this.controllerRecibo.agregarElemento(recibo, elemento);

            JOptionPane.showMessageDialog(null,
                    "Pedido agregado");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Seleccione una cantidad");
        }
    }//GEN-LAST:event_btnAgregarComidasExoticasActionPerformed

    private void cmbComidasExoticasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbComidasExoticasItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombrePlatillo = (String) cmbComidasExoticas.getSelectedItem();

            // Busca el platillo correspondiente en la lista de comidas
            Comida platilloSeleccionado = null;
            for (Comida comida : restaurante.getComidasExoticas()) {
                if (comida.getNombre().equals(nombrePlatillo)) {
                    platilloSeleccionado = comida;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (platilloSeleccionado != null) {
                double precio = platilloSeleccionado.getPrecio();
                lblPrecioCantidadComidasExoticas.setText(String.valueOf(precio));
                // Reemplaza "ruta_de_la_imagen.jpg" con la ruta de tu imagen
                ImageIcon icon = new ImageIcon(platilloSeleccionado.getRutaImagen()); 
                labelComidasExoticas.setIcon(icon);
            }
        }
    }//GEN-LAST:event_cmbComidasExoticasItemStateChanged

    private void cmbComidasFuertesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbComidasFuertesItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombrePlatillo = (String) cmbComidasFuertes.getSelectedItem();

            // Busca el platillo correspondiente en la lista de comidas
            Comida platilloSeleccionado = null;
            for (Comida comida : restaurante.getComidasFuertes()) {
                if (comida.getNombre().equals(nombrePlatillo)) {
                    platilloSeleccionado = comida;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (platilloSeleccionado != null) {
                double precio = platilloSeleccionado.getPrecio();
                lblPrecioCantidadFuertes.setText(String.valueOf(precio));
                // Reemplaza "ruta_de_la_imagen.jpg" con la ruta de tu imagen
                ImageIcon icon = new ImageIcon(platilloSeleccionado.getRutaImagen()); 
                labelComidaFuerte.setIcon(icon);
            }
        }
    }//GEN-LAST:event_cmbComidasFuertesItemStateChanged

    private void btnAgregarComidasFuertesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarComidasFuertesActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt
        (cantidadComidasFuertes.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;

            Double precioElemento;

            nombreElemento = cmbComidasFuertes.getSelectedItem().toString();

            precioElemento = Double.valueOf(lblPrecioCantidadFuertes.getText());

            elemento = controllerElementoMenu.crearRegistro();
            elemento.setCantidad(cantidadElemento);
            elemento.setNombre(nombreElemento);
            elemento.setPrecio(precioElemento);

            this.controllerRecibo.agregarElemento(recibo, elemento);

            JOptionPane.showMessageDialog(null,
                    "Pedido agregado");
        } else {
            JOptionPane.showMessageDialog(null,
                    "Seleccione una cantidad");
        }
    }//GEN-LAST:event_btnAgregarComidasFuertesActionPerformed

    private void cmbComidasPescadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbComidasPescadoActionPerformed
        
    }//GEN-LAST:event_cmbComidasPescadoActionPerformed

    private void cmbComidasExoticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbComidasExoticasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbComidasExoticasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new BebidaView(recibo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new PostreView(recibo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        LogueoPrincipal logueo = new LogueoPrincipal();
        logueo.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
                new ComidaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarComidaPescado;
    private javax.swing.JButton btnAgregarComidasExoticas;
    private javax.swing.JButton btnAgregarComidasFuertes;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JSpinner cantidadComidasExoticas;
    private javax.swing.JSpinner cantidadComidasFuertes;
    private javax.swing.JSpinner cantidadComidasPescado;
    private javax.swing.JComboBox<String> cmbComidasExoticas;
    private javax.swing.JComboBox<String> cmbComidasFuertes;
    private javax.swing.JComboBox<String> cmbComidasPescado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel labelComidaFuerte;
    private javax.swing.JLabel labelComidasExoticas;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelPescado;
    private javax.swing.JLabel lblPrecioCantidadComidasExoticas;
    private javax.swing.JLabel lblPrecioCantidadFuertes;
    private javax.swing.JLabel lblPrecioCantidadPescado;
    private javax.swing.JLabel precioComidasExoticas;
    private javax.swing.JLabel precioComidasFuertes;
    private javax.swing.JLabel precioComidasPescado;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {

        for (Comida comida : restaurante.getComidasPescado()) {
            cmbComidasPescado.addItem(comida.getNombre());
            lblPrecioCantidadPescado.setText(String.valueOf(comida.getPrecio()));
        }
        for (Comida comida1 : restaurante.getComidasExoticas()) {
            cmbComidasExoticas.addItem(comida1.getNombre());
            lblPrecioCantidadComidasExoticas.setText(String.valueOf(comida1.getPrecio()));
        }

        for (Comida comida2 : restaurante.getComidasFuertes()) {
            cmbComidasFuertes.addItem(comida2.getNombre());
            lblPrecioCantidadFuertes.setText(String.valueOf(comida2.getPrecio()));
        }
    }
}
