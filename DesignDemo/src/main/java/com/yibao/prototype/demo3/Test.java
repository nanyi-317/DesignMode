package com.yibao.prototype.demo3;

import java.io.*;

/**
 * @author yibao
 * @create 2022 -03 -10 -17:38
 */
public class Test {
    public static void main(String[] args) throws Exception {
        // 创建原型
        Citation citation = new Citation();
        // 创建学生
        Student student = new Student();
        student.setName("王五");
        citation.setStudent(student);

        // 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:/a.txt"));
        // 写对象
        oos.writeObject(citation);
        // 释放资源
        oos.close();

        // 创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:/a.txt"));
        // 读取对象
        Citation c2 = (Citation) ois.readObject();
        // 释放资源
        ois.close();
        // 修改新学生对象的名字
        c2.getStudent().setName("马六");

        // 测试
        citation.show();
        c2.show();
    }
}
