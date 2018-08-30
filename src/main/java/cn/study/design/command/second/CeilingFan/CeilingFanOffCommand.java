package cn.study.design.command.second.CeilingFan;

import cn.study.design.command.first.Command;

/**
 * <pre>类名: CeilingFanOffCommand</pre>
 * <pre>描述: 风扇关闭命令</pre>
 * <pre>日期: 2018/8/30 19:21</pre>
 * <pre>作者: xueshun</pre>
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.off();
    }
}
