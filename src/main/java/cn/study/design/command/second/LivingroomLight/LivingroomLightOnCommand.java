package cn.study.design.command.second.LivingroomLight;

import cn.study.design.command.first.Command;
import cn.study.design.command.first.Light;

/**
 * <pre>类名: LivingroomLightOnCommand</pre>
 * <pre>描述: 卧室灯打开命令</pre>
 * <pre>日期: 2018/8/30 22:15</pre>
 * <pre>作者: xueshun</pre>
 */
public class LivingroomLightOnCommand implements Command {

    Light light;

    public LivingroomLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}
