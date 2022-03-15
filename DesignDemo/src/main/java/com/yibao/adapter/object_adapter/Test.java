package com.yibao.adapter.object_adapter;

/**
 * 测试类：类适配器模式
 * @author yibao
 * @create 2022 -03 -15 -10:18
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        String msg = computer.readSD(new SDAdapterTF(new TFCardImp()));
        System.out.println(msg);
    }
}
