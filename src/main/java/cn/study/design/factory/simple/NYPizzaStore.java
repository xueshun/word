package cn.study.design.factory.simple;

import cn.study.design.factory.simple.NY.PizzaIngredientFactory;
import cn.study.design.factory.simple.pizza.CheesePizza;

/**
 * <pre>类名: NYPizzaStore</pre>
 * <pre>描述: 纽约风味披萨带你</pre>
 * <pre>日期: 2018/8/29 15:04</pre>
 * <pre>作者: xueshun</pre>
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {

            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");

        } else if (item.equals("veggie")) {

            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");

        } else if (item.equals("clam")) {

            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");

        } else if (item.equals("pepperoni")) {

            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");

        }
        return pizza;
    }
}
