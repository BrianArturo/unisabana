package org.unisabana;

import org.unisabana.producto.CrearPizza;


public interface PizzaFactory {

    CrearPizza crearPizza(String tamano, String ingredientes, String tipo, Integer coccion) throws InterruptedException;


}
