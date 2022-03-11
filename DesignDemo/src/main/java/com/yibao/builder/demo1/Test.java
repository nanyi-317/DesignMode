package com.yibao.builder.demo1;

/**
 * 测试类
 * @author yibao
 * @create 2022 -03 -11 -11:08
 */
public class Test {
    public static void main(String[] args) {
        // 创建指挥者
        Director director = new Director(new MobileBuilder());
        // 指挥者指挥装配
        Bike bike = director.packageBike();

        System.out.println(bike);
    }
}
