package cn.study.design.Adapter.second;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

/**
 * <pre>类名: EnumerationIteratorTestDrive</pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/31 17:30</pre>
 * <pre>作者: xueshun</pre>
 */
public class EnumerationIteratorTestDrive {

    public static void main(String[] args) {
        String[] test = {"1", "2", "3"};
        Vector<String> v = new Vector<String>(Arrays.asList(test));
        Iterator<?> iterator = new EnumerationIterator(v.elements());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
