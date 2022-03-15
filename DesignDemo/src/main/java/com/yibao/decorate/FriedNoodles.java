package com.yibao.decorate;

/**
 * 炒面类
 * @author yibao
 * @create 2022 -03 -15 -13:55
 */
public class FriedNoodles extends FastFood{
    // 构造器
    public FriedNoodles() {
        super(17,"炒面");
    }
    // 重写方法
    public float cost() {
        return getPrice();
    }
}
