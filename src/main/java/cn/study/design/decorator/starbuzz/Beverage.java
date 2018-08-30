package cn.study.design.decorator.starbuzz;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/28 16:15</pre>
 * <pre>作者: xueshun</pre>
 */
public abstract class Beverage {

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
