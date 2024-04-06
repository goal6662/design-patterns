package com.goal.designpatterns.chain;

public class OrderAmountCalculate extends Handler {
    @Override
    public void process(OrderInfo order) {
        System.out.println("计算订单金额");
        handler.process(order);
    }
}
