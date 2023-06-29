/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model interface del restaurante
 */
package model;

import entity.Restaurante;

public interface IRestauranteModel {

    /**
     * CrearRegistro, que se encarga de crear y devolver un nuevo objeto de 
     * tipo Restaurante.
     * @return 
     */
    public Restaurante crearRegistro();
}
