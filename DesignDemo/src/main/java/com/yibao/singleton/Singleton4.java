package com.yibao.singleton;

import java.io.Serializable;

/**
 * 单例模式  ---- 懒汉式 ---- 静态内部类
 * @author yibao
 * @create 2022 -03 -09 -14:14
 */
public class Singleton4 implements Serializable {
    // 1.私有构造方法
    private Singleton4() {}

    // 2.定义静态内部类
    private static class SingletonHolder {
        // 3.声明并初始化外部类对象
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    // 4.提供外部访问方式
    public static Singleton4 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 5.解决反序列化导致的对象不一致问题
    // 当进行反序列化时，会自动调用该方法，将该方法的返回值直接返回
    public Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}
