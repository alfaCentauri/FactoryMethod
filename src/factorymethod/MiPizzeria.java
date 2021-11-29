/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethod;

/**
 * MiPizzeria implementa el metodo de creación; dice como se crea el objeto.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public class MiPizzeria implements IPizzeria{
    /**
     * @param tipoPizza Tipo String.
     **/
    public Pizza crearPizza(String tipoPizza){
        Pizza pizza = null;
        switch(tipoPizza){
            case "Peperoni":
                pizza = new Pizza(8, "Peperoni");
                break;
            case "Tres Estaciones":
                pizza = new Pizza(8, "Tres Estaciones");
                break;
            case "Napolitana":
                pizza = new Pizza(8, "Napolitana");
                break;
            case "Napolitana borde de queso":
                pizza = new Pizza(12, "Napolitana borde de queso");
                break;
        }
        return pizza;
    }
}
