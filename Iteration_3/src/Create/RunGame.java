package Create;

import javax.swing.*;

import Controller.ViewController;

public class RunGame {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //new GameMap();
            	new ViewController();
            }
        });
//        Summoner summoner = new Summoner();
//        SpriteSheetUtility image = summoner.getSpritz
    }

}
