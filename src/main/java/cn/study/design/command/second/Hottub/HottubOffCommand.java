package cn.study.design.command.second.Hottub;

import cn.study.design.command.first.Command;

/**
 * <pre>类名: HottubOffCommand</pre>
 * <pre>描述: 浴池关闭命令</pre>
 * <pre>日期: 2018/8/30 19:12</pre>
 * <pre>作者: xueshun</pre>
 */
public class HottubOffCommand implements Command {

    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        hottub.cool();
        hottub.off();
    }
}
