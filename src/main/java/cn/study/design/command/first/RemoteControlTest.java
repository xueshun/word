package cn.study.design.command.first;

/**
 * <pre>类名: RemoteControlTest</pre>
 * <pre>描述: 测试类</pre>
 * <pre>日期: 2018/8/30 14:43</pre>
 * <pre>作者: xueshun</pre>
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor("1");

        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();

        remoteControl.setCommand(garageDoorOpenCommand);
        remoteControl.buttonWasPressed();

    }
}
