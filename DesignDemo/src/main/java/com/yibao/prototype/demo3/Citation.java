package com.yibao.prototype.demo3;

import java.io.Serializable;

/**
 * 原型类 --- 奖状 --- 深克隆
 *
 * @author yibao
 * @create 2022 -03 -10 -17:33
 */
public class Citation implements Cloneable , Serializable {
    // 对象
    private Student student;

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    // 方法：用作测试效果
    public void show() {
        System.out.println(student.getName() + " 同学表现优异，获得三好学生称号!");
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
