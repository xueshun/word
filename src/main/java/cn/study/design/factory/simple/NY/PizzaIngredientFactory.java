package cn.study.design.factory.simple.NY;

/**
 * <pre>类名: PizzaIngredientFactory</pre>
 * <pre>描述: pizza成分工厂</pre>
 * <pre>日期: 2018/8/29 15:06</pre>
 * <pre>作者: xueshun</pre>
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
