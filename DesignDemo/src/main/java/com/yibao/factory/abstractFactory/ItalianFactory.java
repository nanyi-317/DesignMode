package com.yibao.factory.abstractFactory;

/**
 * 具体工厂实现  --- 意式工厂
 * @author yibao
 * @create 2022 -03 -10 -15:05
 */
public class ItalianFactory implements CoffeeAndDessertFactory {
    public Coffee createCoffee() {
        // 拿铁
        return new Latte();
    }

    public Dessert createDessert() {
        // 提拉米苏
        return new Tiramisu();
    }
}
