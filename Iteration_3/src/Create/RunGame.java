package Create;

import javax.swing.*;
import java.awt.Graphics;

import javax.swing.SwingUtilities;
import utilities.SpriteSheetUtility ;
import model.gameMap.GameMap;
import model.occupation.Summoner;


import Controller.GameController;

public class RunGame {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GameMap();
            	new GameController();
            }
        });
//        Summoner summoner = new Summoner();
//        SpriteSheetUtility image = summoner.getSpritz
    }

}
