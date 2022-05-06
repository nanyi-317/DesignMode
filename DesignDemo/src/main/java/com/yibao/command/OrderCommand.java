package com.yibao.command;

import java.util.Map;
import java.util.Set;

/**
 * @author yibao
 * @create 2022 -05 -06 -11:56
 * 具体命令执行类
 */
public class OrderCommand implements Command {
    // 属性：持有接收者（厨师 & 订单）
    private Chef chef;
    private Order order;

    public OrderCommand(Chef chef, Order order) {
        this.chef = chef;
        this.order = order;
    }

    // 方法：执行命令 （厨师根据订餐做饭）
    public void execute() {
        System.out.println("现在开始处理 " + order.getTableNum() + " 订单：");
        Map<String, Integer> menu = order.getMenu();
        Set<String> keySet = menu.keySet();
        for (String name : keySet) {
            chef.makeFood(name, menu.get(name));
        }
        System.out.println(order.getTableNum() + " 出餐");
    }
}
