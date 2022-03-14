package com.yibao.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 *
 * @author yibao
 * @create 2022 -03 -14 -16:07
 */
public class ProxyFactory {
    // 声明目标对象 -- 火车站
    private RailwayStation station = new RailwayStation();

    // 方法：获取代理对象
    public SellTickets getProxyObject(){
        /*
            返回代理对象
                ClassLoader loader : 类加载器，用于加载代理类，可以通过目标对象获取类加载器
                Class<?>[] interfaces : 代理类实现的接口的字节码对象
                InvocationHandler h ： 代理对象的调用处理程序
         */
        SellTickets proxyInstance = (SellTickets)Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                /*
                    Object proxy : 代理对象，和 proxyInstance 是同一对象，在 invoke 方法中基本不用
                    Method method : 对接口中的方法进行封装的 method 对象
                    Object[] args : 调用方法的实际参数
                    返回值 ： 方法的返回值
                 */
                new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("---- 代售点受理买票业务 --- 【JDK】");
                        // 执行目标对象的方法
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );
        return proxyInstance;
    }
}
