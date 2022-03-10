package com.yibao.factory.demo;

/**
 * 咖啡店 --- 提供点咖啡的功能
 * @author yibao
 * @create 2022 -03 -10 -10:07
 */
public class CoffeeShop {
    // 根据点单的类型，制作不同的咖啡
    public Coffee orderCoffee(String type) {
        Coffee coffee = null;
        if ("Americano".equals(type)) {
            coffee = new Americano();
        } else if ("Latte".equals(type)) {
            coffee = new Latte();
        } else {
            throw new RuntimeException("您点的咖啡售罄！");
        }
        // 加糖、加奶
        coffee.addMilk();
        coffee.addSugar();
        // 制作返回
        return coffee;
    }
}
