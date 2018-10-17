package com.ysdevelop.command.main.group;

public class RequirementGroup extends Group {

    @Override
    public void find() {
        System.out.println("找到需求组");
    }

    @Override
    public void add() {
        System.out.println("客户添加一个需求");
    }

    @Override
    public void delete() {
        System.out.println("客户删除一个需求");
    }

    @Override
    public void change() {
        System.out.println("客户修改一个需求");
    }

    @Override
    public void plan() {
        System.out.println("客户计划一个需求");
    }
}
