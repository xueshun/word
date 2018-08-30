package cn.study.design.decorator.starbuzz;

/**
 * <pre>类名: Milk</pre>
 * <pre>描述: 牛奶 - 配料</pre>
 * <pre>日期: 2018/8/28 16:30</pre>
 * <pre>作者: xueshun</pre>
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", 牛奶";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
