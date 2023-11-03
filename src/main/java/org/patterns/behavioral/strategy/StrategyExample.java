package org.patterns.behavioral.strategy;

public class StrategyExample {
    public static void main(String[] args) {
        Browser chrome = new Chrome();
        User user = new User(chrome);
        user.useBrowser();

        user.setBrowser(new Opera());
        user.useBrowser();

        user.setBrowser(new Safari());
        user.useBrowser();
    }
}
