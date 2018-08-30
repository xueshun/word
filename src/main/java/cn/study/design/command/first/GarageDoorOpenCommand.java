package cn.study.design.command.first;

/**
 * <pre>类名: GarageDoorOpenCommand</pre>
 * <pre>描述: 车库门打开命令</pre>
 * <pre>日期: 2018/8/30 16:52</pre>
 * <pre>作者: xueshun</pre>
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
