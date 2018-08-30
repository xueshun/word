package cn.study.design.command.second.Light;

import cn.study.design.command.first.Command;

/**
 * <pre>类名: LightOnCommand</pre>
 * <pre>描述: 灯打开命令</pre>
 * <pre>日期: 2018/8/30 22:13</pre>
 * <pre>作者: xueshun</pre>
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
