package model.gameMap;

import model.entity.Entity;

/**
 * Created by giangnguyen on 4/16/15.
 */
public abstract class InteractiveItem extends Item {
    public InteractiveItem(Location location, String name){
        super(location, name);
    }

    @Override
    public boolean isCollidable(){
        return true;
    }

    @Override
    public abstract void onTouch(Entity e);
}
