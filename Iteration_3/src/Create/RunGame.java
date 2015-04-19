package create;

import controller.Controller;
import model.Game;
import view.View;

public class RunGame {
    public static void main(String[] args){
        RunGame run_game = new RunGame();
        run_game.run();
    }

    private Controller controller;
    private Game game; //The 'Model'
    // private View viewClass; //is this the right one?

    protected RunGame() {
        this.controller = new Controller();
        this.game = new Game();
        // this.view = new View();
    }

    protected void run() {
        boolean isRunnning = true;

        while(isRunnning) {
            //do game stuff
        }
    }
}
