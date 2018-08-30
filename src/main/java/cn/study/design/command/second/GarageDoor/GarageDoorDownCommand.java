package cn.study.design.command.second.GarageDoor;

import cn.study.design.command.first.Command;
import cn.study.design.command.first.GarageDoor;

/**
 * <pre>类名: GarageDoorDownCommand</pre>
 * <pre>描述: 车库门打开命令</pre>
 * <pre>日期: 2018/8/30 19:26</pre>
 * <pre>作者: xueshun</pre>
 */
public class GarageDoorDownCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorDownCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.down();
    }
}
