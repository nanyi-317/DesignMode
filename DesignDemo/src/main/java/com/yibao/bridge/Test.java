package com.yibao.bridge;

/**
 * 测试类：桥接模式
 * @author yibao
 * @create 2022 -03 -15 -15:18
 */
public class Test {
    public static void main(String[] args) {
        OperatingSystem system = new Mac(new AviFile());
        system.play("咒术回战");
    }
}
