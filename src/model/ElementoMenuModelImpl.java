/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: model del elementoModel
 */
package model;

import entity.ElementoMenu;

public class ElementoMenuModelImpl implements IElementoMenuModel{
    
    /**
     * El método "crearRegistro" no recibe parámetros y simplemente crea y 
     * devuelve un nuevo objeto "ElementoMenu" vacío. 
     * @return 
     */
    @Override
    public ElementoMenu crearRegistro(){
        return new ElementoMenu();
    }
}
