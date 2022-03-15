package com.yibao.bridge;

/**
 * Avi 视频文件
 * @author yibao
 * @create 2022 -03 -15 -15:19
 */
public class AviFile implements VideoFile{
    public void decode(String fileName) {
        System.out.println("avi 视频文件 --- " + fileName);
    }
}
