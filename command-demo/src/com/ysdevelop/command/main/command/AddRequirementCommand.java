package com.ysdevelop.command.main.command;

public class AddRequirementCommand extends Command {

    @Override
    public void execuate() {
        // 找到需求组
        super.requirementGroup.find();
        // 添加需求
        super.requirementGroup.add();
        // 执行需求
        super.requirementGroup.plan();
    }
}
