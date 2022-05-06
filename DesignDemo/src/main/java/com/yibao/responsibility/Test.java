package com.yibao.responsibility;

/**
 * @author yibao
 * @create 2022 -05 -06 -16:15
 */
public class Test {
    public static void main(String[] args) {
        // 创建请假条
        LeaveRequest leaveRequest = new LeaveRequest("小李", 8, "旅游");

        // 创建各级领导
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        // 设置处理链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        // 提交请假条
        groupLeader.submit(leaveRequest);
    }
}
