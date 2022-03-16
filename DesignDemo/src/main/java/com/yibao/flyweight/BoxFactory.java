package com.yibao.flyweight;

import sun.security.smartcardio.SunPCSC;

import java.util.HashMap;

/**
 * 工厂类：设计为 单例模式
 * @author yibao
 * @create 2022 -03 -16 -16:36
 */
public class BoxFactory {
    private HashMap<String, AbstractBox> map;
    private static BoxFactory factory = new BoxFactory();

    // 构造方法 -- 私有化 -- 单例模式
    private BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I",new IBox()) ;
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    // 根据名称获取图形对象
    public AbstractBox getShape(String name) {
        return map.get(name);
    }

    //方法：提供对外方法
    public static BoxFactory getInstance() {
        return factory;
    }
}
