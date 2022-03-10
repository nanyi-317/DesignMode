package com.yibao.factory.demo;

/**
 * 测试类
 * @author yibao
 * @create 2022 -03 -10 -10:11
 */
public class Test {
    public static void main(String[] args) {
        // 1.创建咖啡店
        CoffeeShop shop = new CoffeeShop();
        // 2.点咖啡
        Coffee coffee = shop.orderCoffee("Latte");
        // 3.拿咖啡
        System.out.println(coffee.getName());
    }
}
