package cn.study.design.command.second.Stereo;

import cn.study.design.command.first.Command;


/**
 * <pre>类名: StereoOnWithCDCommand</pre>
 * <pre>描述: 音响 + CD</pre>
 * <pre>日期: 2018/8/30 17:44</pre>
 * <pre>作者: xueshun</pre>
 */
public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
