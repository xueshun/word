package cn.study.design.decorator.starbuzz;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/28 16:34</pre>
 * <pre>作者: xueshun</pre>
 */
public class StarbuzzConffee {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + "$"+ beverage.cost());

        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + "$" + beverage1.cost());
    }
}
