package cn.study.design.command.party;

import cn.study.design.command.first.Command;

/**
 * <pre>类名: MacroCommand</pre>
 * <pre>描述: party命令执行</pre>
 * <pre>日期: 2018/8/31 9:50</pre>
 * <pre>作者: xueshun</pre>
 */
public class MacroCommand implements Command {

    Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }
}
