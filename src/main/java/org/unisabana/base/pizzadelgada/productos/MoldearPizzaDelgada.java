package org.unisabana.base.pizzadelgada.productos;

import org.unisabana.base.interfaces.MoldeadorPizza;

public class MoldearPizzaDelgada implements MoldeadorPizza {

    public MoldearPizzaDelgada() {
        moldear();
    }

    @Override
    public void moldear() {
        System.out.println("Moldeando pizza delgada"); ;
    }
}
