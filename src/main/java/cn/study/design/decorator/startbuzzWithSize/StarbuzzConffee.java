package cn.study.design.decorator.startbuzzWithSize;

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

        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.Size.TALL);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + "$" + String.format("%.2f",beverage2.cost()));
    }
}
