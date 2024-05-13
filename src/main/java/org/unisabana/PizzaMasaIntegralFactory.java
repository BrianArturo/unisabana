package org.unisabana;

import org.unisabana.producto.CrearPizza;
import org.unisabana.producto.CrearPizzaIntegral;

public class PizzaMasaIntegralFactory implements  PizzaFactory {


    @Override
    public CrearPizza crearPizza(String tamano, String ingredientes, String tipo, Integer coccion) throws InterruptedException {
        return new CrearPizzaIntegral(tamano, ingredientes, tipo,coccion);
    }
}
