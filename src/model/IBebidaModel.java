/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model interface del la bebida
 */
package model;

import entity.Bebida;
import java.util.List;

public interface IBebidaModel {

    /**
     * Este método recibe una lista de bebidas y un objeto de tipo Bebida y se 
     * encarga de agregar la bebida a la lista.
     * @param lista
     * @param bebida 
     */
    public void crearRegistro(List<Bebida> lista, Bebida bebida);

    /**
     * Este método recibe una lista de bebidas y un nombre de bebida, y se 
     * encarga de buscar y eliminar la bebida correspondiente de la lista.
     * @param lista
     * @param nombre 
     */
    public void eliminarRegistro(List<Bebida> lista, String nombre);

    /**
     * Este método recibe una lista de bebidas y un objeto de tipo Bebida y se 
     * encarga de buscar y actualizar la bebida correspondiente en la lista.
     * @param lista
     * @param bebida 
     */
    public void actualizarRegistro(List<Bebida> lista, Bebida bebida);

    /**
     * Este método recibe una lista de bebidas y un identificador de bebida 
     * (id) y devuelve el objeto Bebida correspondiente en la lista.
     * @param lista
     * @param id
     * @return 
     */
    public Bebida obtenerRegistro(List<Bebida> lista, int id);
}
