package cn.study.concurrent.art.chapter07;

import java.util.concurrent.CountDownLatch;

/**
 * <pre>类名: CountDownLatchTest</pre>
 * <pre>描述: CountDownLatch使用</pre>
 * <pre>日期: 2018/11/22 10:08</pre>
 * <pre>作者: xueshun</pre>
 */
public class CountDownLatchTest {

    //CountDownLatch的构造函数接受一个int类型的参数作为计数器，如果想等待N个点完成，这就传入N
    static CountDownLatch c = new CountDownLatch(2);

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
                c.countDown();
                System.out.println(2);
                c.countDown();
            }
        }).start();
        c.await();
        System.out.println(3);
    }
}
