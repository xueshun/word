package cn.study.design.Adapter.Facade.first;

/**
 * <pre>类名: DvdPlayer</pre>
 * <pre>描述: Dvd - 行为</pre>
 * <pre>版权: 税友软件集团股份有限公司</pre>
 * <pre>日期: 2018/8/31 16:50</pre>
 * <pre>作者: xueshun</pre>
 */
public class DvdPlayer {

    String description;
    int currentTrack;
    Amplifier amplifier;
    String movie;

    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(description + " on");
    }

    public void off() {
        System.out.println(description + " off");
    }

    public void eject() {
        movie = null;
        System.out.println(description + " eject");
    }

    public void play(String movie) {
        this.movie = movie;
        currentTrack = 0;
        System.out.println(description + " playing \"" + movie + "\"");
    }

    public void play(int track) {
        if (movie == null) {
            System.out.println(description + " can't play track " + track + " no dvd inserted");
        } else {
            currentTrack = track;
            System.out.println(description + " playing track " + currentTrack + " of \"" + movie + "\"");
        }
    }

    public void stop() {
        currentTrack = 0;
        System.out.println(description + " stopped \"" + movie + "\"");
    }

    public void pause() {
        System.out.println(description + " paused \"" + movie + "\"");
    }

    public void setTwoChannelAudio() {
        System.out.println(description + " set two channel audio");
    }

    public void setSurroundAudio() {
        System.out.println(description + " set surround audio");
    }

    @Override
    public String toString() {
        return description;
    }

}
