package com.kidou.abstractFactory.cliente;

import com.kidou.abstractFactory.bebidas.Bebida;
import com.kidou.abstractFactory.comidas.Comida;
import com.kidou.abstractFactory.factories.DeliveryFactory;

public class Cliente {
    private DeliveryFactory factory;

    public Cliente(DeliveryFactory factory) {
        this.factory = factory;
    }

    public void criaPedido(String ingrediente) {
        Comida comida = factory.criaComida();
        Bebida bebida = factory.criaBebida();

        comida.removeIngrediente(ingrediente);
        bebida.escolheSemAcucar();
    }
}
