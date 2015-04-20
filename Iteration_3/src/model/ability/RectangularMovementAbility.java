package model.ability;

import model.direction.RectangularDirection;

/**
 * Created by agemery on 4/18/15.
 */


//used for menus, inventory, stuff like that. For in game stuff, use HexagonalMovementAbility
public class RectangularMovementAbility extends GameAbility{

    private RectangularDirection direction;
    //TODO: a cursor for highlighting a selected item
    //private Cursor cursor;

    public RectangularMovementAbility(RectangularDirection direction) {
        this.direction = direction;
    }

    @Override
    public void use(){}
}
