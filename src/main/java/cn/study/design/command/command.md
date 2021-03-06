### 命令模式

![](../images/命令模式.jpg)
![](../images/命令模式组成.png)

命令模式：将“请求”封装成对象，以便使用不同的请求、队列或者日志参数化其他对象。命令模式也支持可撤销的操作。

一个命令对象通过特定接收者上绑定一组动作来封装请求。
要到达这一点，命令对象将动作和接收者包进对象中。这个对象只暴露出一个execute()方法，当执行此方法被调用的时候，接收者就会
进行这些动作。

### OO

1.基础
抽象，封装，多态，继承

2.原则

- 封装变化
- 多用组合，少用继承
- 针对接口编程，不针对实现编程
- 为交互对象之间的松耦合设计而努力
- 类应该对扩展开饭，对修改关闭
- 依赖抽象，不要依赖具体类

3.模式

命令模式-将请求封装成对象，这可以让你使用不同的请求、队列，或者日志请求来参数化其他对象。
命令模式也可以支持撤销操作。

4.要点

- 命令模式将发出请求的对象和执行请求的对象解耦
- 在被解耦的两者之间是通过命令对象进行沟通的。命令对象封装了接收者和一个或一组动作
- 调用者通过调用命令对象的execute()发出请求，这会使得接收者的动作被调用
- 调用者可以接受命令当作参数，甚至在运行时动态运行。
- 命令可以支持撤销，做法实现一个undo()方法来回到execute()被执行前的状态
- 宏命令是命令的一种简单的延申，允许调用多个命令。宏方法也可以支持撤销
- 实际操作时，很常见使用“聪明”命令对象，也就是实现了请求，而不是将工作委托给接收者
- 命令模式也可以用来实现日志和事务系统