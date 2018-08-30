package cn.study.design.singleton.first;

/**
 * <pre>类名: Singleton</pre>
 * <pre>描述: 单例模式 - 懒汉模式</pre>
 * <pre>日期: 2018/8/30 10:23</pre>
 * <pre>作者: xueshun</pre>
 */
public class Singleton {

    private static Singleton uniqueInstance;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
