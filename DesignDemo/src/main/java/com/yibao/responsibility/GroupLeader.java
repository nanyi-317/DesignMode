package com.yibao.responsibility;

/**
 * @author yibao
 * @create 2022 -05 -06 -16:44
 * 具体处理者：小组长
 */
public class GroupLeader extends Handler{
    // 构造方法
    public GroupLeader() {
        super(0,Handler.NUM_ONE);
    }

    // 重写方法：审批
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + " 请假 " + leaveRequest.getDays() + " 天 ");
        System.out.println("小组长审批：同意！");
    }
}
