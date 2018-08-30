package cn.study.design.singleton.third;

/**
 * <pre>类名: Singleton</pre>
 * <pre>描述: 单例模式 - 双重加锁</pre>
 * <pre>日期: 2018/8/30 10:23</pre>
 * <pre>作者: xueshun</pre>
 */
public class Singleton {

    private volatile static Singleton uniqueInstance;

    public Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
