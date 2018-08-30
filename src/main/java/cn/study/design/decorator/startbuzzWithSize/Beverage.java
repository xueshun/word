package cn.study.design.decorator.startbuzzWithSize;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/28 16:15</pre>
 * <pre>作者: xueshun</pre>
 */
public abstract class Beverage {


    public enum Size{TALL,GRANDE,VENTI};

    Size size = Size.TALL;

    String description = "Unknown Beverage";

    public String getDescription(){
        return description;
    }

    /**
     * 获取size
     *
     * @return size
     */
    public Size getSize() {
        return size;
    }

    /**
     * 设置size
     *
     * @param size size
     */
    public void setSize(Size size) {
        this.size = size;
    }

    public abstract double cost();
}
