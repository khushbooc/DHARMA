package model.states;

import controller.DharmaKeyListener;
import model.Game;
import model.ability.GameAbility;
import model.ability.RectangularMovementAbility;
import model.direction.RectangularDirection;


/**
 * Created by agemery on 4/18/15.
 */
public class MainMenuState extends GameState {

    public MainMenuState(Game game) {
        super(game);
        //default key set
        for (RectangularDirection dir : RectangularDirection.values()) {
            game.getController().addKeyListenerToSet(RectangularDirectionKeyListenerFactory(dir));
        }

    }

    public void update() {
        //draw the view

    }

    //Parameterized Factory Method
    private DharmaKeyListener RectangularDirectionKeyListenerFactory(RectangularDirection direction) {
        GameAbility rectMove = new RectangularMovementAbility(direction);
        int javaKeyCode;

        if(direction.getRelativeDirectionEquivalent().equals("UP"))
            javaKeyCode = DharmaKeyListener.getJavaKeyCodeForKeyBoardUp();
        else if (direction.getRelativeDirectionEquivalent().equals("DOWN"))
            javaKeyCode = DharmaKeyListener.getJavaKeyCodeForKeyBoardDown();
        else if (direction.getRelativeDirectionEquivalent().equals("LEFT"))
            javaKeyCode = DharmaKeyListener.getJavaKeyCodeForKeyBoardLeft();
        else
            javaKeyCode = DharmaKeyListener.getJavaKeyCodeForKeyBoardRight();

        return (new DharmaKeyListener(rectMove,javaKeyCode));
    }
}
