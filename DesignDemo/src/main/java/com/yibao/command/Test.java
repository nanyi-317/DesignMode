package com.yibao.command;

/**
 * @author yibao
 * @create 2022 -05 -06 -14:57
 */
public class Test {
    public static void main(String[] args) {
        // 创建订单1
        Order order1 = new Order();
        order1.setTableNum(1);
        order1.setFood("土豆牛肉", 1);
        order1.setFood("豆奶", 2);

        // 创建订单2
        Order order2 = new Order();
        order2.setTableNum(2);
        order2.setFood("小龙虾", 1);
        order2.setFood("西瓜", 1);
        order2.setFood("啤酒", 6);

        // 创建厨师
        Chef chef = new Chef();
        // 创建命令对象
        OrderCommand command1 = new OrderCommand(chef, order1);
        OrderCommand command2 = new OrderCommand(chef, order2);

        // 创建服务员（调用者）
        Waiter waiter = new Waiter();
        waiter.setCommand(command1);
        waiter.setCommand(command2);

        // 发起命令
        waiter.orderUp();
    }
}
