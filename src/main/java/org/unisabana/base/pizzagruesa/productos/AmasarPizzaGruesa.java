package org.unisabana.base.pizzagruesa.productos;

import org.unisabana.base.interfaces.AmasarPizza;

public class AmasarPizzaGruesa implements AmasarPizza {

    public AmasarPizzaGruesa(){
        amasar();
    }
    @Override
    public void amasar()   {
        System.out.println("Amasando Pizza Gruesa");;
    }
}
