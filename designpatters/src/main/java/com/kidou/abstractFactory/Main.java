package com.kidou.abstractFactory;

import java.util.Objects;

import com.kidou.abstractFactory.cliente.Cliente;
import com.kidou.abstractFactory.factories.DeliveryFactory;
import com.kidou.abstractFactory.factories.HamburgueriaFactory;
import com.kidou.abstractFactory.factories.PizzariaFactory;

public class Main {

    public static void main(String[] args) throws Exception {
        DeliveryFactory factory;

        if (Objects.equals(args[0], "pizzaria")) {
            factory = new PizzariaFactory();
        } else if (Objects.equals(args[0], "hamburgueria")) {
            factory = new HamburgueriaFactory();
        } else {
            throw new Exception("Tipo do estabelecimento é obrigatório!");
        }

        Cliente cliente = new Cliente(factory);
        cliente.criaPedido("cebola");
    }
}
