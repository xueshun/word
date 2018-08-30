package cn.study.design.decorator.startbuzzWithSize;

/**
 * <pre>类名: </pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/28 16:17</pre>
 * <pre>作者: xueshun</pre>
 */
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;
    @Override
    public abstract String getDescription();

    @Override
    public Size getSize(){
        return beverage.getSize();
    }
}
