package cn.study.design.singleton.second;

/**
 * <pre>类名: Singleton</pre>
 * <pre>描述: 单例模式 - 饱汉模式</pre>
 * <pre>日期: 2018/8/30 10:23</pre>
 * <pre>作者: xueshun</pre>
 */
public class Singleton {

    /**
     * 在静态初始化器中创建单件。这段代码保证了线程安全
     */
    private static Singleton uniqueInstance = new Singleton();

    public Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
