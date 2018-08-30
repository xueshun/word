package cn.study.design.observer.self;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/28 11:01</pre>
 * <pre>作者: xueshun</pre>
 */
public class WeatherStation {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
