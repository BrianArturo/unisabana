package org.unisabana.base.pizzaintegral;

import org.unisabana.PizzaFactory;
import org.unisabana.base.pizzaintegral.productos.AmasarPizzaIntegral;
import org.unisabana.base.pizzaintegral.productos.HornearPizzaIntegral;
import org.unisabana.base.pizzaintegral.productos.MoldearPizzaIntegral;

public class PizzaMasaIntegralFactory extends PizzaFactory {

    @Override
    public void crearPizza(String tamano, String ingredientes) {
        System.out.println("Preparandos para crear una pizza integral de tamaño ".concat(tamano).concat( " con los siguientes ingredientes").concat(ingredientes));

        new AmasarPizzaIntegral();
        new MoldearPizzaIntegral();
        new HornearPizzaIntegral();
    }
}
