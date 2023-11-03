package org.patterns.behavioral.command;

public class UpVolumeCommand implements Command{
    private TV tv;

    public UpVolumeCommand(TV tv) {
        this.tv = tv;
    }
    @Override
    public void execute() {
        tv.upVolume();
    }
}
