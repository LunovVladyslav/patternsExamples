package org.patterns.behavioral.command;

public class DownVolumeCommand implements Command{
    private TV tv;

    public DownVolumeCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.downVolume();
    }
}
