package com.ysdevelop.command.main.command;

import com.ysdevelop.command.main.group.CodeGroup;
import com.ysdevelop.command.main.group.PageGroup;
import com.ysdevelop.command.main.group.RequirementGroup;

public abstract class Command {

    protected RequirementGroup requirementGroup = new RequirementGroup();

    protected PageGroup pageGroup = new PageGroup();

    protected CodeGroup codeGroup = new CodeGroup();

    public abstract void execuate();


}
