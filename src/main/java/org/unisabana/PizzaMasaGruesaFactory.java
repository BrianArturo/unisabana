package org.unisabana;

import org.unisabana.producto.CrearPizza;
import org.unisabana.producto.CrearPizzaGruesa;

public class PizzaMasaGruesaFactory implements PizzaFactory{

    @Override
    public CrearPizza crearPizza(String tamano, String ingredientes, String tipo,Integer coccion) throws InterruptedException {
        return new CrearPizzaGruesa(tamano, ingredientes, tipo,coccion);
    }
}
