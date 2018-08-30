package cn.study.design.command.second.Hottub;

import cn.study.design.command.first.Command;

/**
 * <pre>类名: HottubOnCommand</pre>
 * <pre>描述: 浴池开启命令</pre>
 * <pre>日期: 2018/8/30 19:13</pre>
 * <pre>作者: xueshun</pre>
 */
public class HottubOnCommand implements Command {

    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.on();
        hottub.heat();
        hottub.bubblesOn();
    }
}
