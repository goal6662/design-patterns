package com.goal.designpatterns.chain;

public class OrderCreate extends Handler {
    @Override
    public void process(OrderInfo order) {
        System.out.println("创建订单");

        if (handler != null) {
            handler.process(order);
        }
    }
}
