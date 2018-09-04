package cn.study.design.composite.first;

/**
 * <pre>类名: MenuComponent</pre>
 * <pre>描述: 菜单组件</pre>
 * <pre>日期: 2018/9/4 10:04</pre>
 * <pre>作者: xueshun</pre>
 */
public abstract class MenuComponent {

    /**
     * 添加
     *
     * @param menuComponent
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 删除
     *
     * @param menuComponent
     */
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取子节点
     *
     * @param i
     * @return
     */
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取名称
     *
     * @return
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取备注
     *
     * @return
     */
    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    /**
     * 获取价格
     *
     * @return
     */
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    /**
     * 是否素食
     *
     * @return
     */
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    /**
     * 打印菜单
     */
    public void print() {
        throw new UnsupportedOperationException();
    }
}
