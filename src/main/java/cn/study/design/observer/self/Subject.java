package cn.study.design.observer.self;

/**
 * <pre>类名: Subject</pre>
 * <pre>描述: 订阅主题</pre>
 * <pre>日期: 2018/8/12 22:45</pre>
 * <pre>作者: xueshun</pre>
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
