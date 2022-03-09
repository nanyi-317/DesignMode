package com.yibao.singleton;

/**
 * 单例模式  ---- 饿汉式 --- 静态成员变量方式
 * @author yibao
 * @create 2022 -03 -09 -14:14
 */
public class Singleton1 {
    // 1.私有构造方法
    private Singleton1() {}

    // 2.创建对象
    private static Singleton1 instance = new Singleton1();

    // 3.提供公共访问方式，让外界能够拿到对象
    public static Singleton1 getInstance() {
        return instance;
    }
}
