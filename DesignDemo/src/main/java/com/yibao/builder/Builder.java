package com.yibao.builder;

/**
 * 构建者
 *
 * @author yibao
 * @create 2022 -03 -11 -11:13
 */
public abstract class Builder {
    // 声明 Bike 变量，并进行赋值
    protected Bike bike = new Bike();

    // 构建车架
    public abstract void buildFrame();
    // 构建车座
    public abstract void buildSeat();
    // 构建自行车
    public abstract Bike createBike();
}
