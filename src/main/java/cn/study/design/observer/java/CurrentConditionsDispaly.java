package cn.study.design.observer.java;

import cn.study.design.observer.self.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/28 14:25</pre>
 * <pre>作者: xueshun</pre>
 */
public class CurrentConditionsDispaly implements Observer,DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDispaly(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                +"F degress and " + humidity + "% humidity");
    }


}
