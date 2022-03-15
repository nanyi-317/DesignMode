package com.yibao.bridge;

/**
 * 操作系统
 *
 * @author yibao
 * @create 2022 -03 -15 -15:21
 */
public abstract class OperatingSystem {
    // 声明 video 变量
    protected VideoFile videoFile;

    // 构造方法
    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    // 方法：播放视频
    public abstract void play(String fileName);
}
