package com.yibao.prototype.demo1;

/**
 * 原型类
 *
 * @author yibao
 * @create 2022 -03 -10 -16:59
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("--- 具体的原型对象创建完成 ---");
    }

    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("--- 具体原型复制成功 ---");
        return (Realizetype) super.clone();
    }
}
