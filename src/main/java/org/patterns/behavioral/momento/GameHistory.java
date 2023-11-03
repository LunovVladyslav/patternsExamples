package org.patterns.behavioral.momento;

import java.util.LinkedList;
import java.util.List;

public class GameHistory {
    private List<GameLevelCheckpoint> checkpointList = new LinkedList<>();

    public void add(GameLevelCheckpoint checkpoint) {
        checkpointList.add(checkpoint);
    }

    public GameLevelCheckpoint get(int index) {
        return checkpointList.get(index);
    }
}
