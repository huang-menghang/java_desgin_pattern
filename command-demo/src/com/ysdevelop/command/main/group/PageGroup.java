package com.ysdevelop.command.main.group;

public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到美工组....");
    }

    @Override
    public void add() {
        System.out.println("客户添加一个页面....");
    }

    @Override
    public void delete() {
        System.out.println("客户删除一个页面....");
    }

    @Override
    public void change() {
        System.out.println("客户改变一个页面");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划");
    }
}
