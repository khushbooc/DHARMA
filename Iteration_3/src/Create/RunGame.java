package create;

import javax.swing.SwingUtilities;

import controller.ViewController;

public class RunGame {
    public static void main(String[] args){
    	
    	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //new GameMap();
            	new ViewController();
            }
        });
    	
    
    }

    protected RunGame() {
       new ViewController();
    }

}
