package com.yibao.template;

/**
 * 抽象类：用于定义 模板方法 & 基本方法
 * @author yibao
 * @create 2022 -04 -01 -11:02
 */
public abstract class AbstractClass {
    // 模板方法定义  -- 不让子类重写 final
    public final void cookProcess() {
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }

    // 基本方法：直接实现
    public void pourOil() {
        System.out.println("倒油");
    }

    // 基本方法：直接实现
    public void heatOil() {
        System.out.println("热油");
    }

    // 模板方法：抽象 -- 子类自己实现
    public abstract void pourVegetable();

    // 模板方法：抽象 -- 子类自己实现
    public abstract void pourSauce();

    // 基本方法：直接实现
    public void fry() {
        System.out.println("爆炒ing....");
    }
}
