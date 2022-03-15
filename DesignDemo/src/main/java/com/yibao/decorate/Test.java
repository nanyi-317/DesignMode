package com.yibao.decorate;

/**
 * 测试类：装饰者模式
 * @author yibao
 * @create 2022 -03 -15 -13:48
 */
public class Test {
    public static void main(String[] args) {
        // 炒饭
        FastFood food = new FriedRice();
        System.out.println(food.getDesc() + " " + food.cost());
        // 炒饭 + 鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost());
        // 炒饭 + 2个鸡蛋
        food = new Egg(food);
        System.out.println(food.getDesc() + " " + food.cost());
        // 炒饭 + 2个鸡蛋 + 培根
        food = new Bacon(food);
        System.out.println(food.getDesc() + " " + food.cost());
    }
}
