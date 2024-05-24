package org.unisabana.base.pizzagruesa;

import org.unisabana.PizzaFactory;

public class PizzaMasaGruesaFactory implements PizzaFactory {

    @Override
    public void crearPizza(String tamano, String ingredientes, String tipo,Integer coccion)  {
         new CrearPizzaGruesa(tamano, ingredientes);
    }
}
