package com.yibao.decorate;

/**
 * 配料类：培根
 * @author yibao
 * @create 2022 -03 -15 -14:11
 */
public class Bacon extends Garnish{
    // 构造
    public Bacon(FastFood fastFood) {
        super(5, "+ 培根", fastFood);
    }

    // 计算价格
    public float cost() {
        return getPrice() + getFastFood().cost();
    }

    // 重写描述
    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
