package com.yibao.combination;

/**
 * 菜单组件：抽象根节点（顶层）
 * @author yibao
 * @create 2022 -03 -16 -9:49
 */
public abstract class MenuComponent {
    // 菜单名称
    protected String name;
    // 菜单层级
    protected int level;

    // 方法：添加子菜单
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 方法：移除子菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 方法：获取指定子菜单
    public MenuComponent getChild(int level) {
        throw new UnsupportedOperationException();
    }

    // 方法：获取菜单或菜单项名称
    public String getName() {
        return name;
    }

    // 方法：打印菜单（包含子菜单和子菜单项）
    public abstract void print();
}
