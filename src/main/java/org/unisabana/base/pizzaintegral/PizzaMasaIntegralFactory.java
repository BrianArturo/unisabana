package org.unisabana.base.pizzaintegral;

import org.unisabana.PizzaFactory;

public class PizzaMasaIntegralFactory implements PizzaFactory {


    @Override
    public void crearPizza(String tamano, String ingredientes, String tipo, Integer coccion) {
         new CrearPizzaIntegral(tamano, ingredientes);
    }
}
