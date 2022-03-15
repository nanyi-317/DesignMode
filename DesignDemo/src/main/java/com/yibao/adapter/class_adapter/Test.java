package com.yibao.adapter.class_adapter;

/**
 * 测试类：类适配器模式
 * @author yibao
 * @create 2022 -03 -15 -10:18
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDCardImp());
        System.out.println(msg);

        System.out.println("------------------------------------------");
        // 使用适配器
        msg = computer.readSD(new SDAdapterTF());
        System.out.println(msg);
    }
}
