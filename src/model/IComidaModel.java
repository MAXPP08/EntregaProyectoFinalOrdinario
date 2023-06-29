/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model interface del la comida
 */
package model;

import entity.Comida;
import java.util.List;

public interface IComidaModel {

    /**
     *  Este método recibe una lista de comidas y un objeto de tipo Comida y se
     * encarga de agregar la comida a la lista.
     * @param lista
     * @param comida 
     */
    public void crearRegistro(List<Comida> lista, Comida comida);

    /**
     *  Este método recibe una lista de comidas y un nombre de comida, y se 
     * encarga de buscar y eliminar la comida correspondiente de la lista.
     * @param lista
     * @param nombre 
     */
    public void eliminarRegistro(List<Comida> lista, String nombre);

    /**
     * Este método recibe una lista de comidas y un objeto de tipo Comida y se 
     * encarga de buscar y actualizar la comida correspondiente en la lista.
     * @param lista
     * @param comida 
     */
    public void actualizarRegistro(List<Comida> lista, Comida comida);

    /**
     * Este método recibe una lista de comidas y un identificador de comida (id)
     * y devuelve el objeto Comida correspondiente en la lista.
     * @param lista
     * @param id
     * @return 
     */
    public Comida obtenerRegistro(List<Comida> lista, int id);
}
