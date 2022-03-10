package com.yibao.factory.configFactory;

import javax.naming.Name;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import java.util.Set;

/**
 * @author yibao
 * @create 2022 -03 -10 -15:37
 */
public class CoffeeShop {
    // 定义容器，存储咖啡对象
    private static HashMap<String, Coffee> map = new HashMap<String, Coffee>();

    // 静态代码块加载配置文件
    static {
        try {
            Properties properties = new Properties();
            // 获取文件流
            InputStream is = CoffeeShop.class.getClassLoader().getResourceAsStream("bean.properties");
            properties.load(is);
            // 获取类名，创建对象
            Set<Object> keys = properties.keySet();
            for (Object key : keys) {
                String className = properties.getProperty((String) key);
                // 反射创建对象
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                // 将名称和对象存储进容器
                map.put((String) key, coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 根据名称获取对象
    public static Coffee createCoffee(String name) {
        return map.get(name);
    }
}
