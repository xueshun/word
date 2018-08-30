package cn.study.design.command.first;

/**
 * <pre>类名: LightOffCommand</pre>
 * <pre>描述: 灯关闭命令</pre>
 * <pre>日期: 2018/8/30 14:39</pre>
 * <pre>作者: xueshun</pre>
 */
public class LightOffCommand implements Command {

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
