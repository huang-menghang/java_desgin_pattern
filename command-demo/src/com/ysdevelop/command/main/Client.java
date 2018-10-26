package com.ysdevelop.command.main;

import com.ysdevelop.command.main.command.AddRequirementCommand;
import com.ysdevelop.command.main.command.Command;
import com.ysdevelop.command.main.invoker.Invoker;

public class Client {
    public static void main(String[] args) {
        System.out.println("命令执行中心");
        Invoker invoker = new Invoker();
        Command command = new AddRequirementCommand();
        invoker.setCommand(command);
        invoker.action();
    }

}
