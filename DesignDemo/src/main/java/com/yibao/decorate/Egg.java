package com.yibao.decorate;

/**
 * 配料：鸡蛋
 * @author yibao
 * @create 2022 -03 -15 -14:04
 */
public class Egg extends Garnish{
    // 构造
    public Egg(FastFood fastFood) {
        super(1, "+ 鸡蛋", fastFood);
    }
    // 计算价格
    public float cost() {
        return getPrice()+ getFastFood().cost();
    }
    // 重写描述
    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
