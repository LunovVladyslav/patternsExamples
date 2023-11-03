package org.patterns.behavioral.command;

public class CommandExample {
    public static void main(String[] args) {
        TV tv = new TV();

        Command turnOn = new TurnOnCommand(tv);
        Command turnOff = new TurnOffCommand(tv);
        Command upVolume = new UpVolumeCommand(tv);
        Command downVolume = new DownVolumeCommand(tv);
        Command nextChannel = new NextChannelCommand(tv);
        Command prevChannel = new PrevChannelCommand(tv);

        RemoteControl control = new RemoteControl(
                turnOn, turnOff, upVolume, downVolume, nextChannel, prevChannel
        );

        control.turnOn();
        control.nextChannel();
        control.prevChannel();
        control.prevChannel();
        control.prevChannel();
        control.downVolume();
        control.downVolume();
        control.downVolume();
        control.upVolume();
        control.turnOff();

    }
}
