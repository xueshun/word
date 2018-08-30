package cn.study.design.observer.java;

/**
 * <pre>类名: WeatherStation</pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/28 14:29</pre>
 * <pre>作者: xueshun</pre>
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDispaly currentConditionsDispaly = new CurrentConditionsDispaly(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
