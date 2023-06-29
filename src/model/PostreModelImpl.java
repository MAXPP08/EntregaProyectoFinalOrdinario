/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model del postre
 */
package model;

import entity.Postre;
import java.util.List;

public class PostreModelImpl implements IPostreModel {

    /**
     * crearRegistro, se agrega un objeto de tipo Postre a la lista de postres.
     *
     * @param lista
     * @param postre
     */
    @Override
    public void crearRegistro(List<Postre> lista, Postre postre) {
        lista.add(postre);
    }

    /**
     * eliminarRegistro, se busca un postre por su nombre y se elimina de la
     * lista de postres.
     *
     * @param lista
     * @param nombre
     */
    @Override
    public void eliminarRegistro(List<Postre> lista, String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo(nombre) == 0) {
                lista.remove(i);
                break;
            }
        }
    }

    /**
     * actualizarRegistro, se busca un postre por su nombre y se actualiza con
     * un nuevo objeto de tipo Postre.
     *
     * @param lista
     * @param postre
     */
    @Override
    public void actualizarRegistro(List<Postre> lista, Postre postre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo(postre.getNombre()) == 0) {
                lista.set(i, postre);
                break;
            }
        }
    }

    /**
     * obtenerRegistro, se obtiene un postre de la lista de postres basado en su
     * índice.
     *
     * @param lista
     * @param modelo
     */
    @Override
    public Postre obtenerRegistro(List<Postre> lista, int id) {
        return lista.get(id);
    }
}
