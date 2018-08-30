package cn.study.design.decorator.startbuzzWithSize;

/**
 * <pre>类名: Mocha</pre>
 * <pre>描述: 摩卡咖啡</pre>
 * <pre>日期: 2018/8/28 16:23</pre>
 * <pre>作者: xueshun</pre>
 *
 * 摩卡是一个装饰者，所以让它扩展子CondimentDecorator
 *
 */
public class Mocha extends CondimentDecorator {

    /**
     * 要让Mocha能够引用一个Beverage，做法如下：
     *  1. 用一个实例变量来记录饮料，也就是被装饰者。
     *  2. 想办法让被装饰者（饮料）被记录到实例变量中。
     *      这里的做法是：把饮料当作构造器参数，再由构造器将此饮料记录到实例变量中。
     */
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
