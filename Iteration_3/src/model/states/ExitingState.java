package model.states;

import model.Game;

/**
 * Created by agemery on 4/19/15.
 */
public class ExitingState extends GameState{

    public ExitingState(Game game) {
        super(game);
        this.isRunning = false;
    }
}
