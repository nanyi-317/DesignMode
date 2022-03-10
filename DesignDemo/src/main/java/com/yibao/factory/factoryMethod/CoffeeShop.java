package com.yibao.factory.factoryMethod;

/**
 * 咖啡店 --- 提供点咖啡的功能
 * @author yibao
 * @create 2022 -03 -10 -10:07
 */
public class CoffeeShop {
    // 声明成员变量 -- 抽象工厂
    private CoffeeFactory factory;

    // 赋值
    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
