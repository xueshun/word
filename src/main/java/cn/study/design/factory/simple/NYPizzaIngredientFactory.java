package cn.study.design.factory.simple;


import cn.study.design.factory.simple.NY.*;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/29 15:08</pre>
 * <pre>作者: xueshun</pre>
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return null;
    }

    public Sauce createSauce() {
        return null;
    }

    public Cheese createCheese() {
        return null;
    }

    public Veggies[] createVeggies() {
        return new Veggies[0];
    }

    public Pepperoni createPepperoni() {
        return null;
    }

    public Clams createClam() {
        return null;
    }
}
