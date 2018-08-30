package cn.copy;

import net.sf.cglib.beans.BeanCopier;

import java.util.ArrayList;
import java.util.Date;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/22 13:58</pre>
 * <pre>作者: xueshun</pre>
 */
public class Main {
    public static void main(String[] args) {
       BeanCopier copier = BeanCopier.create(ClassName.class,ClassName.class,false);

       Student stu1 = new Student(1,"张三",new Date());
       Student stu2 = new Student(2,"李四",new Date());
       ArrayList<Student> stuList = new ArrayList<Student>();
       stuList.add(stu1);
       stuList.add(stu2);
       ClassName claName = new ClassName();
       claName.setClaMath(1);
       claName.setStuList(stuList);

       ClassName className2 = new ClassName();
       copier.copy(claName,className2,null);

        System.out.println(className2);

    }
}
