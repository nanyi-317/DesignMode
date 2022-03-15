package com.yibao.bridge;

/**
 * Rmvb 视频文件
 * @author yibao
 * @create 2022 -03 -15 -15:19
 */
public class RmvbFile implements VideoFile{
    public void decode(String fileName) {
        System.out.println("rmvb 视频文件 --- " + fileName);
    }
}
