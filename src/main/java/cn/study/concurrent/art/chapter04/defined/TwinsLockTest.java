package cn.study.concurrent.art.chapter04.defined;

import cn.study.concurrent.art.chapter04.SleepUtils;

import java.util.concurrent.locks.Lock;

public class TwinsLockTest {

    public static void main(String[] args) {

        final Lock lock = new TwinsLock();

        class Worker extends Thread {
            @Override
            public void run() {
                while (true) {
                    lock.lock();
                    try {
                        SleepUtils.second(1);
                        System.out.println(Thread.currentThread().getName());
                        SleepUtils.second(1);
                    } finally {
                        lock.unlock();
                    }
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            Worker worker = new Worker();
            worker.setDaemon(true);
            worker.start();
        }

        for (int i = 0; i < 10; i++) {
            SleepUtils.second(1);
            System.out.println();
        }
    }
}