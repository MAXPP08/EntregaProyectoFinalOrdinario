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
import entity.Bebida;
import entity.ElementoMenu;
import entity.Restaurante;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BebidaView extends javax.swing.JFrame {

    private RestauranteController controllerRestaurante;
    private Restaurante restaurante;
    private ReciboController controllerRecibo;
    private Recibo recibo;

    private ElementoMenuController controllerElementoMenu;
    private ElementoMenu elemento;
    
    public BebidaView() {
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
    
    public BebidaView(Recibo recibo){
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
        labelBebidasNatural = new javax.swing.JLabel();
        labelBebidaCarbonatada = new javax.swing.JLabel();
        labelBebidaAlcoholica = new javax.swing.JLabel();
        cmbBebidaNutural = new javax.swing.JComboBox<>();
        cmbBebidaCarbonatada = new javax.swing.JComboBox<>();
        cmbBebidaAlcoholica = new javax.swing.JComboBox<>();
        cantidadBebidaNatural = new javax.swing.JSpinner();
        cantidadBebidaCarbonatada = new javax.swing.JSpinner();
        cantidadBebidaAlcoholica = new javax.swing.JSpinner();
        btnAgregarBebidaNatural = new javax.swing.JButton();
        precioBebidaAlcoholica = new javax.swing.JLabel();
        precioBebidaNatural = new javax.swing.JLabel();
        precioBebidaCarbonatada = new javax.swing.JLabel();
        btnAgregarBebidaAlcoholica = new javax.swing.JButton();
        btnAgregarBebidaCarbonatada = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblBebidaNatural = new javax.swing.JLabel();
        lblPrecioCantidadBebidaCarbonatada = new javax.swing.JLabel();
        lblPrecioBebidaAlcoholica = new javax.swing.JLabel();
        btnComida = new javax.swing.JButton();
        btnBebida = new javax.swing.JButton();
        btnPostre = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ItemInicio = new javax.swing.JMenuItem();
        itemMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/logoRestaurante.png"))); // NOI18N
        getContentPane().add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 6, -1, -1));

        labelBebidasNatural.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/AguaCoco.jpg"))); // NOI18N
        getContentPane().add(labelBebidasNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 210, -1, -1));

        labelBebidaCarbonatada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/coca-cola.jpeg"))); // NOI18N
        getContentPane().add(labelBebidaCarbonatada, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        labelBebidaAlcoholica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodImages/Cerveza-Corona.jpg"))); // NOI18N
        getContentPane().add(labelBebidaAlcoholica, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        cmbBebidaNutural.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBebidaNuturalItemStateChanged(evt);
            }
        });
        cmbBebidaNutural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBebidaNuturalActionPerformed(evt);
            }
        });
        getContentPane().add(cmbBebidaNutural, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 342, -1, -1));

        cmbBebidaCarbonatada.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBebidaCarbonatadaItemStateChanged(evt);
            }
        });
        cmbBebidaCarbonatada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBebidaCarbonatadaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbBebidaCarbonatada, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, -1, -1));

        cmbBebidaAlcoholica.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbBebidaAlcoholicaItemStateChanged(evt);
            }
        });
        getContentPane().add(cmbBebidaAlcoholica, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 340, -1, -1));

        cantidadBebidaNatural.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(cantidadBebidaNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 396, -1, -1));

        cantidadBebidaCarbonatada.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        cantidadBebidaCarbonatada.setToolTipText("");
        getContentPane().add(cantidadBebidaCarbonatada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        cantidadBebidaAlcoholica.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        getContentPane().add(cantidadBebidaAlcoholica, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, -1, 20));

        btnAgregarBebidaNatural.setText("Agregar Orden");
        btnAgregarBebidaNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBebidaNaturalActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarBebidaNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 396, -1, -1));

        precioBebidaAlcoholica.setText("Precio");
        getContentPane().add(precioBebidaAlcoholica, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, -1, -1));

        precioBebidaNatural.setText("Precio");
        getContentPane().add(precioBebidaNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 370, -1, -1));

        precioBebidaCarbonatada.setText("Precio");
        getContentPane().add(precioBebidaCarbonatada, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        btnAgregarBebidaAlcoholica.setText("Agregar Orden");
        btnAgregarBebidaAlcoholica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBebidaAlcoholicaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarBebidaAlcoholica, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));

        btnAgregarBebidaCarbonatada.setText("Agregar Orden");
        btnAgregarBebidaCarbonatada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarBebidaCarbonatadaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarBebidaCarbonatada, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 403, -1, -1));

        btnContinuar.setText("Pagar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(642, 425, -1, -1));

        lblBebidaNatural.setText("0");
        getContentPane().add(lblBebidaNatural, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 370, -1, -1));

        lblPrecioCantidadBebidaCarbonatada.setText("0");
        getContentPane().add(lblPrecioCantidadBebidaCarbonatada, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, -1, -1));

        lblPrecioBebidaAlcoholica.setText("0");
        getContentPane().add(lblPrecioBebidaAlcoholica, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, 50, -1));

        btnComida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/comida.png"))); // NOI18N
        btnComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        btnBebida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/bebida.png"))); // NOI18N
        getContentPane().add(btnBebida, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        btnPostre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/postre.png"))); // NOI18N
        btnPostre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostreActionPerformed(evt);
            }
        });
        getContentPane().add(btnPostre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        jMenu1.setText("Usos");

        ItemInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/hogar.png"))); // NOI18N
        ItemInicio.setText("Inicio");
        ItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemInicioActionPerformed(evt);
            }
        });
        jMenu1.add(ItemInicio);

        itemMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconImages/menu.png"))); // NOI18N
        itemMenu.setText("Menú");
        itemMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuActionPerformed(evt);
            }
        });
        jMenu1.add(itemMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuActionPerformed
        ComidaView comida = new ComidaView(recibo);
        comida.setVisible(true);
        dispose();
    }//GEN-LAST:event_itemMenuActionPerformed

    private void cmbBebidaNuturalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBebidaNuturalItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombreBebida = (String) cmbBebidaNutural.getSelectedItem();
            
            // Busca el platillo correspondiente en la lista de comidas
            Bebida bebidaSeleccionada = null;
            for (Bebida bebida : restaurante.getBebidasNaturales()) {
                if (bebida.getNombre().equals(nombreBebida)) {
                    bebidaSeleccionada = bebida;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (bebidaSeleccionada != null) {
                double precio = bebidaSeleccionada.getPrecio();
                lblBebidaNatural.setText(String.valueOf(precio));
                // Reemplaza "ruta_de_la_imagen.jpg" con la ruta de tu imagen
                ImageIcon icon = new ImageIcon(bebidaSeleccionada.getRutaImagen()); 
                labelBebidasNatural.setIcon(icon);
            }
        }
    }//GEN-LAST:event_cmbBebidaNuturalItemStateChanged

    private void btnAgregarBebidaNaturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBebidaNaturalActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt
        (cantidadBebidaNatural.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;

            Double precioElemento;

            nombreElemento = cmbBebidaNutural.getSelectedItem().toString();

            precioElemento = Double.valueOf(lblBebidaNatural.getText());

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
    }//GEN-LAST:event_btnAgregarBebidaNaturalActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        new CuentaView(recibo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnAgregarBebidaCarbonatadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBebidaCarbonatadaActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt
        (cantidadBebidaCarbonatada.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;

            Double precioElemento;

            nombreElemento = cmbBebidaCarbonatada.getSelectedItem().toString();

            precioElemento = Double.valueOf(lblPrecioCantidadBebidaCarbonatada.getText());

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
    }//GEN-LAST:event_btnAgregarBebidaCarbonatadaActionPerformed

    private void cmbBebidaCarbonatadaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBebidaCarbonatadaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombreBebida = (String) cmbBebidaCarbonatada.getSelectedItem();

            // Busca el platillo correspondiente en la lista de comidas
            Bebida bebidaSeleccionada = null;
            for (Bebida bebida : restaurante.getBebidasCarbonatadas()) {
                if (bebida.getNombre().equals(nombreBebida)) {
                    bebidaSeleccionada = bebida;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (bebidaSeleccionada != null) {
                double precio = bebidaSeleccionada.getPrecio();
                lblPrecioCantidadBebidaCarbonatada.setText(String.valueOf(precio));
                // Reemplaza "ruta_de_la_imagen.jpg" con la ruta de tu imagen
                ImageIcon icon = new ImageIcon(bebidaSeleccionada.getRutaImagen()); 
                labelBebidaCarbonatada.setIcon(icon);
            }
        }
    }//GEN-LAST:event_cmbBebidaCarbonatadaItemStateChanged

    private void cmbBebidaAlcoholicaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbBebidaAlcoholicaItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            // Obtén el nombre del platillo seleccionado
            String nombreBebida = (String) cmbBebidaAlcoholica.getSelectedItem();

            // Busca el platillo correspondiente en la lista de comidas
            Bebida bebidaSeleccionada = null;
            for (Bebida bebida : restaurante.getBebidasAlcoholicas()) {
                if (bebida.getNombre().equals(nombreBebida)) {
                    bebidaSeleccionada = bebida;
                    break;
                }
            }

            // Si se encontró el platillo, muestra su precio en el JLabel
            if (bebidaSeleccionada != null) {
                double precio = bebidaSeleccionada.getPrecio();
                lblPrecioBebidaAlcoholica.setText(String.valueOf(precio));
                // Reemplaza "ruta_de_la_imagen.jpg" con la ruta de tu imagen
                ImageIcon icon = new ImageIcon(bebidaSeleccionada.getRutaImagen()); 
                labelBebidaAlcoholica.setIcon(icon);
            }
        }
    }//GEN-LAST:event_cmbBebidaAlcoholicaItemStateChanged

    private void btnAgregarBebidaAlcoholicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarBebidaAlcoholicaActionPerformed
        int cantidadElemento;
        cantidadElemento = Integer.parseInt
        (cantidadBebidaAlcoholica.getValue().toString());
        if (cantidadElemento > 0) {
            String nombreElemento;

            Double precioElemento;

            nombreElemento = cmbBebidaAlcoholica.getSelectedItem().toString();

            precioElemento = Double.valueOf(lblPrecioBebidaAlcoholica.getText());

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
    }//GEN-LAST:event_btnAgregarBebidaAlcoholicaActionPerformed

    private void cmbBebidaNuturalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBebidaNuturalActionPerformed
        
    }//GEN-LAST:event_cmbBebidaNuturalActionPerformed

    private void cmbBebidaCarbonatadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBebidaCarbonatadaActionPerformed
        
    }//GEN-LAST:event_cmbBebidaCarbonatadaActionPerformed

    private void btnComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComidaActionPerformed
        new ComidaView(recibo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnComidaActionPerformed

    private void btnPostreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostreActionPerformed
        new PostreView(recibo).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPostreActionPerformed

    private void ItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemInicioActionPerformed
        LogueoPrincipal logueo = new LogueoPrincipal();
        logueo.setVisible(true);
        dispose();
    }//GEN-LAST:event_ItemInicioActionPerformed

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
                new BebidaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemInicio;
    private javax.swing.JButton btnAgregarBebidaAlcoholica;
    private javax.swing.JButton btnAgregarBebidaCarbonatada;
    private javax.swing.JButton btnAgregarBebidaNatural;
    private javax.swing.JButton btnBebida;
    private javax.swing.JButton btnComida;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnPostre;
    private javax.swing.JSpinner cantidadBebidaAlcoholica;
    private javax.swing.JSpinner cantidadBebidaCarbonatada;
    private javax.swing.JSpinner cantidadBebidaNatural;
    private javax.swing.JComboBox<String> cmbBebidaAlcoholica;
    private javax.swing.JComboBox<String> cmbBebidaCarbonatada;
    private javax.swing.JComboBox<String> cmbBebidaNutural;
    private javax.swing.JMenuItem itemMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel labelBebidaAlcoholica;
    private javax.swing.JLabel labelBebidaCarbonatada;
    private javax.swing.JLabel labelBebidasNatural;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JLabel lblBebidaNatural;
    private javax.swing.JLabel lblPrecioBebidaAlcoholica;
    private javax.swing.JLabel lblPrecioCantidadBebidaCarbonatada;
    private javax.swing.JLabel precioBebidaAlcoholica;
    private javax.swing.JLabel precioBebidaCarbonatada;
    private javax.swing.JLabel precioBebidaNatural;
    // End of variables declaration//GEN-END:variables

    /**
     * Método encargado de cargar todos los datos
     */
    private void cargarDatos() {
        
        for (Bebida bebida : restaurante.getBebidasNaturales()) {
            cmbBebidaNutural.addItem(bebida.getNombre());
            lblBebidaNatural.setText(String.valueOf(bebida.getPrecio()));
        }
        for (Bebida bebida1 : restaurante.getBebidasCarbonatadas()) {
            cmbBebidaCarbonatada.addItem(bebida1.getNombre());
            lblPrecioCantidadBebidaCarbonatada.setText(String.valueOf(bebida1.getPrecio()));
        }

        for (Bebida bebida2 : restaurante.getBebidasAlcoholicas()) {
            cmbBebidaAlcoholica.addItem(bebida2.getNombre());
            lblPrecioBebidaAlcoholica.setText(String.valueOf(bebida2.getPrecio()));
        }
    }
}
