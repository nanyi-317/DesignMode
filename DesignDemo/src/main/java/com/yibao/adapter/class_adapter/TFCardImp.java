package com.yibao.adapter.class_adapter;

/**
 * 适配者类
 * @author yibao
 * @create 2022 -03 -15 -10:20
 */
public class TFCardImp implements TFCard{
    public String readTF() {
        String msg = "TF read msg : hello world!";
        return msg;
    }

    public void writeTF(String msg) {
        System.out.println("TF write msg : " + msg);
    }
}
