/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: service de recibo
 */
package service;

import entity.ElementoMenu;
import entity.Recibo;
import javax.swing.table.DefaultTableModel;
import model.IReciboModel;
import model.ReciboModelImpl;

public class ReciboServiceImpl implements IReciboService {

    // se une model con service
    private IReciboModel model = new ReciboModelImpl();

    @Override
    public void agregarElemento(Recibo recibo, ElementoMenu elemento) {
        model.agregarElemento(recibo, elemento);
    }

    @Override
    public void imprimirRecibo(Recibo recibo, DefaultTableModel modelo) {
        model.imprimirRecibo(recibo, modelo);
    }

    @Override
    public Recibo crearRegistro() {
        return model.crearRegistro();
    }

    @Override
    public void eliminarRegistro(int id, Recibo recibo) {
        model.eliminarRegistro(id, recibo);
    }

    @Override
    public double generarCuenta(Recibo recibo) {
        return model.generarCuenta(recibo);
    }
}
