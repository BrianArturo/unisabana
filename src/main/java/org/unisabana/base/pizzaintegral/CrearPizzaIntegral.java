package org.unisabana.base.pizzaintegral;

import org.unisabana.base.pizzaintegral.productos.AmasarPizzaIntegral;
import org.unisabana.base.pizzaintegral.productos.HornearPizzaIntegral;
import org.unisabana.base.pizzaintegral.productos.MoldearPizzaIntegral;

public class CrearPizzaIntegral  {

    String tamano;
    String ingredientes;


    public CrearPizzaIntegral(String tamano, String ingredientes)  {
        this.tamano = tamano;
        this.ingredientes = ingredientes;
        new AmasarPizzaIntegral();
        new MoldearPizzaIntegral();
        new HornearPizzaIntegral();


    }

}
