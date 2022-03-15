package com.yibao.adapter.class_adapter;

/**
 * @author yibao
 * @create 2022 -03 -15 -10:25
 */
public class SDCardImp implements SDCard{
    public String readSD() {
        String msg = "SDCard read msg : hello!!!";
        return msg;
    }

    public void writeSD(String msg) {
        System.out.println("SDCard write msg : " + msg);
    }
}
