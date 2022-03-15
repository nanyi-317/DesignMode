package com.yibao.adapter.object_adapter;

/**
 * 接口：适配者类
 * @author yibao
 * @create 2022 -03 -15 -10:19
 */
public interface TFCard {
    // 读取 TF
    String readTF();
    // 写入 TF
    void writeTF(String msg);
}
