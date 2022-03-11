package com.yibao.builder.demo1;

/**
 * 具体构建者 --- 小黄单车
 * @author yibao
 * @create 2022 -03 -11 -11:16
 */
public class OfoBuilder extends Builder{
    public void buildFrame() {
        bike.setFrame("ofo -- 车架");
    }

    public void buildSeat() {
        bike.setSeat("ofo -- 车座");
    }

    public Bike createBike() {
        return bike;
    }
}
