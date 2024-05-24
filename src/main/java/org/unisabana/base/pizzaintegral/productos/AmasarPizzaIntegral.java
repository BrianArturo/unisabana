package org.unisabana.base.pizzaintegral.productos;

import org.unisabana.base.interfaces.AmasarPizza;

public class AmasarPizzaIntegral implements AmasarPizza {

    public AmasarPizzaIntegral(){
        amasar();
    }
    @Override
    public void amasar()   {
        System.out.println("Amasando Pizza Integral");
    }
}
