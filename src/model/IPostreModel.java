/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model interface del postre
 */
package model;

import entity.Postre;
import java.util.List;

public interface IPostreModel {

    /**
     * Este método recibe una lista de postres y un objeto de tipo Postre.
     * Se encarga de agregar el postre a la lista.
     * @param lista
     * @param postre 
     */
    public void crearRegistro(List<Postre> lista, Postre postre);

    /**
     * Este método recibe una lista de postres y el nombre del postre a 
     * eliminar. Elimina de la lista el postre cuyo nombre coincida con el 
     * proporcionado.
     * @param lista
     * @param nombre 
     */
    public void eliminarRegistro(List<Postre> lista, String nombre);

    /**
     * Este método recibe una lista de postres y un objeto de tipo Postre.
     * Actualiza el registro del postre en la lista con el mismo nombre.
     * @param lista
     * @param postre 
     */
    public void actualizarRegistro(List<Postre> lista, Postre postre);

    /**
     *  Este método recibe una lista de postres y un ID. Devuelve el postre 
     * correspondiente al ID proporcionado.
     * @param lista
     * @param id
     * @return 
     */
    public Postre obtenerRegistro(List<Postre> lista, int id);
}
