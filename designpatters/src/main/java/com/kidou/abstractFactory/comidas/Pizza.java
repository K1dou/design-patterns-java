package com.kidou.abstractFactory.comidas;

public class Pizza implements Comida {

    @Override
    public void removeIngrediente(String nome) {
        System.out.printf("Ingrediente %s removido da pizza%n", nome);
    }
}
