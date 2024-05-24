package org.unisabana.base.pizzaintegral.productos;

import org.unisabana.base.interfaces.HorneadorPizza;

public class HornearPizzaIntegral implements HorneadorPizza {

    public HornearPizzaIntegral() {
        hornear();
    }

    @Override
    public void hornear() {
        System.out.println("Horneando 1 min una pizza Integral");
    }
}
