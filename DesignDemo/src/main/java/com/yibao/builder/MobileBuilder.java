package com.yibao.builder;

/**
 * 具体构建者 --- 摩拜单车
 * @author yibao
 * @create 2022 -03 -11 -11:16
 */
public class MobileBuilder extends Builder{
    public void buildFrame() {
        bike.setFrame("摩拜 -- 车架");
    }

    public void buildSeat() {
        bike.setSeat("摩拜 -- 车座");
    }

    public Bike createBike() {
        return bike;
    }
}
