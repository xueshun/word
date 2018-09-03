package cn.study.design.template.first;

/**
 * <pre>类名: Tea</pre>
 * <pre>描述: 咖啡</pre>
 * <pre>日期: 2018/9/3 10:39</pre>
 * <pre>作者: xueshun</pre>
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
