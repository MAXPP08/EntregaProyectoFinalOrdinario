/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: controller de las funciones de registro
 */
package controller;

import entity.ElementoMenu;
import entity.Recibo;
import javax.swing.table.DefaultTableModel;
import service.IReciboService;
import service.ReciboServiceImpl;

public class ReciboController {

    private IReciboService service = new ReciboServiceImpl();

    //El método crea un Registro
    public Recibo crearRegistro() {
        return service.crearRegistro();
    }

    //El método crea un Elemento
    public void agregarElemento(Recibo recibo, ElementoMenu elemento) {
        service.agregarElemento(recibo, elemento);
    }

    //El método que imprime el recibo
    public void imprimirRecibo(Recibo recibo, DefaultTableModel modelo) {
        service.imprimirRecibo(recibo, modelo);
    }

    //El método que elimina el recibo
    public void eliminarRecibo(int id, Recibo recibo) {
        if (!recibo.getElementos().isEmpty()) {
            service.eliminarRegistro(id, recibo);
        }
    }

    //El método que genera el recibo
    public double generarCuenta(Recibo recibo) {
        if (recibo.getElementos().isEmpty()) {
            return 0;
        }
        return service.generarCuenta(recibo);
    }
}
