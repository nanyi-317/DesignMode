package com.yibao.singleton;

/**
 * 测试类
 *
 * @author yibao
 * @create 2022 -03 -09 -14:17
 */
public class Test {
    public static void main(String[] args) {
        // 1.饿汉 -- 静态成员变量方式 --- 检测创建的是否为同一对象
        Singleton1 instance = Singleton1.getInstance();
        Singleton1 instance1 = Singleton1.getInstance();
        System.out.println(instance == instance1);     // ----->>>> true

        System.out.println("---------------------------------------------------------");

        // 2.饿汉 -- 静态代码块方式 --- 检测创建的是否为同一对象
        Singleton2 instance2 = Singleton2.getInstance();
        Singleton2 instance3 = Singleton2.getInstance();
        System.out.println(instance2 == instance3);   // ----->>>> true

        System.out.println("---------------------------------------------------------");

        // 3.懒汉 -- 双重检查锁 --- 检测创建的是否为同一对象
        Singleton3 instance4 = Singleton3.getInstance();
        Singleton3 instance5 = Singleton3.getInstance();
        System.out.println(instance4 == instance5);   // ----->>>> true

        System.out.println("---------------------------------------------------------");

        // 4.懒汉 -- 静态内部类 --- 检测创建的是否为同一对象
        Singleton4 instance6 = Singleton4.getInstance();
        Singleton4 instance7 = Singleton4.getInstance();
        System.out.println(instance6 == instance7);   // ----->>>> true

        System.out.println("---------------------------------------------------------");

        // 5.恶汉 -- 枚举 --- 检测创建的是否为同一对象
        Singleton5 instance8 = Singleton5.INSTANCE;
        Singleton5 instance9 = Singleton5.INSTANCE;
        System.out.println(instance8 == instance9);   // ----->>>> true

    }
}
