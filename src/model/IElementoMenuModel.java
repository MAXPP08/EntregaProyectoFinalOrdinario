/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model interface de un elemento
 */
package model;

import entity.ElementoMenu;

public interface IElementoMenuModel{
    
    /**
     * crearRegistro() que se encarga de crear y devolver un objeto de tipo
     * ElementoMenu.
     * @return 
     */
   public ElementoMenu crearRegistro(); 
}
