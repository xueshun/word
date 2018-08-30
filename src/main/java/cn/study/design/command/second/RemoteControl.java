package cn.study.design.command.second;

import cn.study.design.command.first.Command;

/**
 * <pre>类名: RemoteControl</pre>
 * <pre>描述: 遥控器</pre>
 * <pre>日期: 2018/8/30 17:35</pre>
 * <pre>作者: xueshun</pre>
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * 设置命令 打开
     *
     * @param slot       第几个卡槽
     * @param onCommand  打开命令
     * @param offCommand 关闭命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 第几个卡槽执行‘开’命令
     *
     * @param slot 卡槽序号
     */
    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    /**
     * 第几个卡槽执行‘关’命令
     *
     * @param slot
     */
    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }
}
