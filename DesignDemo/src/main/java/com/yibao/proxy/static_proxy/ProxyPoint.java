package com.yibao.proxy.static_proxy;

/**
 * 代售点
 * @author yibao
 * @create 2022 -03 -14 -15:04
 */
public class ProxyPoint implements SellTickets{
    // 生命火车站对象
    private RailwayStation railwayStation = new RailwayStation();

    public void sell() {
        System.out.println("--- 代售点受理买票 ---");
        railwayStation.sell();
    }
}
