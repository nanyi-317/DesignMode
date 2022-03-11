package com.yibao.builder.demo1;

/**
 * 指挥者
 *
 * @author yibao
 * @create 2022 -03 -11 -11:20
 */
public class Director {
    // 声明 builder 类型变量
    private Builder builder;

    // 有参构造
    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车
    public Bike packageBike() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
