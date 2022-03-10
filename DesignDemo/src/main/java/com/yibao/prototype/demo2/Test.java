package com.yibao.prototype.demo2;

/**
 * @author yibao
 * @create 2022 -03 -10 -17:38
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原型
        Citation c1 = new Citation();
        // 克隆奖状对象
        Citation c2 = c1.clone();
        // 为奖状分别赋上名字
        c1.setName("张三");
        c2.setName("李四");

        // 展示奖状
        c1.show();
        c2.show();
    }
}
