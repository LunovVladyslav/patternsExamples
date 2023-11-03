package org.patterns.behavioral.command;

public class NextChannelCommand implements Command{
    private TV tv;

    public NextChannelCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.nextChannel();
    }
}
