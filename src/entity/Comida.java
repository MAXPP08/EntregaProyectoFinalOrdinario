/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: entity de comida
 */
package entity;

public class Comida extends Menu {

    private int tiempoPreparacion;

    public Comida(String nombre, double precio, int tiempoPreparacion, 
            String rutaImagen) {
        super(nombre, precio, rutaImagen);
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    /**
     * Método para calcular la cuenta
     *
     * @param cantidad
     * @return
     */
    @Override
    public double calcularPrecioTotal(int cantidad) {
        return getPrecio() * cantidad;
    }
}
