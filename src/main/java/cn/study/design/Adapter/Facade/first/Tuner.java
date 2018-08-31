package cn.study.design.Adapter.Facade.first;

/**
 * <pre>类名: Tuner</pre>
 * <pre>描述: 收音机 - 行为</pre>
 * <pre>日期: 2018/8/31 16:43</pre>
 * <pre>作者: xueshun</pre>
 */
public class Tuner {

    String description;
    Amplifier amplifier;
    /**
     * 频率
     */
    double frequency;

    public Tuner(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + "on");
    }

    public void off() {
        System.out.println(description + "off");
    }

    public void setFrequency(double frequency) {
        System.out.println(description + "setting frequency to " + frequency);
        this.frequency = frequency;
    }

    public void setAm() {
        System.out.println(description + " setting AM mode");
    }

    public void setFm() {
        System.out.println(description + "setting PM mode");
    }

    @Override
    public String toString() {
        return description;
    }
}
