package com.kidou.abstractFactory.factories;

import com.kidou.abstractFactory.bebidas.Bebida;
import com.kidou.abstractFactory.bebidas.Refrigerante;
import com.kidou.abstractFactory.comidas.Comida;
import com.kidou.abstractFactory.comidas.Pizza;

public class PizzariaFactory implements DeliveryFactory {

    @Override
    public Comida criaComida() {
        return new Pizza();
    }

    @Override
    public Bebida criaBebida() {
        return new Refrigerante();
    }
}
