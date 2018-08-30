package cn.study.design.singleton.first;

/**
 * <pre>类名: Singleton</pre>
 * <pre>描述: 单例模式 - 多线程 synchronized</pre>
 * <pre>日期: 2018/8/30 10:23</pre>
 * <pre>作者: xueshun</pre>
 */
public class Singleton1 {

    private static Singleton1 uniqueInstance;

    public Singleton1() {
    }

    /**
     * 通过增加synchronized关键字到getInstance()方法中给，迫使每个线程在进入这个方法
     * 之前，要先等待别的线程离开该方法。也就是说，不会有两个线程同时进入这个方法。
     * <p>
     * 问题： 同步降低性能
     * <p>
     * 原因：只有第一次执行此方法时，才真正需要同步。换句话说，一旦设置号uniqueInstance变量，就不再同步
     * 这个方法了，之后每次调用这个方法，同步都是一种累赘
     *
     * @return
     */
    public static synchronized Singleton1 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
}
