package cn.study.design.command.second.LivingroomLight;

import cn.study.design.command.first.Command;
import cn.study.design.command.second.Light.Light;

/**
 * <pre>类名: LivingroomLightOffCommand</pre>
 * <pre>描述: 卧室灯关闭命令</pre>
 * <pre>日期: 2018/8/30 22:17</pre>
 * <pre>作者: xueshun</pre>
 */
public class LivingroomLightOffCommand implements Command {

    Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
