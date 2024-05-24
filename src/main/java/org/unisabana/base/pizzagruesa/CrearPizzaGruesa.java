package org.unisabana.base.pizzagruesa;

import org.unisabana.base.pizzagruesa.productos.AmasarPizzaGruesa;
import org.unisabana.base.pizzagruesa.productos.HornearPizzaGruesa;
import org.unisabana.base.pizzagruesa.productos.MoldearPizzaGruesa;

public class CrearPizzaGruesa  {

    String tamano;
    String ingredientes;


    public CrearPizzaGruesa(String tamano, String ingredientes) {
        this.tamano = tamano;
        this.ingredientes = ingredientes;
        new AmasarPizzaGruesa();
        new MoldearPizzaGruesa();
        new HornearPizzaGruesa();


    }

}
