package cn.study.design.observer.java;

import java.util.Observable;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/28 14:18</pre>
 * <pre>作者: xueshun</pre>
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanged() {
        setChanged();
        /**
         * 注意： 我们没有调用notifyObservers()传递数据对象，这表示哦我们采用的做法是‘拉’
         */
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /**
     * 获取temperature
     *
     * @return temperature
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * 获取humidity
     *
     * @return humidity
     */
    public float getHumidity() {
        return humidity;
    }

    /**
     * 获取pressure
     *
     * @return pressure
     */
    public float getPressure() {
        return pressure;
    }
}
