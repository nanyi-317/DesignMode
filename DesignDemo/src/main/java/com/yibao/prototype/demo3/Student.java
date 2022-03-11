package com.yibao.prototype.demo3;

import java.io.Serializable;

/**
 * 学生类
 * @author yibao
 * @create 2022 -03 -10 -17:49
 */
public class Student implements Serializable {
    // 姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
