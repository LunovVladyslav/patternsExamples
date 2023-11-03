package org.patterns.behavioral.command;

public class TV {
    private int volumeLvl = 20;
    private int channelNumber = 1;
    public void turnOn() {
        System.out.println("TV is on");
        System.out.println("Playing channel - %d".formatted(channelNumber));
        System.out.println("Volume level - %d".formatted(volumeLvl));
    };

    public void turnOff() {
        System.out.println("TV is off");
    }

    public void upVolume() {
        volumeLvl = Math.min(volumeLvl + 1, 100);
        System.out.println("TV volume is up - %d".formatted(volumeLvl));
    }

    public void downVolume() {
        volumeLvl = Math.max(volumeLvl - 1, 0);
        System.out.println("TV volume is down - %d".formatted(volumeLvl));

    }

    public void nextChannel() {
        channelNumber = channelNumber + 1 > 10 ? 1 : channelNumber + 1;
        System.out.println("Playing channel - %d".formatted(channelNumber));
    }

    public void previousChannel() {
        channelNumber = channelNumber - 1 <= 0 ? 10 : channelNumber - 1;
        System.out.println("Playing channel - %d".formatted(channelNumber));
    }

}
