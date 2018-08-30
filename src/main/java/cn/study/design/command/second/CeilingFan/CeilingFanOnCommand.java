package cn.study.design.command.second.CeilingFan;

import cn.study.design.command.first.Command;

/**
 * <pre>类名: CeilingFanOnCommand</pre>
 * <pre>描述: 风扇打开命令</pre>
 * <pre>日期: 2018/8/30 19:20</pre>
 * <pre>作者: xueshun</pre>
 */
public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        ceilingFan.high();
    }
}
