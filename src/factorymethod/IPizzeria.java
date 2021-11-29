/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethod;

/**
 * IPizzeria define los métodos necesarios, dice que se debe hacer.
 * @author Ricardo Presilla.
 * @version 1.0.
 */
public interface IPizzeria {
    /** Crea la pizza. */
    Pizza crearPizza(String tipoPizza);
}
