/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 12/06/2023
 * Descripción: entity de un elemento del menú
 */
package entity;

public class ElementoMenu {

    private String nombre;
    private int cantidad;
    private Double precio;

    public ElementoMenu() {
    }

    public ElementoMenu(String nombreElemento,
            int cantidadElemento, Double precioElemento) {
        this.nombre = nombreElemento;
        this.cantidad = cantidadElemento;
        this.precio = precioElemento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioTotal() {
        return precio*cantidad;
    }

    public void setPrecio(Double precioTotal) {
        this.precio = precioTotal;
    }
}
