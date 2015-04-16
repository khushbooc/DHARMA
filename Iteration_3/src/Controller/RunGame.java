package Controller;

import javax.swing.*;
import model.gameMap.GameMap;

public class RunGame {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GameMap();
            }
        });
    }

}
