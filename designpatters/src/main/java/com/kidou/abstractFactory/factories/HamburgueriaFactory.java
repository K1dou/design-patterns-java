package com.kidou.abstractFactory.factories;

import com.kidou.abstractFactory.bebidas.Bebida;
import com.kidou.abstractFactory.bebidas.MilkShake;
import com.kidou.abstractFactory.comidas.Comida;
import com.kidou.abstractFactory.comidas.Hamburguer;

public class HamburgueriaFactory implements DeliveryFactory {

    @Override
    public Comida criaComida() {
        return new Hamburguer();
    }

    @Override
    public Bebida criaBebida() {
        return new MilkShake();
    }
}
