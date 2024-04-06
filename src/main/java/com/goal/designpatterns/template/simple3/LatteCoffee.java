package com.goal.designpatterns.template.simple3;

public class LatteCoffee implements Coffee {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void addMilk() {
        System.out.println("LatteCoffee.addMilk");
    }

    @Override
    public void addSugar() {
        System.out.println("LatteCoffee.addSugar");
    }
}
