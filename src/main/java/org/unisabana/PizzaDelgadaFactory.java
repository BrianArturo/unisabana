package org.unisabana;

import org.unisabana.producto.CrearPizza;
import org.unisabana.producto.CrearPizzaDelgada;

public class PizzaDelgadaFactory  implements  PizzaFactory{

    @Override
    public CrearPizza crearPizza(String tamano, String ingredientes, String tipo,Integer coccion) throws InterruptedException {
        return new CrearPizzaDelgada(tamano, ingredientes, tipo,coccion);
    }
}
