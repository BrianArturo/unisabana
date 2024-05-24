package org.unisabana.base.pizzadelgada;

import org.unisabana.PizzaFactory;

public class PizzaDelgadaFactory  implements PizzaFactory {

    @Override
    public void crearPizza(String tamano, String ingredientes, String tipo,Integer coccion)  {
         new CrearPizzaDelgada(tamano, ingredientes);
    }

}
