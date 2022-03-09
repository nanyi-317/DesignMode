package com.yibao.singleton;

/**
 * 单例模式  ---- 饿汉式 --- 静态代码块方式
 * @author yibao
 * @create 2022 -03 -09 -14:28
 */
public class Singleton2 {
    // 1.私有构造方法
    private Singleton2() {}

    // 2.成员变量创建
    private static Singleton2 instance;

    // 3.静态代码块赋值
    static {
        instance = new Singleton2();
    }

    // 4.对外提供公共访问
    public static Singleton2 getInstance() {
        return instance;
    }
}
