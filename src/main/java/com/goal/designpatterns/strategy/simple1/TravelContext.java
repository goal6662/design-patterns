package com.goal.designpatterns.strategy.simple1;

/**
 * 整合资源方便系统调用
 */
public class TravelContext {


    /**
     * 策略模式可以避免使用大量的 if-else
     * @param args
     */
    public static void main(String[] args) {
        TravelContext travelContext = new TravelContext(new Bicycle());

        travelContext.selectTravel();
    }


    private TravelStrategy travelStrategy;

    public TravelContext(TravelStrategy strategy) {
        this.travelStrategy = strategy;
    }

    public void selectTravel() {
        travelStrategy.travel();
    }

}
