package com.yibao.factory.abstractFactory;

/**
 * 抽象工厂  --- 甜品/咖啡工厂
 * @author yibao
 * @create 2022 -03 -10 -14:55
 */
public interface CoffeeAndDessertFactory {
    // 生产咖啡
    Coffee createCoffee();

    // 生产甜品
    Dessert createDessert();
}