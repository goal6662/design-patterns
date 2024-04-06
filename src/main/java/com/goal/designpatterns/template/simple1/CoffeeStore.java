package com.goal.designpatterns.template.simple1;


import lombok.AllArgsConstructor;

public class CoffeeStore implements Coffee{

    public static void main(String[] args) {
        Coffee coffee = orderCoffee(CoffeeType.AMERICAN);


    }

    public static Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = null;
        switch (type.name) {
            case "American":
                coffee = new AmericanCoffee();
                break;
            case "Latte":
                coffee = new LatteCoffee();
                break;
            default:
                coffee = new AmericanCoffee();

        }

        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void addMilk() {

    }

    @Override
    public void addSugar() {

    }

    @AllArgsConstructor
    public enum CoffeeType {
        AMERICAN("American"),
        LATTE("Latte");

        final String name;
    }

}
