package com.yibao.factory.simpleFactory;

/**
 * 咖啡店 --- 提供点咖啡的功能
 * @author yibao
 * @create 2022 -03 -10 -10:07
 */
public class CoffeeStaticShop {
    // 利用简单工厂进行点单
    public Coffee orderCoffee(String type) {
        // 简单工厂扩展 -- 静态工厂
        Coffee coffee = SimpleCoffeeStaticFactory.createCoffee(type);
        // 加奶加糖
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
