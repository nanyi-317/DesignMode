package com.yibao.factory.factoryMethod;

/**
 * 拿铁咖啡工厂
 * @author yibao
 * @create 2022 -03 -10 -11:33
 */
public class LatteFactory implements CoffeeFactory{
    public Coffee createCoffee() {
        return new Latte();
    }
}
