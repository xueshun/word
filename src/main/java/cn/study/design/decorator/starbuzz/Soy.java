package cn.study.design.decorator.starbuzz;

/**
 * <pre>类名: Soy</pre>
 * <pre>描述: 豆浆</pre>
 * <pre>日期: 2018/8/28 16:32</pre>
 * <pre>作者: xueshun</pre>
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",豆浆";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
