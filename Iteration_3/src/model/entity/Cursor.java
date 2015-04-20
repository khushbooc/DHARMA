package model.entity;

import model.Game;
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
    private boolean isSelected;

    public Cursor() {
        this.location = new Location(0, 0);
        this.isSelected = false;
    }

    @Override
    public void draw(Graphics2D g) {
        //do nothing
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected() {
        this.isSelected = true;
    }

    public void setUnselected() {
        this.isSelected = false;
    }

}
