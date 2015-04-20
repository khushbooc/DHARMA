package model.states;

import controller.DharmaKeyListener;
import model.Game;
import model.GameLogger;
import model.ability.GameAbility;
import model.ability.RectangularMovementAbility;
import model.direction.RectangularDirection;
import model.entity.Cursor;


/**
 * Created by agemery on 4/18/15.
 */
public class MainMenuState extends GameState {

    private Cursor cursor;

    public MainMenuState(Game game) {
        super(game);
        this.cursor = new Cursor(); //cursor for selecting the menu options
        //default key set
        GameLogger.getInstance().logMessage("created cursor");
        for (RectangularDirection dir : RectangularDirection.values()) {
            game.getController().addKeyListenerToSet(RectangularDirectionKeyListenerFactory(cursor, dir));
        }
        RectangularMovementAbility direct = new RectangularMovementAbility(cursor, RectangularDirection.NORTH);
        game.getController().addKeyListenerToSet(new DharmaKeyListener(direct, 'a'));

        this.game.addControllerToCurrentView();
    }

    public void update() {
        //draw the view

    }

    //Parameterized Factory Method
    private DharmaKeyListener RectangularDirectionKeyListenerFactory(Cursor owner, RectangularDirection direction) {
        GameAbility rectMove = new RectangularMovementAbility(owner, direction);
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
