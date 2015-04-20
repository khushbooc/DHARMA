package model.ability;

import model.GameLogger;
import model.direction.RectangularDirection;
import model.entity.Cursor;

/**
 * Created by agemery on 4/18/15.
 */


//used for menus, inventory, stuff like that. For in game stuff, use HexagonalMovementAbility
public class RectangularMovementAbility extends GameAbility{

    private RectangularDirection direction;
    //TODO: a cursor for highlighting a selected item

    public RectangularMovementAbility(Cursor owner, RectangularDirection direction) {
        super(owner);
        this.direction = direction;
    }

    @Override
    public void use() {
        //execute movement
        int current_x = owner.getLocation().getX();
        int current_y = owner.getLocation().getY();
        owner.setLocation((current_x+direction.getDx()), (current_y+direction.getDy()));
        GameLogger.getInstance().logMessage(direction.getRelativeDirectionEquivalent() + " was pressed!!!");
    }
}
