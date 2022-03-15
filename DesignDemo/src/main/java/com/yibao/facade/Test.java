package com.yibao.facade;

/**
 * 测试类：外观模式
 * @author yibao
 * @create 2022 -03 -15 -16:12
 */
public class Test {
    public static void main(String[] args) {
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        facade.say("打开家电");
        System.out.println("--------------------");
        facade.say("关闭家电");
        System.out.println("--------------------");
        facade.say("嘿嘿嘿");
    }
}
