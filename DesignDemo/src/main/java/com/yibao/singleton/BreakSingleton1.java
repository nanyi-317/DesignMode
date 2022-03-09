package com.yibao.singleton;

import java.io.*;

/**
 * 破坏单例 --- 序列化
 * @author yibao
 * @create 2022 -03 -09 -15:56
 */
public class BreakSingleton1 {
    public static void main(String[] args) throws Exception{
        writeObjectToFile();
        readObjectFromFile();   // com.yibao.singleton.Singleton4@378bf509   不是同一对象
        readObjectFromFile();   // com.yibao.singleton.Singleton4@5fd0d5ae
    }

    // 方法：从文件中读取数据（对象）
    public static void readObjectFromFile() throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\a.txt"));
        Singleton4 instance = (Singleton4) ois.readObject();
        System.out.println(instance);
        ois.close();
    }

    // 方法：向文件中写入数据（对象）
    public static void writeObjectToFile() throws Exception{
        Singleton4 instance = Singleton4.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\a.txt"));
        oos.writeObject(instance);
        oos.close();
    }
}
