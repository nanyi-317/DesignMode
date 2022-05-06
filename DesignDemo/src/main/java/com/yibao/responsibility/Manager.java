package com.yibao.responsibility;

/**
 * @author yibao
 * @create 2022 -05 -06 -16:44
 * 具体处理者：部门经理
 */
public class Manager extends Handler{
    // 构造方法
    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    // 重写方法：审批
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + " 请假 " + leaveRequest.getDays() + " 天 ");
        System.out.println("部门经理审批：同意！");
    }
}
