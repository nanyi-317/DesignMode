package com.yibao.singleton;

/**
 * 单例模式  ---- 懒汉式 (双重检查锁模式 -- 解决线程安全问题)
 * @author yibao
 * @create 2022 -03 -09 -14:14
 */
public class Singleton3 {
    private static boolean flag = false;

    // 1.私有构造方法
    private Singleton3() {
        // 解决反射破坏
        synchronized (Singleton3.class) {
            // 判断 flag --- true：非第一次创建，抛出异常，不让其创建 ； false：第一次创建，允许
            if (flag) {
                throw new RuntimeException("非第一次创建该对象，拒绝");
            }
            flag = true;
        }
    }

    // 2.创建对象  --- volatile --- 解决多线程情况下可能出现的空指针问题，此关键字保证可见性和有序性
    private static volatile Singleton3 instance;

    // 3.提供公共访问方式，让外界能够拿到对象
    public static Singleton3 getInstance() {
        // 第一次检查：如果不为null，可以直接返回对象，不用抢占锁
        if (null == instance) {
            // 第二次检车：使用同步代码块，避免多线程抢占生成多个问题
            synchronized (Singleton3.class) {
                if (null == instance) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
