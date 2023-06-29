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
import entity.Postre;
import entity.ElementoMenu;
import entity.Restaurante;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PostreView extends javax.swing.JFrame {

    private RestauranteController controllerRestaurante;
    private Restaurante restaurante;
    private ReciboController controllerRecibo;
    private Recibo recibo;

    private ElementoMenuController controllerElementoMenu;
    private ElementoMenu elemento;

    public PostreView() {
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

    public PostreView(Recibo recibo) {
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
        labelPastel = new javax.swing.JLabel();
        labelTarta = new javax.swing.JLabel();
        labelFlan = new javax.swing.JLabel();
        cmbPastel = new javax.swing.JComboBox<>();
        cmbTarta = new javax.swing.JComboBox<>();
        cmbFlan = new javax.swing.JComboBox<>();
        cantidadPastel = new javax.swing.JSpinner();
        cantidadTarta = new javax.swing.JSpinner();
        cantidadFlan = new javax.swing.JSpinner();
        btnAgregarPastel = new javax.swing.JButton();
        precioFlan = new javax.swing.JLabel();
        precioPastel = new javax.swing.JLabel();
        precioTarta = new javax.swing.JLabel();
        btnAgregarFlan = new javax.swing.JButton();
        btnAgregarTarta = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblPastel = new javax.swing.JLabel();
        lblPrecioCantidadTarta = new javax.swing.JLabel();
        lblPrecioFlan = new javax.swing.JLabel();
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

        labelPastel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/PastelChocolate.jpg"))); // NOI18N
        getContentPane().add(labelPastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 210, -1, -1));

        labelTarta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/TartaLimon.jpeg"))); // NOI18N
        getContentPane().add(labelTarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        labelFlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/FlanChocolate.jpg"))); // NOI18N
        getContentPane().add(labelFlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        cmbPastel.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPastelItemStateChanged(evt);
            }
        });
        cmbPastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPastelActionPerformed(evt);
            }
        });
        getContentPane().add(cmbPastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 342, -1, -1));

        cmbTarta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbTartaItemStateChanged(evt);
            }
        });
        cmbTarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTartaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        cmbFlan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFlanItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbFlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        cantidadPastel.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(cantidadPastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 396, -1, -1));

        cantidadTarta.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        cantidadTarta.setToolTipText("");
        getContentPane().add(cantidadTarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        cantidadFlan.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(cantidadFlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, 20));

        btnAgregarPastel.setText("Agregar Orden");
        btnAgregarPastel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPastelActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarPastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 396, -1, -1));

        precioFlan.setText("Precio");
        getContentPane().add(precioFlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        precioPastel.setText("Precio");
        getContentPane().add(precioPastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 370, -1, -1));

        precioTarta.setText("Precio");
        getContentPane().add(precioTarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        btnAgregarFlan.setText("Agregar Orden");
        btnAgregarFlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarFlanActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarFlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        btnAgregarTarta.setText("Agregar Orden");
        btnAgregarTarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTartaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarTarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 403, -1, -1));

        btnContinuar.setText("Pagar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 425, -1, -1));

        lblPastel.setText("0");
        getContentPane().add(lblPastel, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 370, -1, -1));

        lblPrecioCantidadTarta.setText("0");
        getContentPane().add(lblPrecioCantidadTarta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        lblPrecioFlan.setText("0");
        getContentPane().add(lblPrecioFlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 50, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/comida.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/bebida.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/postre.png"))); // NOI18N
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

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

    private void cmbPastelItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPastelItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombrePostre = (String) cmbPastel.getSelectedItem();

            // Busca el platillo correspondiente en la lista de comidas
            Postre postreSeleccionado = null;
            for (Postre postre : restaurante.getPostresPastel()) {
                if (postre.getNombre().equals(nombrePostre)) {
                    postreSeleccionado = postre;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (postreSeleccionado != null) {
                double precio = postreSeleccionado.getPrecio();
                lblPastel.setText(String.valueOf(precio));
                // Reemplaza "ruta_de_la_imagen.jpg" con la ruta de tu imagen
                ImageIcon icon = new ImageIcon(postreSeleccionado.getRutaImagen());
                labelPastel.setIcon(icon);
            }
        }
    }//GEN-LAST:event_cmbPastelItemStateChanged

    private void btnAgregarPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPastelActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt(cantidadPastel.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;

            Double precioElemento;

            nombreElemento = cmbPastel.getSelectedItem().toString();

            precioElemento = Double.valueOf(lblPastel.getText());

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
    }//GEN-LAST:event_btnAgregarPastelActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        new CuentaView(recibo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnAgregarTartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTartaActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt(cantidadTarta.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;
            Double precioElemento;

            nombreElemento = cmbTarta.getSelectedItem().toString();
            precioElemento = Double.valueOf(lblPrecioCantidadTarta.getText());

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
    }//GEN-LAST:event_btnAgregarTartaActionPerformed

    private void cmbTartaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbTartaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombrePostre = (String) cmbTarta.getSelectedItem();

            // Busca el platillo correspondiente en la lista de comidas
            Postre postreSeleccionado = null;
            for (Postre postre : restaurante.getPostresTarta()) {
                if (postre.getNombre().equals(nombrePostre)) {
                    postreSeleccionado = postre;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (postreSeleccionado != null) {
                double precio = postreSeleccionado.getPrecio();
                lblPrecioCantidadTarta.setText(String.valueOf(precio));
                // Reemplaza "ruta_de_la_imagen.jpg" con la ruta de tu imagen
                ImageIcon icon = new ImageIcon(postreSeleccionado.getRutaImagen());
                labelTarta.setIcon(icon);
            }
        }
    }//GEN-LAST:event_cmbTartaItemStateChanged

    private void cmbFlanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFlanItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombreBebida = (String) cmbFlan.getSelectedItem();

            // Busca el platillo correspondiente en la lista de comidas
            Postre postreSeleccionado = null;
            for (Postre postre : restaurante.getPostresFlan()) {
                if (postre.getNombre().equals(nombreBebida)) {
                    postreSeleccionado = postre;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (postreSeleccionado != null) {
                double precio = postreSeleccionado.getPrecio();
                lblPrecioFlan.setText(String.valueOf(precio));
                // Reemplaza "ruta_de_la_imagen.jpg" con la ruta de tu imagen
                ImageIcon icon = new ImageIcon(postreSeleccionado.getRutaImagen());
                labelFlan.setIcon(icon);
            }
        }
    }//GEN-LAST:event_cmbFlanItemStateChanged

    private void btnAgregarFlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarFlanActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt(cantidadFlan.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;
            Double precioElemento;

            nombreElemento = cmbFlan.getSelectedItem().toString();
            precioElemento = Double.valueOf(lblPrecioFlan.getText());

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
    }//GEN-LAST:event_btnAgregarFlanActionPerformed

    private void cmbPastelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPastelActionPerformed

    }//GEN-LAST:event_cmbPastelActionPerformed

    private void cmbTartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTartaActionPerformed
        
    }//GEN-LAST:event_cmbTartaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ComidaView(recibo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new BebidaView(recibo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {

        } catch (InstantiationException ex) {

        } catch (IllegalAccessException ex) {

        } catch (UnsupportedLookAndFeelException ex) {

        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostreView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarFlan;
    private javax.swing.JButton btnAgregarPastel;
    private javax.swing.JButton btnAgregarTarta;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JSpinner cantidadFlan;
    private javax.swing.JSpinner cantidadPastel;
    private javax.swing.JSpinner cantidadTarta;
    private javax.swing.JComboBox<String> cmbFlan;
    private javax.swing.JComboBox<String> cmbPastel;
    private javax.swing.JComboBox<String> cmbTarta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel labelFlan;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel labelPastel;
    private javax.swing.JLabel labelTarta;
    private javax.swing.JLabel lblPastel;
    private javax.swing.JLabel lblPrecioCantidadTarta;
    private javax.swing.JLabel lblPrecioFlan;
    private javax.swing.JLabel precioFlan;
    private javax.swing.JLabel precioPastel;
    private javax.swing.JLabel precioTarta;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos() {
        for (Postre postre : restaurante.getPostresPastel()) {
            cmbPastel.addItem(postre.getNombre());
            lblPastel.setText(String.valueOf(postre.getPrecio()));
        }
        for (Postre postre1 : restaurante.getPostresTarta()) {
            cmbTarta.addItem(postre1.getNombre());
            lblPrecioCantidadTarta.setText(String.valueOf(postre1.getPrecio()));
        }

        for (Postre postre2 : restaurante.getPostresFlan()) {
            cmbFlan.addItem(postre2.getNombre());
            lblPrecioFlan.setText(String.valueOf(postre2.getPrecio()));
        }
    }
}
