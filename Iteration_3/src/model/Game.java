package model;

import controller.Controller;
import model.entity.Avatar;
import model.occupation.Occupation;
import view.View;
import model.states.*;

public class Game {

    GameState game_state;
    Controller controller;
    View view;

    GameLogger game_logger;

	public Game(Controller controller, View view) {
        this.controller = controller;
        this.view = view;
        this.view.setGameParent(this);
        setNewGameState();

        this.game_logger = GameLogger.getInstance();
	}

    public Controller getController() {
        return this.controller;
    }

    public View getView() {
        return this.view;
    }

    public void addControllerToCurrentView() {
        this.view.addKeyListenersToCurrentView(this.controller);
    }

    private void setNewGameState() {
        this.game_state = new MainMenuState(this);
        view.render();
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

    public void updateView() {
        this.view.updateView();
    }

    public void onSelection() {
        this.view.onSelection();
    }

    public void exitGame() {
        setExitingState();
    }

    private void setExitingState() {
        this.game_state = new ExitingState(this);
    }

    public void kill() {
        this.view.killWindow();
    }
}

