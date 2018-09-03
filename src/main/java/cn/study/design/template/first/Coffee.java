package cn.study.design.template.first;

/**
 * <pre>类名: Coffee</pre>
 * <pre>描述: 咖啡饮料</pre>
 * <pre>日期: 2018/9/3 10:37</pre>
 * <pre>作者: xueshun</pre>
 */
public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}
