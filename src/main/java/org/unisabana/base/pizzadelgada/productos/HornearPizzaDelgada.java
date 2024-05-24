package org.unisabana.base.pizzadelgada.productos;

import org.unisabana.base.interfaces.HorneadorPizza;

public class HornearPizzaDelgada implements HorneadorPizza {

    public HornearPizzaDelgada() {
        hornear();
    }

    @Override
    public void hornear() {
        System.out.println("Horneando 3 min una pizza Delgada"); ;
    }
}
