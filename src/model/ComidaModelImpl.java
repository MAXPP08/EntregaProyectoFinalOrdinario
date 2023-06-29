/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 26/06/2023
 * Descripción: model de la comida
 */
package model;

import entity.Comida;
import java.util.List;

public class ComidaModelImpl implements IComidaModel {

    /**
     * El método "crearRegistro" recibe una lista de comidas y una comida 
     * específica como parámetros, y agrega la comida a la lista.
     *
     * @param lista
     * @param comida
     */
    @Override
    public void crearRegistro(List<Comida> lista, Comida comida) {
        lista.add(comida);
    }

    /**
     * El método "eliminarRegistro" recibe una lista de comidas y el nombre de 
     * una comida como parámetro. Itera sobre la lista y busca una coincidencia 
     * de nombre. Si encuentra una coincidencia, elimina la comida 
     * correspondiente de la lista.
     *
     * @param lista
     * @param nombre
     */
    @Override
    public void eliminarRegistro(List<Comida> lista, String nombre) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo
        (nombre) == 0) {
                lista.remove(i);
                break;
            }
        }
    }

    /**
     * El método "actualizarRegistro" recibe una lista de comidas y una comida
     * actualizada como parámetros. Itera sobre la lista y busca una 
     * coincidencia de nombre. Si encuentra una coincidencia, reemplaza la 
     * comida existente con la comida actualizada.
     *
     * @param lista
     * @param comida
     */
    @Override
    public void actualizarRegistro(List<Comida> lista, Comida comida) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNombre().compareTo
        (comida.getNombre()) == 0) {
                lista.set(i, comida);
                break;
            }
        }
    }

    /**
     * El método "obtenerRegistro" recibe una lista de comidas y un ID como 
     * parámetro, y devuelve la comida correspondiente a ese ID.
     *
     * @param lista
     * @param modelo
     */
    @Override
    public Comida obtenerRegistro(List<Comida> lista, int id) {
        return lista.get(id);
    }
}
