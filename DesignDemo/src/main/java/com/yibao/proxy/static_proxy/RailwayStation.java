package com.yibao.proxy.static_proxy;

/**
 * 火车站
 * @author yibao
 * @create 2022 -03 -14 -15:03
 */
public class RailwayStation implements SellTickets{
    public void sell() {
        System.out.println("--- 火车站售票 ---");
    }
}
