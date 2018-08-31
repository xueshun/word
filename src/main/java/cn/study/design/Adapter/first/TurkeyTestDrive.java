package cn.study.design.Adapter.first;

/**
 * <pre>类名: TurkeyTestDrive</pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/31 10:34</pre>
 * <pre>作者: xueshun</pre>
 */
public class TurkeyTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for (int i = 0; i < 10; i++) {
            System.out.println("The DuckAdapter says ...");
            duckAdapter.gogle();
            duckAdapter.fly();
        }
    }
}
