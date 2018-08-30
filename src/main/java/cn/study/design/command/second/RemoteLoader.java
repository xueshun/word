package cn.study.design.command.second;

import cn.study.design.command.first.GarageDoor;
import cn.study.design.command.second.CeilingFan.CeilingFan;
import cn.study.design.command.second.CeilingFan.CeilingFanOffCommand;
import cn.study.design.command.second.CeilingFan.CeilingFanOnCommand;
import cn.study.design.command.second.GarageDoor.GarageDoorDownCommand;
import cn.study.design.command.second.GarageDoor.GarageDoorUpCommand;
import cn.study.design.command.second.Light.Light;
import cn.study.design.command.second.Light.LightOffCommand;
import cn.study.design.command.second.Light.LightOnCommand;
import cn.study.design.command.second.Stereo.Stereo;
import cn.study.design.command.second.Stereo.StereoOffCommand;
import cn.study.design.command.second.Stereo.StereoOnWithCDCommand;

/**
 * <pre>类名: RemoteLoader</pre>
 * <pre>描述: </pre>
 * <pre>日期: 2018/8/30 22:22</pre>
 * <pre>作者: xueshun</pre>
 */
public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn =
                new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff =
                new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp =
                new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown =
                new GarageDoorDownCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff =
                new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
