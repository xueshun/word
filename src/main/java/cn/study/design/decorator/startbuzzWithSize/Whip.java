package cn.study.design.decorator.startbuzzWithSize;

/**
 * <pre>类名: Whip</pre>
 * <pre>描述: 奶昔 - 配料</pre>
 * <pre>日期: 2018/8/28 16:37</pre>
 * <pre>作者: xueshun</pre>
 */
public class Whip extends CondimentDecorator{

    Beverage beverage;


    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",奶昔";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
