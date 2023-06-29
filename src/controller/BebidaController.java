/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: controller de la bebida
 */
package controller;

import entity.Bebida;
import java.util.List;
import service.BebidaServiceImpl;
import service.IBebidaService;

public class BebidaController {

    // Unimos el servicio y controller
    IBebidaService service = new BebidaServiceImpl();

    //El método crea una bebida
    public void crearRegistro(List<Bebida> lista, Bebida bebida) {
        service.crearRegistro(lista, bebida);
    }

    //El método elimina un entrenador
    public void eliminarRegistro(List<Bebida> lista, String nombre) {
        service.eliminarRegistro(lista, nombre);
    }

    //El método actualiza un entrenador
    public void actualizarRegistro(List<Bebida> lista, Bebida bebida) {
        service.actualizarRegistro(lista, bebida);
    }

    //El método muestra un entrenador
    public Bebida obtenerRegistro(List<Bebida> lista, int id) {
        return service.obtenerRegistro(lista, id);
    }
}
