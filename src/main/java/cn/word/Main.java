package cn.word;

import java.lang.reflect.Field;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/21 17:12</pre>
 * <pre>作者: xueshun</pre>
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1111);
        fieldIsNull(student);
    }

    private static void fieldIsNull(Student student){
        for (Field f: student.getClass().getDeclaredFields()){
            f.setAccessible(true);
            System.out.println(f.getName()+"???????????????");
            try {
                if(f.get(student) != null){
                    System.out.println(f.get(student));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
