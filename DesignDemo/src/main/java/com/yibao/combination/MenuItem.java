package com.yibao.combination;

/**
 * 菜单项类（叶子节点）
 * @author yibao
 * @create 2022 -03 -16 -10:32
 */
public class MenuItem extends MenuComponent{
    // 构造方法
    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        // 打印菜单项
        System.out.println(name);
    }
}
