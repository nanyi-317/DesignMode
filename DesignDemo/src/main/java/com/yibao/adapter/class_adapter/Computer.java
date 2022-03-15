package com.yibao.adapter.class_adapter;

/**
 * 计算机类
 * @author yibao
 * @create 2022 -03 -15 -10:27
 */
public class Computer {
    // 从 SD卡 中读取数据
    public String readSD(SDCard sdCard) {
        if (null == sdCard) {
            throw new NullPointerException("sd card is null");
        }
        String msg = sdCard.readSD();
        return msg;
    }
}
