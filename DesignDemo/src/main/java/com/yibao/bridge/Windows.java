package com.yibao.bridge;

/**
 * windows 操作系统
 * @author yibao
 * @create 2022 -03 -15 -15:33
 */
public class Windows extends OperatingSystem{
    // 构造
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }
    // 方法：播放
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
