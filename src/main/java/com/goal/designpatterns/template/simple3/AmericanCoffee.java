package com.goal.designpatterns.template.simple3;

public class AmericanCoffee implements Coffee {


    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }

    @Override
    public void addMilk() {
        System.out.println("AmericanCoffee.addMilk");
    }

    @Override
    public void addSugar() {
        System.out.println("AmericanCoffee.addSugar");
    }
}
