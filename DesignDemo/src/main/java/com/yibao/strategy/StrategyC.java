package com.yibao.strategy;

/**
 * @author yibao
 * @create 2022 -05 -06 -10:41
 * 策略具体实现 C
 */
public class StrategyC implements Strategy{
    // 方法：策略 C
    public void show() {
        System.out.println("满1500另付1元换购任意200元以下产品");
    }
}
