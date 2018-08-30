package cn.study.design.command.second.Light;

/**
 * <pre>类名: Light</pre>
 * <pre>描述: 灯 - 所基本的行为</pre>
 * <pre>日期: 2018/8/30 17:57</pre>
 * <pre>作者: xueshun</pre>
 */
public class Light {

    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " 灯处于打开状态");
    }

    public void off() {
        System.out.println(location + " 灯处于关闭状态");
    }
}
