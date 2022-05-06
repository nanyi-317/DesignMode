package com.yibao.responsibility;

import lombok.*;

/**
 * @author yibao
 * @create 2022 -05 -06 -16:29
 * 抽象类：处理者
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class Handler {
    // 天数常量
    protected final static int NUM_ONE = 1;
    protected final static int NUM_THREE = 3;
    protected final static int NUM_SEVEN = 7;

    // 该领导处理的天数区间
    private int numStart;
    private int numEnd;

    // 声明上级领导
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    // 抽象方法：各级领导处理请假条的方式
    protected abstract void handlerLeave(LeaveRequest leaveRequest);

    // 方法：提交请假条
    public final void submit(LeaveRequest leaveRequest) {
        // 领导审批
        this.handlerLeave(leaveRequest);
        if (null != this.nextHandler && leaveRequest.getDays() > this.numEnd) {
            // 有上级领导，且，该领导自身无法审批此请假
            this.nextHandler.submit(leaveRequest);
        } else {
            System.out.println("审批流程结束！");
        }
    }
}
