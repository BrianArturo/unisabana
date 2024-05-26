package org.unisabana.base.pizzagruesa;

import org.unisabana.PizzaFactory;
import org.unisabana.base.pizzagruesa.productos.AmasarPizzaGruesa;
import org.unisabana.base.pizzagruesa.productos.HornearPizzaGruesa;
import org.unisabana.base.pizzagruesa.productos.MoldearPizzaGruesa;

public class PizzaMasaGruesaFactory extends PizzaFactory {

    @Override
    public void crearPizza(String tamano, String ingredientes)  {
        System.out.println("Preparandos para crear una pizza gruesa de tamaño ".concat(tamano).concat( " con los siguientes ingredientes").concat(ingredientes));

        new AmasarPizzaGruesa();
        new MoldearPizzaGruesa();
        new HornearPizzaGruesa();
    }
}
