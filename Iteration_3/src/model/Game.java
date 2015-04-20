package model;

import controller.Controller;
import model.states.*;

public class Game {

    GameState game_state;
    Controller controller;
    //View view;

	public Game(Controller controller) {
        this.controller = controller;
        //TODO: this.view = view;
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

    public void setNewGameState() {
        this.game_state = new NewGameState(this);
    }

    public void setPlayingState() {
        //TODO
    }

    public void setPausedState() {
        //TODO
    }

    public boolean isRunning() {  //method for checking if the game is running
        return game_state.isRunning();
    }

    public void update() {
        //do game stuff
    }
	
	/*public Game(Avatar avatar) {
		this.avatar = avatar;
	}
	
	public Game(Occupation occupation, String name) {
		//avatar = new Avatar(occupation);
		//build the Avatar equipment
		//avatar.setName(name);
	}
	public Avatar getAvatar() {
		return avatar;
	}

	public void setAvatar(Avatar avatar) {
		this.avatar = avatar;
	}*/
	
}

