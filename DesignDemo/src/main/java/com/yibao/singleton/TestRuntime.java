package com.yibao.singleton;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author yibao
 * @create 2022 -03 -09 -17:49
 */
public class TestRuntime {
    public static void main(String[] args) throws IOException {
        // 测试单例模式的获取、使用
        Runtime runtime = Runtime.getRuntime();
        // 获取信息并打印至控制台
        Process process = runtime.exec("ipconfig");
        InputStream inputStream = process.getInputStream();
        byte[] bytes = new byte[1024 * 1024 * 1000];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes, 0, len, "GBK"));
    }
}
