package org.patterns.behavioral.momento;

public class GameLevelCheckpoint {
    private int score;
    private int levelNumber;
    private String location;

    public GameLevelCheckpoint(int score, int levelNumber, String location) {
        this.score = score;
        this.levelNumber = levelNumber;
        this.location = location;
    }

    public int getScore() {
        return score;
    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public String getLocation() {
        return location;
    }
}
