package com.yibao.proxy.static_proxy;

/**
 * @author yibao
 * @create 2022 -03 -14 -14:28
 */
public class Test {
    public static void main(String[] args) {
        // 创建代售点
        ProxyPoint point = new ProxyPoint();
        // 买票
        point.sell();
    }
}

