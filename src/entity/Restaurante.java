/**
 * Autor: Maximiliano Pacheco Pérez
 * Fecha de Creación: 01/06/2023
 * Fecha de Actualización: 25/06/2023
 * Descripción: Se crean las listas de contenido de los combo
 */
package entity;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {

    // Declaración de Lista para cada elemento del Menú
    private List<Comida> comidasPescado;
    private List<Comida> comidasExoticas;
    private List<Comida> comidasFuertes;
    private List<Bebida> bebidasNaturales;
    private List<Bebida> bebidasCarbonatadas;
    private List<Bebida> bebidasAlcoholicas;
    private List<Postre> postresPastel;
    private List<Postre> postresTarta;
    private List<Postre> postresFlan;

    public Restaurante(List<Comida> comidasPescado, List<Comida> comidasExoticas,
            List<Comida> comidasFuertes, List<Bebida> bebidasNaturales,
            List<Bebida> bebidasCarbonatadas, List<Bebida> bebidasAlcoholicas,
            List<Postre> postresPastel, List<Postre> postresTarta,
            List<Postre> postresFlan) {
        this.comidasPescado = comidasPescado;
        this.comidasExoticas = comidasExoticas;
        this.comidasFuertes = comidasFuertes;
        this.bebidasNaturales = bebidasNaturales;
        this.bebidasCarbonatadas = bebidasCarbonatadas;
        this.bebidasAlcoholicas = bebidasAlcoholicas;
        this.postresPastel = postresPastel;
        this.postresTarta = postresTarta;
        this.postresFlan = postresFlan;
    }

    public Restaurante() {
        bebidasNaturales = crearBebidasNaturales();
        bebidasCarbonatadas = crearBebidasCarbonatadas();
        bebidasAlcoholicas = crearBebidasAlcoholicas();
        comidasPescado = crearComidasPescado();
        comidasExoticas = crearComidasExoticas();
        comidasFuertes = crearComidasFuertes();
        postresPastel = crearPostresPastel();
        postresTarta = crearPostresTarta();
        postresFlan = crearPostresFlan();
    }

    public List<Comida> getComidasPescado() {
        return comidasPescado;
    }

    public void setComidasPescado(List<Comida> comidasPescado) {
        this.comidasPescado = comidasPescado;
    }

    public List<Comida> getComidasFuertes() {
        return comidasFuertes;
    }

    public void setComidasFuertes(List<Comida> comidasFuertes) {
        this.comidasFuertes = comidasFuertes;
    }

    public List<Comida> getComidasExoticas() {
        return comidasExoticas;
    }

    public void setComidasExoticas(List<Comida> comidasExoticas) {
        this.comidasExoticas = comidasExoticas;
    }

    public List<Bebida> getBebidasNaturales() {
        return bebidasNaturales;
    }

    public void setBebidasNaturales(List<Bebida> bebidasNaturales) {
        this.bebidasNaturales = bebidasNaturales;
    }

    public List<Bebida> getBebidasCarbonatadas() {
        return bebidasCarbonatadas;
    }

    public void setBebidasCarbonatadas(List<Bebida> bebidasCarbonatadas) {
        this.bebidasCarbonatadas = bebidasCarbonatadas;
    }

    public List<Bebida> getBebidasAlcoholicas() {
        return bebidasAlcoholicas;
    }

    public void setBebidasAlcoholicas(List<Bebida> bebidasAlcoholicas) {
        this.bebidasAlcoholicas = bebidasAlcoholicas;
    }

    public List<Postre> getPostresPastel() {
        return postresPastel;
    }

    public void setPostresPastel(List<Postre> postresPastel) {
        this.postresPastel = postresPastel;
    }

    public List<Postre> getPostresTarta() {
        return postresTarta;
    }

    public void setPostresTarta(List<Postre> postresTarta) {
        this.postresTarta = postresTarta;
    }

    public List<Postre> getPostresFlan() {
        return postresFlan;
    }

    public void setPostresFlan(List<Postre> postresFlan) {
        this.postresFlan = postresFlan;
    }

    /**
     * Contenido del combo de comidas Pescado
     *
     * @return
     */
    private List<Comida> crearComidasPescado() {
        comidasPescado = new ArrayList<>();

        Comida comida1 = new Comida("Pescado Frito", 9.99, 10,
                "src/foodImages/Pescado-Frito.jpg");
        comidasPescado.add(comida1);

        Comida comida2 = new Comida("Pescado a la Talla", 12.99, 15,
                "src/foodImages/Pescadoalatalla.jpg");
        comidasPescado.add(comida2);

        Comida comida3 = new Comida("Mojarra a la Diabla", 6.99, 5,
                "src/foodImages/mojarra-a-la-diabla.jpg");
        comidasPescado.add(comida3);

        return comidasPescado;
    }

    /**
     * Contenido del combo de comidas Exoticas
     *
     * @return
     */
    private List<Comida> crearComidasExoticas() {
        comidasExoticas = new ArrayList<>();

        Comida comida1 = new Comida("Ostiones Gratinados", 10.99, 10,
                "src/foodImages/Ostiones-Gratinados.jpg");
        comidasExoticas.add(comida1);

        Comida comida2 = new Comida("Cocktail Camaron-Pulpo", 8.99, 15,
                "src/foodImages/CocktailCamaronPulpo.jpg");
        comidasExoticas.add(comida2);

        Comida comida3 = new Comida("Pulpo a la Diabla", 9.99, 5,
                "src/foodImages/Pulpo-a-la-Diabla.jpg");
        comidasExoticas.add(comida3);

        return comidasExoticas;
    }

    /**
     * Contenido del combo de comidas Fuertes
     *
     * @return
     */
    private List<Comida> crearComidasFuertes() {
        comidasFuertes = new ArrayList<>();

        Comida comida1 = new Comida("Camarones Empanizados", 10.99, 10,
                "src/foodImages/CamaronesEmpanizados.png");
        comidasFuertes.add(comida1);

        Comida comida2 = new Comida("Filete al Ajo", 8.99, 15,
                "src/foodImages/FileteAjo.jpg");
        comidasFuertes.add(comida2);

        Comida comida3 = new Comida("Jaiba al Ajo", 9.99, 5,
                "src/foodImages/JaibaalAjo.jpg");
        comidasFuertes.add(comida3);

        return comidasFuertes;
    }

    /**
     * Contenido del combo de postres Pastel
     *
     * @return
     */
    private List<Postre> crearPostresPastel() {
        postresPastel = new ArrayList<>();

        Postre postre1 = new Postre("Pastel Chocolate", 6.99, false,
                "src/foodImages/PastelChocolate.jpg");
        postresPastel.add(postre1);

        Postre postre2 = new Postre("Pastel Fresa", 4.99, false,
                "src/foodImages/PastelFresa.jpeg");
        postresPastel.add(postre2);

        Postre postre3 = new Postre("Pastel 3 Leches", 5.99, false,
                "src/foodImages/3Leches.jpg");
        postresPastel.add(postre3);

        return postresPastel;
    }

    /**
     * Contenido del combo de postres Tarta
     *
     * @return
     */
    private List<Postre> crearPostresTarta() {
        postresTarta = new ArrayList<>();

        Postre postre1 = new Postre("Tarta Limón", 7.99, false,
                "src/foodImages/TartaLimon.jpeg");
        postresTarta.add(postre1);

        Postre postre2 = new Postre("Tarta Queso", 6.99, false,
                "src/foodImages/TartaQueso.jpg");
        postresTarta.add(postre2);

        Postre postre3 = new Postre("Tarta Manzana", 4.50, false,
                "src/foodImages/TartaManzana.jpeg");
        postresTarta.add(postre3);

        return postresTarta;
    }

    /**
     * Contenido del combo de postres Flan
     *
     * @return
     */
    private List<Postre> crearPostresFlan() {
        postresFlan = new ArrayList<>();

        Postre postre1 = new Postre("Flan Chocolate", 8.99, false,
                "src/foodImages/FlanChocolate.jpg");
        postresFlan.add(postre1);

        Postre postre2 = new Postre("Flan Queso", 5.50, false,
                "src/foodImages/FlanQueso.jpeg");
        postresFlan.add(postre2);

        Postre postre3 = new Postre("Flan Café", 3.50, false,
                "src/foodImages/FlanCafe.jpeg");
        postresFlan.add(postre3);

        return postresFlan;
    }

    /**
     * Contenido del combo bebidas Naturales
     *
     * @return
     */
    private List<Bebida> crearBebidasNaturales() {
        bebidasNaturales = new ArrayList<>();

        Bebida bebida1 = new Bebida("Agua de Coco", 20,
                "chico", "src/foodImages/AguaCoco.jpg");
        bebidasNaturales.add(bebida1);

        Bebida bebida2 = new Bebida("Agua de Limón", 30,
                "chico", "src/foodImages/agua-de-tuna-y-limon.jpg");
        bebidasNaturales.add(bebida2);

        Bebida bebida3 = new Bebida("Agua de Tamarindo", 40,
                "chico", "src/foodImages/Agua-de-tamarindo.jpg");
        bebidasNaturales.add(bebida3);

        return bebidasNaturales;
    }

    /**
     * Contenido del combo bebidas Carbonatadas
     *
     * @return
     */
    private List<Bebida> crearBebidasCarbonatadas() {
        bebidasCarbonatadas = new ArrayList<>();

        Bebida bebida1 = new Bebida("Coca-Cola", 20,
                "chico", "src/foodImages/coca-cola.jpeg");
        bebidasCarbonatadas.add(bebida1);

        Bebida bebida2 = new Bebida("Pepsi", 30,
                "chico", "src/foodImages/pepsi.jpg");
        bebidasCarbonatadas.add(bebida2);

        Bebida bebida3 = new Bebida("Sidral", 40,
                "chico", "src/foodImages/sidral.jpg");
        bebidasCarbonatadas.add(bebida3);

        return bebidasCarbonatadas;
    }

    /**
     * Contenido del combo bebidas Alcoholicas
     *
     * @return
     */
    private List<Bebida> crearBebidasAlcoholicas() {
        bebidasAlcoholicas = new ArrayList<>();

        Bebida bebida1 = new Bebida("Cerveza Corona", 20,
                "chico", "src/foodImages/Cerveza-Corona.jpg");
        bebidasAlcoholicas.add(bebida1);

        Bebida bebida2 = new Bebida("Cerveza Victoria", 30,
                "chico", "src/foodImages/Cerveza-Victora.jpg");
        bebidasAlcoholicas.add(bebida2);

        Bebida bebida3 = new Bebida("XX Laguer", 40,
                "chico", "src/foodImages/xxLager.jpg");
        bebidasAlcoholicas.add(bebida3);

        return bebidasAlcoholicas;
    }
}
