package com.goal.designpatterns.template.simple2;

public class LatteCoffee implements Coffee {
    @Override
    public String getName() {
        return this.getClass().getName();
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
