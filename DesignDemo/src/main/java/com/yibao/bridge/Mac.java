package com.yibao.bridge;

/**
 * @author yibao
 * @create 2022 -03 -15 -15:36
 */
public class Mac extends OperatingSystem{
    // 构造
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }
    // 方法：播放
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
