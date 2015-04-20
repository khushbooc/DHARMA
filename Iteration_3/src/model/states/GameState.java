package model.states;

import model.Game;

/**
 * Created by agemery on 4/18/15.
 */

//these are for model to know what state it is in - playing, paused, whatever
public class GameState {
    protected Game game;
    protected boolean isRunning;

    public GameState(Game game) {
        this.game = game;
        this.isRunning = true;
    }

    public boolean isRunning() {
        return this.isRunning;
    }
}
