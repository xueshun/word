package cn.study.design.decorator.startbuzzWithSize;

/**
 * <pre>类名: Soy</pre>
 * <pre>描述: 豆浆</pre>
 * <pre>日期: 2018/8/28 16:32</pre>
 * <pre>作者: xueshun</pre>
 */
public class Soy extends CondimentDecorator{

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
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL){
            cost += .10;
        }else if(beverage.getSize() == Size.GRANDE){
            cost += .15;
        }else if(beverage.getSize() == Size.VENTI){
            cost += 0.20;
        }

        return cost;
    }
}
