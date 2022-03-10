package com.yibao.factory.abstractFactory;

/**
 * 具体工厂实现  --- 美式工厂
 * @author yibao
 * @create 2022 -03 -10 -15:05
 */
public class AmericanFactory implements CoffeeAndDessertFactory {
    public Coffee createCoffee() {
        // 美式咖啡
        return new Americano();
    }

    public Dessert createDessert() {
        // 抹茶慕斯
        return new MatchaMousse();
    }
}
