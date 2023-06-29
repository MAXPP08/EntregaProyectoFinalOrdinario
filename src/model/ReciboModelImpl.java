/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model del recibo
 */
package model;

import entity.ElementoMenu;
import entity.Recibo;
import javax.swing.table.DefaultTableModel;

public class ReciboModelImpl implements IReciboModel {

    /**
     * agregarElemento, se agrega un objeto de tipo ElementoMenu a la lista de 
     * elementos del recibo.
     * @param recibo
     * @param elemento 
     */
    @Override
    public void agregarElemento(Recibo recibo, ElementoMenu elemento) {
        recibo.getElementos().add(elemento);
    }

    /**
     * imprimirRecibo, se recorre la lista de elementos del recibo y se agrega
     * cada elemento a un modelo de tabla (DefaultTableModel) para su posterior 
     * visualización.
     * @param recibo
     * @param modelo 
     */
    @Override
    public void imprimirRecibo(Recibo recibo, DefaultTableModel modelo) {
        modelo.setRowCount(0);
        for (ElementoMenu elemento : recibo.getElementos()) {
            Object[] fila = new Object[3];

            fila[0] = elemento.getNombre();
            fila[1] = elemento.getPrecioTotal();
            fila[2] = elemento.getCantidad();

            modelo.addRow(fila);
        }
    }

    /**
     * crearRegistro, se crea y devuelve un nuevo objeto de tipo Recibo.
     * @return 
     */
    @Override
    public Recibo crearRegistro() {
        return new Recibo();
    }

    /**
     * eliminarRegistro, se elimina un elemento del recibo basado en su índice.
     * @param id
     * @param recibo 
     */
    @Override
    public void eliminarRegistro(int id, Recibo recibo) {
        recibo.getElementos().remove(id);
    }

    /**
     * generarCuenta, retorna el total de la cuenta
     * @param recibo
     * @return 
     */
    @Override
    public double generarCuenta(Recibo recibo) {
        double totalCuenta=0.0;
        for (ElementoMenu elemento : recibo.getElementos()) {
            totalCuenta = elemento.getPrecioTotal()+totalCuenta;
        }
        return totalCuenta;
    }
}
