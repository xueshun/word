package cn.copy;

import java.util.List;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/22 13:56</pre>
 * <pre>作者: xueshun</pre>
 */
public class ClassName {

    private int claMath;
    private String claName;
    private List<Student> stuList;

    public int getClaMath() {
        return claMath;
    }

    public void setClaMath(int claMath) {
        this.claMath = claMath;
    }

    public String getClaName() {
        return claName;
    }

    public void setClaName(String claName) {
        this.claName = claName;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    @Override
    public String toString() {
        return "ClassName{" +
                "claMath=" + claMath +
                ", claName='" + claName + '\'' +
                ", stuList=" + stuList +
                '}';
    }
}
