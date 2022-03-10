package com.yibao.prototype.demo2;

/**
 * 原型类 --- 奖状 --- 浅克隆
 *
 * @author yibao
 * @create 2022 -03 -10 -17:33
 */
public class Citation implements Cloneable {
    // 成员变量 -- 姓名
    private String name;

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 方法：用作测试效果
    public void show() {
        System.out.println(name + " 同学表现优异，获得三好学生称号!");
    }
}
