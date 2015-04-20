package create;

import controller.Controller;
import model.Game;
import model.GameLogger;
import view.View;

public class RunGame {
    public static void main(String[] args){
        RunGame run_game = new RunGame();
        run_game.run();
    }

    private Controller controller; //The Controller
    private Game game; //The 'Model'
    private View view; //is this the right one?

    private GameLogger game_logger;

    private RunGame() {
        //TODO: make Game(Controller, View)
        this.controller = new Controller();
        this.view = new View();
        this.game = new Game(controller, view);

        this.game_logger = GameLogger.getInstance();
    }

    protected void run() {

        game_logger.logMessage("printing 4 debug lol");
        while(game.isRunning()) {
            game.update();
            if(!game_logger.isEmpty())
                System.out.println(game_logger.getMessage());
        }

        game.kill();
    }


}
