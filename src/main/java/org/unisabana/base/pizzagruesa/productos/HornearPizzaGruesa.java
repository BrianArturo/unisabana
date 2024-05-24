package org.unisabana.base.pizzagruesa.productos;

import org.unisabana.base.interfaces.HorneadorPizza;

public class HornearPizzaGruesa implements HorneadorPizza {

    public HornearPizzaGruesa() {
        hornear();
    }

    @Override
    public void hornear() {
        System.out.println("Horneando 5 min una pizza Gruesa"); ;
    }
}
