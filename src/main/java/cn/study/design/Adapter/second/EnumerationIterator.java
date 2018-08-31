package cn.study.design.Adapter.second;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * <pre>类名: EnumerationIterator</pre>
 * <pre>描述: Iterator 适配器</pre>
 * <pre>日期: 2018/8/31 13:59</pre>
 * <pre>作者: xueshun</pre>
 */

/**
 * 因为将枚举适配成迭代器，适配器需要实现迭代接口
 * 适配器必须看起来就像是一个迭代器
 */
public class EnumerationIterator implements Iterator {

    /**
     * 利用组合的方式，将枚举结合进入适配中，所以用一个实例变量记录枚举
     */
    Enumeration<?> enumeration;

    public EnumerationIterator(Enumeration<?> enumeration) {
        this.enumeration = enumeration;
    }

    /**
     * 迭代器的hasNext()方法其实是委托给枚举的hasMoreElements()方法
     *
     * @return
     */
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    /**
     * 不支持迭代器的remove()方法，所以必须放弃。抛出一个异常
     */
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
