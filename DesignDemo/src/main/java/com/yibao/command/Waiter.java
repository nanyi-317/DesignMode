package com.yibao.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yibao
 * @create 2022 -05 -06 -14:51
 * 服务员（请求者角色）
 */
public class Waiter {
    // 持有多个命令对象
    private List<Command> commands = new ArrayList<Command>();

    // 方法：添加命令
    public void setCommand(Command command) {
        commands.add(command);
    }

    // 方法：发起命令
    public void orderUp() {
        System.out.println("....订单来了....");
        for (Command command : commands) {
            if (null != command) {
                command.execute();
            }
        }
    }
}
