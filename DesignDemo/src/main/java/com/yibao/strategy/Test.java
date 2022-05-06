package com.yibao.strategy;

/**
 * @author yibao
 * @create 2022 -05 -06 -10:45
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        // 创建销售员，确定销售策略
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();

        System.out.println("==============================");

        // 改变策略
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();
    }
}
