package com.yibao.flyweight;

/**
 * 测试类：享元模型
 * @author yibao
 * @create 2022 -03 -16 -16:24
 */
public class Test {
    public static void main(String[] args) {
        // 获取 I 图形
        AbstractBox box = BoxFactory.getInstance().getShape("I");
        box.display("blue");

        AbstractBox box1 = BoxFactory.getInstance().getShape("L");
        box1.display("green");

        AbstractBox box2 = BoxFactory.getInstance().getShape("O");
        box2.display("red");

        AbstractBox box3 = BoxFactory.getInstance().getShape("O");
        box3.display("black");

        System.out.println("两个 O 是否为同一对象： " + (box2 == box3));

    }
}
