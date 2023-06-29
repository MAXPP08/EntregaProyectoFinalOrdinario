/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: service interface del recibo
 */
package service;

import entity.ElementoMenu;
import entity.Recibo;
import javax.swing.table.DefaultTableModel;

public interface IReciboService {
    
    // agrega un elemento
    public void agregarElemento(Recibo recibo, ElementoMenu elemento);

    // imprime el recibo
    public void imprimirRecibo(Recibo recibo, DefaultTableModel modelo);

    // crea el registro
    public Recibo crearRegistro();
    
    // elimina un registro
    public void eliminarRegistro(int id, Recibo recibo);
    
    public double generarCuenta(Recibo recibo);
}
