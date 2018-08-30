package cn.study.design.factory.simple;

/**
 * <pre>类名: PizzaStore</pre>
 * <pre>描述: 披萨点</pre>
 * <pre>日期: 2018/8/29 14:48</pre>
 * <pre>作者: xueshun</pre>
 */
public abstract class PizzaStore {

    /**
     * 制作pizza
     * @param item
     * @return
     */
    protected abstract Pizza createPizza(String item);

    /**
     * 点pizza
     * @param type pizza类型
     * @return
     */
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        System.out.println("------------making a " + pizza.getName() + "------------");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
