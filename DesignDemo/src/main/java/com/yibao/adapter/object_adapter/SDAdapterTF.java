package com.yibao.adapter.object_adapter;

/**
 * 适配器类：用于将 SD --->> TF
 *
 * @author yibao
 * @create 2022 -03 -15 -10:33
 */
public class SDAdapterTF implements SDCard {

    // 声明适配器类 (接口)
    private TFCard tfCard;

    // 有参构造
    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
