package org.patterns.behavioral.command;

public class PrevChannelCommand implements Command{
    private TV tv;

    public PrevChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.previousChannel();
    }
}
