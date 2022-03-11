package com.yibao.builder.demo2;

/**
 * 测试类
 * @author yibao
 * @create 2022 -03 -11 -13:44
 */
public class Test {
    public static void main(String[] args) {
        Phone phone = new Phone.Builder()
                .cpu("intel")
                .memory("金士顿")
                .mainboard("华硕")
                .screen("华为")
                .build();
        System.out.println(phone);
    }
}
