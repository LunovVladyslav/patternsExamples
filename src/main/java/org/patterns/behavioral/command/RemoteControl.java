package org.patterns.behavioral.command;

public class RemoteControl {
    private Command turnOn;
    private Command turnOff;
    private Command upVolume;
    private Command downVolume;
    private Command nextChannel;
    private Command prevChannel;

    public RemoteControl(
            Command turnOn, Command turnOff,
            Command upVolume, Command downVolume,
            Command nextChannel, Command prevChannel)
    {
        this.turnOn = turnOn;
        this.turnOff = turnOff;
        this.upVolume = upVolume;
        this.downVolume = downVolume;
        this.nextChannel = nextChannel;
        this.prevChannel = prevChannel;
    }
    public void turnOn() {
        turnOn.execute();
    }
    public void turnOff() {
        turnOff.execute();
    }
    public void upVolume() {
        upVolume.execute();
    }
    public void downVolume() {
        downVolume.execute();
    }
    public void nextChannel() {
        nextChannel.execute();
    }

    public void prevChannel() {
        prevChannel.execute();
    }
}
