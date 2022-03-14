package com.yibao.proxy.cglib_proxy;

import com.yibao.proxy.jdk_proxy.SellTickets;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 *
 * @author yibao
 * @create 2022 -03 -14 -16:07
 */
public class ProxyFactory implements MethodInterceptor {
    // 声明火车站对象
    private RailwayStation station = new RailwayStation();

    // 方法：获取代理对象
    public RailwayStation getProxyObject() {
        // 创建 Enhancer 对象
        Enhancer enhancer = new Enhancer();
        // 设置父类字节码对象
        enhancer.setSuperclass(RailwayStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        RailwayStation proxyObject = (RailwayStation) enhancer.create();
        return proxyObject;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("---- 代售点受理买票业务 ---- 【CGLIB】");
        Object obj = method.invoke(station, objects);
        return obj;
    }
}
