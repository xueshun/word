package cn.study.design.template.first;

/**
 * <pre>类名: CaffeineBeverageWithHook</pre>
 * <pre>描述: 钩子是一种被声明在抽象类中的方法，但只有空的或者默认的实现
 *           钩子的存在可以让子类有能力对算法的不同点进行挂钩。要不要挂钩，由子类决定</pre>
 * <pre>日期: 2018/9/3 10:40</pre>
 * <pre>作者: xueshun</pre>
 */
public abstract class CaffeineBeverageWithHook {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
