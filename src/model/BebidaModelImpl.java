/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 26/06/2023
 * Descripción: model de la bebida
 */
package model;

import entity.Bebida;
import java.util.List;

public class BebidaModelImpl implements IBebidaModel {

    /**
     * El método "crearRegistro" recibe una lista de bebidas y una bebida
     * específica como parámetros, y agrega la bebida a la lista.
     *
     * @param lista
     * @param bebida
     */
    @Override
    public void crearRegistro(List<Bebida> lista, Bebida bebida) {
        lista.add(bebida);
    }

    /**
     * El método "eliminarRegistro" recibe una lista de bebidas y el nombre de
     * una bebida como parámetro. Itera sobre la lista y busca una coincidencia
     * de nombre. Si encuentra una coincidencia, elimina la bebida
     * correspondiente de la lista.
     *
     * @param lista
     * @param nombre
     */
    @Override
    public void eliminarRegistro(List<Bebida> lista, String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo(nombre) == 0) {
                lista.remove(i);
                break;
            }
        }
    }

    /**
     * El método "actualizarRegistro" recibe una lista de bebidas y una bebida
     * actualizada como parámetros. Itera sobre la lista y busca una
     * coincidencia de nombre. Si encuentra una coincidencia, reemplaza la
     * bebida existente con la bebida actualizada.
     *
     * @param lista
     * @param bebida
     */
    @Override
    public void actualizarRegistro(List<Bebida> lista, Bebida bebida) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo(bebida.getNombre()) == 0) {
                lista.set(i, bebida);
                break;
            }
        }
    }

    /**
     * El método "obtenerRegistro" recibe una lista de bebidas y un ID como
     * parámetro, y devuelve la bebida correspondiente a ese ID.
     *
     * @param lista
     * @param modelo
     */
    @Override
    public Bebida obtenerRegistro(List<Bebida> lista, int id) {
        return lista.get(id);
    }
}
