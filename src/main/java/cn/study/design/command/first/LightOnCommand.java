package cn.study.design.command.first;

/**
 * <pre>类名: LightOnCommand</pre>
 * <pre>描述: 灯关闭命令</pre>
 * <pre>日期: 2018/8/30 14:40</pre>
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
