package com.goal.designpatterns.template.simple2;

public class AmericanCoffee implements Coffee {


    @Override
    public String getName() {
        return this.getClass().getName();
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
