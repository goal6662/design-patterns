package com.goal.designpatterns.strategy.simple1;

/**
 * 定义接口方法
 */
public interface TravelStrategy {
    default void travel() {
        System.out.println(this.getClass().getSimpleName());
    }
}
