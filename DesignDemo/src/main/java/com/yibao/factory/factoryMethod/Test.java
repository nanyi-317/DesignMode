package com.yibao.factory.factoryMethod;

/**
 * 测试类
 * @author yibao
 * @create 2022 -03 -10 -10:11
 */
public class Test {
    public static void main(String[] args) {
        // 1.创建咖啡店
        CoffeeShop shop = new CoffeeShop();
        // 2.创建工厂对象
        shop.setFactory(new AmericanoFactory());
        // 3.点咖啡
        Coffee coffee = shop.orderCoffee();
        // 4.拿咖啡
        System.out.println(coffee.getName());
    }
}
