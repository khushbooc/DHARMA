package Controller;

import javax.swing.*;
import java.awt.Graphics;

import utilities.SpriteSheetUtility;
import model.gameMap.GameMap;
import model.occupation.Summoner;

public class RunGame {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GameMap();
            }
        });
//        Summoner summoner = new Summoner();
//        SpriteSheetUtility image = summoner.getSpritz
    }

}
