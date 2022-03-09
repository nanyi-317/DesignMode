package com.yibao.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * 破坏单例 --- 反射
 * @author yibao
 * @create 2022 -03 -09 -15:56
 */
public class BreakSingleton2 {
    public static void main(String[] args) throws Exception{
        // 1.获取Singleton字节码对象
        Class clazz = Singleton3.class;
        // 2.获取无参构造方法对象
        Constructor constructor = clazz.getDeclaredConstructor();
        // 3.强制打开权限
        constructor.setAccessible(true);
        // 4.创建对象
        Singleton3 s1 = (Singleton3) constructor.newInstance();
        Singleton3 s2 = (Singleton3) constructor.newInstance();
        // 5.比较
        System.out.println(s1 == s2);    // false
    }
}
