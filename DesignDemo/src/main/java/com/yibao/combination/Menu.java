package com.yibao.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类（树枝节点）
 * @author yibao
 * @create 2022 -03 -16 -9:59
 */
public class Menu extends MenuComponent{
    // 菜单有多个子菜单或子菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();

    // 构造函数
    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int level) {
        return menuComponentList.get(level);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print(" - ");
        }
        // 打印菜单
        System.out.println(name);
        // 打印子菜单项
        for (MenuComponent component : menuComponentList) {
            component.print();
        }
    }
}
