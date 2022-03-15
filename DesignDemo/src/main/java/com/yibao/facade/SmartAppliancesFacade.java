package com.yibao.facade;

/**
 * 外观类
 * @author yibao
 * @create 2022 -03 -15 -16:20
 */
public class SmartAppliancesFacade {
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    // 构造器
    public SmartAppliancesFacade() {
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    // 方法：语音控制
    public void say(String msg) {
        if (msg.contains("打开")) {
            on();
        } else if (msg.contains("关闭")) {
            off();
        } else {
            System.out.println("请重新说...");
        }
    }

    // 方法：一键关闭
    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }

    // 方法：一键开启
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }
}
