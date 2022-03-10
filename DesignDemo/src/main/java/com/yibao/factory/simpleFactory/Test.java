package com.yibao.factory.simpleFactory;

/**
 * 测试类
 * @author yibao
 * @create 2022 -03 -10 -10:11
 */
public class Test {
    public static void main(String[] args) {
        // 1.创建咖啡店
        CoffeeShop shop = new CoffeeShop();
        // 2.找工厂
        Coffee coffee = shop.orderCoffee("Latte");
        // 3.拿咖啡
        System.out.println(coffee.getName());

        // ---------------------------------------------

        // 4.简单工厂的扩展 -- 静态工厂
        CoffeeStaticShop shop1 = new CoffeeStaticShop();
        Coffee coffee1 = shop1.orderCoffee("Americano");
        System.out.println(coffee1.getName());
    }
}
