package com.yibao.factory.configFactory;

/**
 * @author yibao
 * @create 2022 -03 -10 -16:01
 */
public class Test {
    public static void main(String[] args) {
        Coffee coffee = CoffeeShop.createCoffee("Americano");
        System.out.println(coffee.getName());
    }
}