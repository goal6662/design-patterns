package com.goal.designpatterns.template.simple2;


public class CoffeeStore {

    public static void main(String[] args) {
        Coffee coffee = orderCoffee("American");


    }

    public static Coffee orderCoffee(String type) {
        // 通过工厂解耦了，CoffeeStore 和 Coffee具体实现类的耦合
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

        // Store 只用关心如何配料即可
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
