package com.yibao.factory.simpleFactory;

/**
 * 简单工厂  --- 生产咖啡
 * @author yibao
 * @create 2022 -03 -10 -10:30
 */
public class SimpleCoffeeFactory {
    // 根据点单的类型，制作不同的咖啡
    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if ("Americano".equals(type)) {
            coffee = new Americano();
        } else if ("Latte".equals(type)) {
            coffee = new Latte();
        } else {
            throw new RuntimeException("您点的咖啡售罄！");
        }
        // 制作返回
        return coffee;

    }
}
