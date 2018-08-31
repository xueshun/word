package cn.study.design.command.party;

import cn.study.design.command.first.Command;
import cn.study.design.command.second.Hottub.Hottub;
import cn.study.design.command.second.Hottub.HottubOffCommand;
import cn.study.design.command.second.Hottub.HottubOnCommand;
import cn.study.design.command.second.Light.Light;
import cn.study.design.command.second.Light.LightOffCommand;
import cn.study.design.command.second.Light.LightOnCommand;
import cn.study.design.command.second.RemoteControl;
import cn.study.design.command.second.Stereo.Stereo;
import cn.study.design.command.second.Stereo.StereoOffCommand;
import cn.study.design.command.second.TV.TV;

/**
 * <pre>类名: RemoteLoader </pre>
 * <pre>描述: party模式测试</pre>
 * <pre>日期: 2018/8/31 9:51</pre>
 * <pre>作者: xueshun</pre>
 */
public class RemoteLoader {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}
