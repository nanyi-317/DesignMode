package com.yibao.decorate;

/**
 * 装饰类
 *
 * @author yibao
 * @create 2022 -03 -15 -14:00
 */
public abstract class Garnish extends FastFood {
    // 声明快餐类变量
    private FastFood fastFood;
    // 构造器
    public Garnish(float price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }
    // get + set
    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }
}
