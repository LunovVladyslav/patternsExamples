package org.patterns.behavioral.momento;

public class GameLevel {
    private int score;
    private int levelNumber;
    private String location;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public GameLevelCheckpoint save() {
        System.out.println("- Checkpoint saved -");
        return new GameLevelCheckpoint(score, levelNumber, location);
    }

    public void load(GameLevelCheckpoint checkpoint) {
        System.out.println("- Loading last checkpoint -\n");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }

        score = checkpoint.getScore();
        levelNumber = checkpoint.getLevelNumber();
        location = checkpoint.getLocation();
    }


    public void play() {

        System.out.printf("""
                Level %d:
                Player score - %d.
                Location - %s
                %n""", levelNumber, score, location);
    }
}
