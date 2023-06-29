/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model interface del recibo
 */
package model;

import entity.ElementoMenu;
import entity.Recibo;
import javax.swing.table.DefaultTableModel;

public interface IReciboModel {

    /**
     * Este método recibe un objeto de tipo Recibo y un objeto de tipo 
     * ElementoMenu. Se encarga de agregar el elemento al recibo.
     * @param recibo
     * @param elemento 
     */
    public void agregarElemento(Recibo recibo, ElementoMenu elemento);

    /**
     * Este método recibe un objeto de tipo Recibo y un objeto de tipo 
     * DefaultTableModel. Se utiliza para imprimir el recibo utilizando el 
     * modelo de tabla proporcionado.
     * @param recibo
     * @param modelo 
     */
    public void imprimirRecibo(Recibo recibo, DefaultTableModel modelo);

    /**
     * Este método crea y devuelve un nuevo objeto de tipo Recibo.
     * @return 
     */
    public Recibo crearRegistro();
    
    /**
     * Este método recibe un ID y un objeto de tipo Recibo. Se utiliza para 
     * eliminar un registro de recibo específico mediante el ID proporcionado.
     * @param id
     * @param recibo 
     */
    public void eliminarRegistro(int id, Recibo recibo);
    
    /**
     * Este método recibe un objeto de tipo Recibo.
     * @param recibo
     * @return 
     */
    public double generarCuenta(Recibo recibo);

}
