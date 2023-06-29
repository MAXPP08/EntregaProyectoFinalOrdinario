/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: entity de bebida
 */
package entity;

public class Bebida extends Menu {
    
    private String tamaño;
    private boolean disponible;

    public Bebida(String nombre, double precio, String tamaño, 
            String rutaImagen) {
        super(nombre, precio,rutaImagen);
        this.tamaño = tamaño;
        this.disponible = true; //Por defecto, la bebida se considera disponible
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Implementación del método para Calcular el Precio Total
     * @param cantidad
     * @return 
     */
    @Override
    public double calcularPrecioTotal(int cantidad) {
        return getPrecio() * cantidad;
    }
}
