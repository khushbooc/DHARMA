package model.entity;

import model.ability.GameAbility;
import model.gameMap.Location;
import model.gameMap.MapObject;

import java.awt.*;
import java.util.ArrayList;

/**
 * Created by agemery on 4/20/15.
 */

//this is a 'proto-entity'
//it will be used in cases such as menus, where KeyListeners must still alert abilities - and this class
//will forward the alert to the game, which then forwards it to the view
public class Cursor extends MapObject {

    public Cursor() {
        this.location = new Location(0, 0);
    }

    @Override
    public void draw(Graphics2D g) {
        //do nothing
    }

}
