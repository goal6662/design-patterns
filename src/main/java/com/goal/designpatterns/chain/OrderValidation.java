package com.goal.designpatterns.chain;

public class OrderValidation extends Handler {
    @Override
    public void process(OrderInfo order) {
        System.out.println("校验订单基本信息");

        handler.process(order);
    }
}
