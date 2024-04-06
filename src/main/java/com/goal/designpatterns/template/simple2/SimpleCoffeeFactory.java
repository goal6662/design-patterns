package com.goal.designpatterns.template.simple2;

/**
 * 静态工厂创造实例对象
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        switch (type) {
            case "American":
                coffee = new AmericanCoffee();
                break;
            case "Latte":
                coffee = new LatteCoffee();
                break;
            default:
                coffee = new AmericanCoffee();

        }
        return coffee;
    }

}
