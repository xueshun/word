package cn.study.design.command.second.GarageDoor;

import cn.study.design.command.first.Command;
import cn.study.design.command.first.GarageDoor;

/**
 * <pre>类名: garageDoorUpCommand</pre>
 * <pre>描述: 车库门打开命令</pre>
 * <pre>日期: 2018/8/30 19:27</pre>
 * <pre>作者: xueshun</pre>
 */
public class GarageDoorUpCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
