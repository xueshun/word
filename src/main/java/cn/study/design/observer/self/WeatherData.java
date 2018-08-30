package cn.study.design.observer.self;

import java.util.ArrayList;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/28 10:47</pre>
 * <pre>作者: xueshun</pre>
 */
public class WeatherData implements Subject {

    private ArrayList observers;
    /**温度*/
    private float temperature;
    /**湿度*/
    private float humidity;
    /**气压*/
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * 注册
     * @param o
     */
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * 移除
     * @param o
     */
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * 通知
     */
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);
            observer.update(temperature,humidity,pressure);
        }
    }

    /**
     * 当从气象站得到更新的观测值时，我们通知观察者
     */
    public void measurementsChanged(){
        notifyObserver();
    }


    public void setMeasurements(float temperature,float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
