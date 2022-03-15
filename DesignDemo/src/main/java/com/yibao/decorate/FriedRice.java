package com.yibao.decorate;

/**
 * 炒饭类
 * @author yibao
 * @create 2022 -03 -15 -13:55
 */
public class FriedRice extends FastFood{
    // 构造器
    public FriedRice() {
        super(10,"炒饭");
    }
    // 重写方法
    public float cost() {
        return getPrice();
    }
}
