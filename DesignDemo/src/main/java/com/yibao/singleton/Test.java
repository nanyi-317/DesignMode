package com.yibao.singleton;

/**
 * 测试类
 *
 * @author yibao
 * @create 2022 -03 -09 -14:17
 */
public class Test {
    public static void main(String[] args) {
        // 1.单例模式 -- 静态成员变量方式 --- 检测创建的是否为同一对象
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance == instance1);     // ----->>>> true

        System.out.println("---------------------------------------------------------");

        // 2.单例模式 -- 静态代码块方式 --- 检测创建的是否为同一对象
        Singleton2 instance2 = Singleton2.getInstance();
        Singleton2 instance3 = Singleton2.getInstance();
        System.out.println(instance2 == instance3);   // ----->>>> true

    }
}
