package com.yibao.factory.simpleFactory;

/**
 * 咖啡店 --- 提供点咖啡的功能
 * @author yibao
 * @create 2022 -03 -10 -10:07
 */
public class CoffeeShop {
    // 利用简单工厂进行点单
    public Coffee orderCoffee(String type) {
        // 创建工厂
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // 制作咖啡
        Coffee coffee = factory.createCoffee(type);
        // 加奶加糖
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
