package com.yibao.factory.abstractFactory;

/**
 * @author yibao
 * @create 2022 -03 -10 -15:08
 */
public class Test {
    public static void main(String[] args) {
        // 1.创建意式工厂
        ItalianFactory factory = new ItalianFactory();
        // 2.拿铁 + 提拉米苏
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        // 3.获取
        System.out.println(coffee.getName());
        dessert.show();
    }
}
