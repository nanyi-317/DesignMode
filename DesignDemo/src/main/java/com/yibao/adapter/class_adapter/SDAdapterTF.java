package com.yibao.adapter.class_adapter;

/**
 * 适配器类：用于将 SD --->> TF
 * @author yibao
 * @create 2022 -03 -15 -10:33
 */
public class SDAdapterTF extends TFCardImp implements SDCard{
    public String readSD() {
        System.out.println("adapter read tf card");
        String msg = readTF();
        return msg;
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
