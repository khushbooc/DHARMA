package create;

import javax.swing.SwingUtilities;

import controller.ViewController;
import model.Game;
import view.View;

public class RunGame {
    public static void main(String[] args){
    	
    	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //new GameMap();
            	new ViewController();
            }
        });
    	
    	
    	
       // RunGame run_game = new RunGame();
        //run_game.run();
    }

    //private Controller controller;
    private ViewController controller;
    private Game game; //The 'Model'
    // private View viewClass; //is this the right one?

    protected RunGame() {
        this.controller = new ViewController();
      //  this.game = new Game();
        // this.view = new View();
    }

    protected void run() {
        boolean isRunnning = true;

        while(isRunnning) {
        	
            //do game stuff
        }
    }
}
