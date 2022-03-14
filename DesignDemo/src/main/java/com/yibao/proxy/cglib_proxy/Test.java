package com.yibao.proxy.cglib_proxy;

/**
 * @author yibao
 * @create 2022 -03 -14 -16:50
 */
public class Test {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        RailwayStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
