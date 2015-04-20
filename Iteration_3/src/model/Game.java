package model;

import controller.Controller;
import model.entity.Avatar;
import model.occupation.Occupation;
import model.occupation.Smasher;
import model.occupation.Sneak;
import model.occupation.Summoner;
import view.View;
import model.states.*;

public class Game {

    GameState game_state;
    Controller controller;
    View view;

	public Game(Controller controller) {
        this.controller = controller;
        this.view = view;
        setNewGameState();

		//avatar = new Avatar(new Summoner());
		//Map<String, GameMap> maps = world.getMaps();
		//Set<String> mapNames = maps.keySet();
	}

    public Controller getController() {
        return this.controller;
    }

    /*public View getView() {
        return this.view;
    }*/

    private void setNewGameState() {
        this.game_state = new MainMenuState(this);
    }

    public void newSmasherGame() {
        newPlayingState(Occupation.smasherFactory());
    }

    public void newSneakGame() {
        newPlayingState(Occupation.sneakFactory());
    }

    public void newSummonerGame() {
        newPlayingState(Occupation.summonerFactory());
    }

    private void newPlayingState(Occupation occupation) {
        this.game_state = new PlayingState(this, new Avatar(occupation));
    }

    public void resumePlayingState() {
        //TODO
    }

    public void setPausedState() {
        //TODO
    }

    public boolean isRunning() {  //method for checking if the game is running
        return game_state.isRunning();
    }

    public void update() {
        this.game_state.update();
    }
}

