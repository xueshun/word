package cn.study.design.iterator.first;


import java.util.Iterator;

/**
 * <pre>类名: DinerMenuIterator</pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/9/3 14:53</pre>
 * <pre>作者: xueshun</pre>
 */
public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }

    public void remove() {

    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

}
