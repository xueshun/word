package cn.study.design.template.first;

/**
 * <pre>类名: CaffeineBeverage</pre>
 * <pre>描述: 咖啡因饮料模板</pre>
 * <pre>日期: 2018/9/3 10:30</pre>
 * <pre>作者: xueshun</pre>
 */
public abstract class CaffeineBeverage {

    /**
     * 准备步骤
     */
    final void prepareRecipe() {
        //[1] 烧开水
        boilWater();
        //[2] 泡
        brew();
        //[3] 倒入杯子
        pourInCup();
        //[4] 添加调味品
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
