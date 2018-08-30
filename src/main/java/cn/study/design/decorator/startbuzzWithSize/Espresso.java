package cn.study.design.decorator.startbuzzWithSize;

/**
 * <pre>类名: Espresso</pre>
 * <pre>描述: 浓缩咖啡 - 饮料</pre>
 * <pre>日期: 2018/8/28 16:19</pre>
 * <pre>作者: xueshun</pre>
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "浓缩咖啡";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
