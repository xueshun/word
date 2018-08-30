package cn.study.design.decorator.starbuzz;

/**
 * <pre>类名: DarkRoast</pre>
 * <pre>描述: 烘培咖啡 - 饮料</pre>
 * <pre>日期: 2018/8/28 16:35</pre>
 * <pre>作者: xueshun</pre>
 */
public class DarkRoast extends Beverage {


    public DarkRoast() {
        description = "烘培咖啡";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
