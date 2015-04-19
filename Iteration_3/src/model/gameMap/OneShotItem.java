package model.gameMap;

import model.entity.Entity;

/**
 * Created by giangnguyen on 4/16/15.
 */
public class OneShotItem extends Item {
    public OneShotItem( Location location, String name){
        super(location, name);
    }

    @Override
    public void onTouch(Entity e){
        e.getOccupation().getStats().modCurrentHealth(-10);
        e.getOccupation().getStats().modStrength(-4);
        e.getOccupation().getStats().modHardiness(-4);
        e.getOccupation().getStats().modIntellect(-4);
        e.getOccupation().getStats().modAgility(-4);
    }
    @Override
    public boolean isCollidable(){
        return true;
    }
}
