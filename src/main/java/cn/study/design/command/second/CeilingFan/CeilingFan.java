package cn.study.design.command.second.CeilingFan;

/**
 * <pre>类名: CeilingFan</pre>
 * <pre>描述: 风扇 - 行为</pre>
 * <pre>日期: 2018/8/30 19:16</pre>
 * <pre>作者: xueshun</pre>
 */
public class CeilingFan {

    String location = "";
    int level;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        level = HIGH;
        System.out.println(location + "ceiling fan is on high");
    }

    public void medium() {
        level = MEDIUM;
        System.out.println(location + "ceiling fan is on medium");
    }

    public void low() {
        level = LOW;
        System.out.println(location + "ceiling fan is on low");
    }

    public void off() {
        level = 0;
        System.out.println(location + "ceiling fna is off");
    }

    public int getSpeed() {
        return level;
    }
}
