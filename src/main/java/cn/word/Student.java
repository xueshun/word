package cn.word;

import java.io.Serializable;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/21 17:12</pre>
 * <pre>作者: xueshun</pre>
 */
public class Student implements Serializable {

    private int id;

    private String name;

    private boolean sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
