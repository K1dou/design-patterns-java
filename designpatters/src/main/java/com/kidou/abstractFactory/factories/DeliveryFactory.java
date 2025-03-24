package com.kidou.abstractFactory.factories;

import com.kidou.abstractFactory.bebidas.Bebida;
import com.kidou.abstractFactory.comidas.Comida;

public interface DeliveryFactory {

    Comida criaComida();

    Bebida criaBebida();
}
