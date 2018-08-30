package cn.study.design.observer.self;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/12 22:46</pre>
 * <pre>作者: xueshun</pre>
 */
public interface Observer {
    /**
     *
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp,float humidity,float pressure);
}
