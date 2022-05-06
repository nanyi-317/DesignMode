package com.yibao.responsibility;

/**
 * @author yibao
 * @create 2022 -05 -06 -16:44
 * 具体处理者：总经理
 */
public class GeneralManager extends Handler{
    // 构造方法
    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    // 重写方法：审批
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + " 请假 " + leaveRequest.getDays() + " 天 ");
        System.out.println("总经理审批：同意！");
    }
}
