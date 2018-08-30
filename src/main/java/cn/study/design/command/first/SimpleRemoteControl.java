package cn.study.design.command.first;

/**
 * <pre>类名: SimpleRemoteControl</pre>
 * <pre>描述: this is invoker</pre>
 * <pre>日期: 2018/8/30 14:41</pre>
 * <pre>作者: xueshun</pre>
 */
public class SimpleRemoteControl {

    /**
     * 有一个插槽持有命令，而这个命令控制着一个装置
     */
    Command slot;

    public SimpleRemoteControl() {
    }

    /**
     * 这个方法用来设置插槽控制的命令。如果这段代码的客户想要修改遥控器按钮的行为，可以多次调用这个方法
     */
    public void buttonWasPressed() {
        slot.execute();
    }

    /**
     * 当按下按钮时，这个方法就会被调用，是的当前命令衔接卡槽，并调用它的execute()方法
     *
     * @param command
     */
    public void setCommand(Command command) {
        slot = command;
    }
}
