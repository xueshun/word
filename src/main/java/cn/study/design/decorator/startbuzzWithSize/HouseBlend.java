package cn.study.design.decorator.startbuzzWithSize;

/**
 * <pre>类名: HouseBlend</pre>
 * <pre>描述: 混合咖啡 - 饮料</pre>
 * <pre>日期: 2018/8/28 16:21</pre>
 * <pre>作者: xueshun</pre>
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "混合咖啡";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
