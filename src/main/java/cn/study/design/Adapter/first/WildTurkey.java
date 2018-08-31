package cn.study.design.Adapter.first;

/**
 * <pre>类名: WildTurkey</pre>
 * <pre>描述: 野火鸡</pre>
 * <pre>日期: 2018/8/31 10:27</pre>
 * <pre>作者: xueshun</pre>
 */
public class WildTurkey implements Turkey {
    public void gogle() {
        System.out.println(" 咯咯");
    }

    public void fly() {
        System.out.println("我可以飞行一小段距离");
    }
}
