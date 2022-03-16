package com.yibao.combination;

/**
 * 测试类：组合模式
 * @author yibao
 * @create 2022 -03 -16 -9:44
 */
public class Test {
    public static void main(String[] args) {
        // 创建菜单树
        MenuComponent component = new Menu("系统管理", 1);

        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("删除菜单", 3));
        menu1.add(new MenuItem("新增菜单", 3));

        MenuComponent menu2 = new Menu("权限管理", 2);
        menu2.add(new MenuItem("页面访问", 3));
        menu2.add(new MenuItem("提交保存", 3));

        MenuComponent menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问", 3));
        menu3.add(new MenuItem("新增角色", 3));
        menu3.add(new MenuItem("修改角色", 3));

        // 将二级菜单添加进一级菜单
        component.add(menu1);
        component.add(menu2);
        component.add(menu3);

        // 打印展示
        component.print();
    }
}
