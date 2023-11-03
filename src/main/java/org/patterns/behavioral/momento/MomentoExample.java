package org.patterns.behavioral.momento;

public class MomentoExample {
    public static void main(String[] args) {
        GameHistory history = new GameHistory();
        GameLevel level = new GameLevel();

        level.setLevelNumber(1);
        level.setScore(100);
        level.setLocation("Castle, Location 1");
        level.play();

        history.add(level.save());

        level.setLevelNumber(2);
        level.setScore(150);
        level.setLocation("Castle, Location 2");
        level.play();

        System.out.println("** Something went wrong **");

        level.load(history.get(0));
        level.play();



    }
}
