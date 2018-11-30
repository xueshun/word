package cn.study.concurrent.art.chapter06;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * <pre>类名: CountTask</pre>
 * <pre>描述: ForkJion框架的使用</pre>
 * <pre>日期: 2018/11/21 17:20</pre>
 * <pre>作者: xueshun</pre>
 */
public class CountTask extends RecursiveTask<Integer> {


    private static final int THRESHOLD = 2; //阈值

    private int start;
    private int end;

    public CountTask(int start, int end) {
        this.start = start;
        this.end = end;
    }


    protected Integer compute() {
        int sum = 0;

        //如果任务足够小就计算任务
        boolean canCompute = (end - start) <= THRESHOLD;
        if(canCompute){
            for (int i = start; i < end; i++) {
                sum += i;
            }
        }else{
            //如果任务大于阈值，就分裂成两个子任务计算
            int middel = (start + end) /2;
            CountTask leftTask = new CountTask(start,middel);
            CountTask rightTask = new CountTask(middel,end);

            //执行子任务
            leftTask.fork();
            rightTask.fork();

            //等待子任务执行完毕，并得到结果
            int leftResult = leftTask.join();
            int rightResult = rightTask.join();

            //合并子任务
            sum = leftResult + rightResult;
        }
        return sum;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        //生成一个计算任务，负责计算1+2+3+4
        CountTask task = new CountTask(1,5);

        //执行一个任务
        ForkJoinTask<Integer> result = forkJoinPool.submit(task);
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
