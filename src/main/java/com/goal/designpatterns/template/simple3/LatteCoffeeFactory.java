package com.goal.designpatterns.template.simple3;

/**
 * 创建 Coffee
 */
public class LatteCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
