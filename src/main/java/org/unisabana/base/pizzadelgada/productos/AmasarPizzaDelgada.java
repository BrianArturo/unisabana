package org.unisabana.base.pizzadelgada.productos;

import org.unisabana.base.interfaces.AmasarPizza;

public class AmasarPizzaDelgada implements AmasarPizza {

    public AmasarPizzaDelgada(){
        amasar();
    }
    @Override
    public void amasar()   {
        System.out.println("Amasando Pizza Delgada"); ;
    }
}
