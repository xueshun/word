package cn.study.design.singleton.demo;

/**
 * <pre>类名: ChocolateBoiler</pre>
 * <pre>描述: 巧克力熔炉</pre>
 * <pre>日期: 2018/8/30 11:01</pre>
 * <pre>作者: xueshun</pre>
 */
public class ChocolateBoiler {
    /**
     * 是否为空
     */
    private boolean empty;
    /**
     * 是否融化
     */
    private boolean boiled;

    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = true;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    /**
     * 添加原料
     */
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    /**
     * 清理原料
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            // bring the contents to a boil
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }

}
