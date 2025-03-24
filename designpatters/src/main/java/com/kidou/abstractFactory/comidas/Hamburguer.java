package com.kidou.abstractFactory.comidas;

public class Hamburguer implements Comida {

    @Override
    public void removeIngrediente(String nome) {
        System.out.printf("Ingrediente %s removido do hamburguer%n", nome);
    }
}
