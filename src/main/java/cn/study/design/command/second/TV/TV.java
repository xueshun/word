package cn.study.design.command.second.TV;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/30 22:19</pre>
 * <pre>作者: xueshun</pre>
 */
public class TV {

    String location;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println("TV is on");
    }

    public void off() {
        System.out.println("TV is off");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println("Channel is set for VCR");
    }
}
