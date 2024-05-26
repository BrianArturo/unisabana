package org.unisabana.base.pizzadelgada;

import org.unisabana.PizzaFactory;
import org.unisabana.base.pizzadelgada.productos.AmasarPizzaDelgada;
import org.unisabana.base.pizzadelgada.productos.HornearPizzaDelgada;
import org.unisabana.base.pizzadelgada.productos.MoldearPizzaDelgada;

public class PizzaDelgadaFactory  extends PizzaFactory {

    @Override
    public void crearPizza(String tamano, String ingredientes)  {
        System.out.println("Preparandos para crear una pizza delgada de tamaño ".concat(tamano).concat( " con los siguientes ingredientes").concat(ingredientes));
        new AmasarPizzaDelgada();
        new MoldearPizzaDelgada();
        new HornearPizzaDelgada();
    }

}
