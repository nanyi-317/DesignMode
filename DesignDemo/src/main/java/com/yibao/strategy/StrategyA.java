package com.yibao.strategy;

/**
 * @author yibao
 * @create 2022 -05 -06 -10:39
 * 策略具体实现 A
 */
public class StrategyA implements Strategy{
    // 方法：策略 A
    public void show() {
        System.out.println("买一送一");
    }
}
