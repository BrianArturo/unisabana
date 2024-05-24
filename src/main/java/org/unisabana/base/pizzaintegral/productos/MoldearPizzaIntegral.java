package org.unisabana.base.pizzaintegral.productos;

import org.unisabana.base.interfaces.MoldeadorPizza;

public class MoldearPizzaIntegral implements MoldeadorPizza {

    public MoldearPizzaIntegral() {
        moldear();
    }

    @Override
    public void moldear() {
        System.out.println( "Moldeando pizza Integral");;
    }
}
