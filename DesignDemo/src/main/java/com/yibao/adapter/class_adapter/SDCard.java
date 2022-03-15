package com.yibao.adapter.class_adapter;

/**
 * 目标接口
 *
 * @author yibao
 * @create 2022 -03 -15 -10:23
 */
public interface SDCard {
    // SD 读取
    String readSD();

    // SD 写入
    void writeSD(String msg);
}
