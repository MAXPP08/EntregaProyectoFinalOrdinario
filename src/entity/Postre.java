/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: entity de un postre
 */
package entity;

public class Postre extends Menu {

    private boolean esSinAzucar;

    public Postre(String nombre, double precio, boolean esSinAzucar, 
            String rutaImagen) {
        super(nombre, precio, rutaImagen);
        this.esSinAzucar = esSinAzucar;
    }

    public boolean isEsSinAzucar() {
        return esSinAzucar;
    }

    public void setEsSinAzucar(boolean esSinAzucar) {
        this.esSinAzucar = esSinAzucar;
    }

    /**
     * Calculamos el precio total
     * @param cantidad
     * @return 
     */
    @Override
    public double calcularPrecioTotal(int cantidad) {
        return getPrecio() * cantidad;
    }
}
