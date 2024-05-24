package org.unisabana.base.pizzagruesa.productos;

import org.unisabana.base.interfaces.MoldeadorPizza;

public class MoldearPizzaGruesa implements MoldeadorPizza {

    public MoldearPizzaGruesa() {
        moldear();
    }

    @Override
    public void moldear() {
        System.out.println("Moldeando pizza Gruesa"); ;
    }
}
