package com.yibao.proxy.jdk_proxy;

/**
 * @author yibao
 * @create 2022 -03 -14 -16:05
 */
public class Test {
    public static void main(String[] args) {
        // 创建代理工厂
        ProxyFactory factory = new ProxyFactory();
        // 获取代理对象
        SellTickets proxyObject = factory.getProxyObject();
        // 卖电脑
        proxyObject.sell();
    }
}
