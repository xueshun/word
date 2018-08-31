package cn.study.design.Adapter.first;

/**
 * <pre>类名: MallardDuck</pre>
 * <pre>描述: 绿头鸭</pre>
 * <pre>日期: 2018/8/31 10:29</pre>
 * <pre>作者: xueshun</pre>
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("呱呱");
    }

    public void fly() {
        System.out.println("我可以飞");
    }
}
