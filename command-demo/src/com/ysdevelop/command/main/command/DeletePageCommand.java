package com.ysdevelop.command.main.command;

/**
 * @author oldhuang
 * @date 2018/10/26
 * @description
 */
public class DeletePageCommand extends Command {


    @Override
    public void execuate() {
        // 页面找到
        super.pageGroup.find();
        // 删除页面
        super.requirementGroup.delete();
        super.codeGroup.plan();

    }
}
