package com.yibao.prototype.demo1;

/**
 * @author yibao
 * @create 2022 -03 -10 -17:07
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建原型
        Realizetype realizetype = new Realizetype();
        // 克隆
        Realizetype realizetype1 = realizetype.clone();
        // 判断是否为同一对象
        System.out.println(realizetype == realizetype1);  // false
    }
}
