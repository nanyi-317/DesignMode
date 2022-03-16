package com.yibao.flyweight;

/**
 * 抽象享元对象
 *
 * @author yibao
 * @create 2022 -03 -16 -16:26
 */
public abstract class AbstractBox {
    // 方法：获取图形
    public abstract String getShape();

    // 方法：显示图形 及 颜色
    public void display(String color) {
        System.out.println("形状： " + getShape() + " , 颜色： " + color);
    }
}
