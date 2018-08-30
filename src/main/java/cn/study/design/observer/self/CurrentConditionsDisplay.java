package cn.study.design.observer.self;

/**
 * <pre>类名: </pre>
 * <pre>描述: 布告板</pre>
 * <pre>日期: 2018/8/28 10:56</pre>
 * <pre>作者: xueshun</pre>
 */
public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;


    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
        +"F degress and " + humidity + "% humidity");
    }


}
