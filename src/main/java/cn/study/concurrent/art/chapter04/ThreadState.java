package cn.study.concurrent.art.chapter04;

import org.docx4j.model.properties.table.tr.TrHeight;

/**
 * <pre>类名: ThreadState</pre>
 * <pre>描述: 线程状态</pre>
 * <pre>日期: 2018/11/19 15:49</pre>
 * <pre>作者: xueshun</pre>
 */
public class ThreadState {

    /**
     * @Description:    该线程不断地进行休眠
     * @date 2018/11/19 15:50
     * @author xueshun
     * @return 输出参数
     */
    static class TimeWaiting implements Runnable{
        @Override
        public void run() {
            while(true){
                SleepUtils.second(100);
            }
        }
    }

    /**
     * @Description:    该线程在Waiting.class实例上等待
     * @param 输入参数
     * @date 2018/11/19 15:53
     * @author xueshun
     * @return 输出参数
     */
    static class Waiting implements Runnable{
        @Override
        public void run() {
            while (true){
                synchronized (Waiting.class){
                    try {
                        Waiting.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * @Description:    该线程在Blocked.class实例上加锁后，不会释放该锁
     * @date 2018/11/19 15:55
     * @author xueshun
     * @return 输出参数
     */
    static class Blocked implements Runnable{
        @Override
        public void run() {
            synchronized (Blocked.class){
                while (true){
                    SleepUtils.second(100);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new TimeWaiting(),"TimeWaitingThread").start();
        new Thread(new Waiting(),"WaitingThread").start();

        // 使用两个Blocked线程，一个获取锁成功，另一个被阻塞
        new Thread(new Blocked(),"BlockedThread - 1").start();
        new Thread(new Blocked(),"BlockedThread - 2").start();
    }
}
