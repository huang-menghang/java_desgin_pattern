package com.ysdevelop.command.main.invoker;

import com.ysdevelop.command.main.command.Command;

public class Invoker {

    private Command command;

    //向客户发出命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //执行命令
    public void action() {
        this.command.execuate();
    }
}
