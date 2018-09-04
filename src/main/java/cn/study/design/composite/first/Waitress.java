package cn.study.design.composite.first;

/**
 * <pre>类名: Waitress</pre>
 * <pre>描述: 女服务员</pre>
 * <pre>日期: 2018/9/4 10:10</pre>
 * <pre>作者: xueshun</pre>
 */
public class Waitress {

    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
