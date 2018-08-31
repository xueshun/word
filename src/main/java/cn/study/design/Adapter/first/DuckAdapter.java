package cn.study.design.Adapter.first;

import java.util.Random;

/**
 * <pre>类名: DuckAdapter</pre>
 * <pre>描述: 鸭子适配器 </pre>
 * <pre>日期: 2018/8/31 10:31</pre>
 * <pre>作者: xueshun</pre>
 */
public class DuckAdapter implements Turkey {

    Duck duck;
    Random random;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    public void gogle() {
        duck.quack();
    }

    public void fly() {
        if (random.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
