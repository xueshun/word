package cn.study.design.command.second.Stereo;

/**
 * <pre>类名: Stereo</pre>
 * <pre>描述: 音响 - 所基本的行为</pre>
 * <pre>日期: 2018/8/30 17:45</pre>
 * <pre>作者: xueshun</pre>
 */
public class Stereo {

    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " 音响处于打开状态");
    }

    public void off() {
        System.out.println(location + " 音响处于关闭状态");
    }

    public void setCD() {
        System.out.println(location + " 音响设置为CD模式");
    }

    public void setDVD() {
        System.out.println(location + " 音响设置为DVD模式");
    }

    public void setRadio() {
        System.out.println(location + " 音响设置为Radio模式");
    }

    public void setVolume(int volume) {
        /**
         * volume 的范围： 1- 11
         */
        System.out.println(location + " 音响音量设置为" + volume);
    }
}
