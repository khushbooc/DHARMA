package model.states;

import model.Game;
import model.entity.Avatar;
import model.entity.Entity;

import java.util.ArrayList;

/**
 * Created by agemery on 4/18/15.
 */

public class PlayingState extends GameState {

    private Avatar avatar;
    private ArrayList<Entity> entities;

    public PlayingState(Game game) {
        super(game);
    }
}
