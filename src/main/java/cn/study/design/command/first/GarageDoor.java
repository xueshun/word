package cn.study.design.command.first;

/**
 * <pre>类名: GarageDoor</pre>
 * <pre>描述: 车库 行为</pre>
 * <pre>日期: 2018/8/30 16:48</pre>
 * <pre>作者: xueshun</pre>
 */
public class GarageDoor {

    String location = "";

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + "车库门 打开");
    }

    public void down() {
        System.out.println(location + "车库门 关闭");
    }

    public void stop() {
        System.out.println(location + "车库门 停止运行");
    }

    public void lightOn() {
        System.out.println(location + "车库灯 打开");
    }

    public void lightDown() {
        System.out.println(location + "车库灯 关闭");
    }
}
