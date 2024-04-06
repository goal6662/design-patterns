package com.goal.designpatterns.template.simple3;

/**
 * 后续扩展只需新建一个工厂对象即可
 * 对扩展是开放的，但是也使系统变得更加复杂
 * 添加新品种时也无需修改源代码，对修改是关闭的
 */
public class CoffeeStore {

    public static void main(String[] args) {

        CoffeeStore coffeeStore = new CoffeeStore(new AmericanCoffeeFactory());

        System.out.println(coffeeStore.orderCoffee().getName());

    }

    private final CoffeeFactory coffeeFactory;

    public CoffeeStore(CoffeeFactory factory) {
        this.coffeeFactory = factory;
    }

    public Coffee orderCoffee() {
        // 通过工厂解耦了，CoffeeStore 和 Coffee具体实现类的耦合
        Coffee coffee = coffeeFactory.createCoffee();

        // Store 只用关心如何配料即可
        coffee.addMilk();
        coffee.addSugar();

        return coffee;
    }
}
