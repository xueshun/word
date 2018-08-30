package cn.study.design.command.second.Stereo;

import cn.study.design.command.first.Command;

/**
 * <pre>类名: StereoOffCommand</pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/30 22:24</pre>
 * <pre>作者: xueshun</pre>
 */
public class StereoOffCommand implements Command {

    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.off();
    }
}
