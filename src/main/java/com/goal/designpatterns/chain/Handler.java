package com.goal.designpatterns.chain;

public abstract class Handler {

    protected Handler handler;

    public void setNext(Handler handler) {
        this.handler = handler;
    }

    /**
     * 处理过程，交由子类实现
     * @param order
     */
    public abstract void process(OrderInfo order);

}
