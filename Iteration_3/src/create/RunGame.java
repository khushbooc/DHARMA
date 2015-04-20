package create;

import controller.Controller;
import model.Game;
import view.View;

public class RunGame {
    public static void main(String[] args){
        RunGame run_game = new RunGame();
        run_game.run();
    }

    private Controller controller; //The Controller
    private Game game; //The 'Model'
    // private View viewClass; //is this the right one?

    private RunGame() {
        //TODO: make Game(Controller, View)
        this.controller = new Controller();
        this.game = new Game(controller);

        // this.view = new View();
    }

    protected void run() {
        while(game.isRunning()) {
            game.update();
        }
    }
}
