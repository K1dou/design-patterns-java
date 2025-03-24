package com.kidou.abstractFactory.bebidas;

public class Refrigerante implements Bebida {

    @Override
    public void escolheSemAcucar() {
        System.out.println("Açúcar removido do refrigerante");
    }
}
