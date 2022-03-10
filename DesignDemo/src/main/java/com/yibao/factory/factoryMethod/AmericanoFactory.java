package com.yibao.factory.factoryMethod;

/**
 * 美式咖啡工厂
 * @author yibao
 * @create 2022 -03 -10 -11:33
 */
public class AmericanoFactory implements CoffeeFactory{
    public Coffee createCoffee() {
        return new Americano();
    }
}
