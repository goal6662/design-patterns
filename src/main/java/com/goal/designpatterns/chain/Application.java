package com.goal.designpatterns.chain;

/**
 * Handler: 包含一个个链信息
 *
 * 调用方设置并确认责任链
 * 从第一个链开始执行
 */
public class Application {

    public static void main(String[] args) {
        // 校验订单
        Handler orderValidation = new OrderValidation();
        // 补充订单
        Handler orderFill = new OrderFill();
        // 计算订单金额
        Handler orderAmountCalculate = new OrderAmountCalculate();
        // 创建订单
        Handler orderCreate = new OrderCreate();

        // 设置责任链
        orderValidation.setNext(orderFill);
        orderFill.setNext(orderAmountCalculate);
        orderAmountCalculate.setNext(orderCreate);

        // 开始执行
        orderValidation.process(new OrderInfo());

    }

}
