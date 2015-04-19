package model.inventory;

import model.entity.Entity;
import model.gameMap.Location;


public class Chest extends EquipableItem
{
	public Chest(Location location, String name){
        super(location, name);
	}

    @Override
    public void use(Entity e){
        e.equipItem(this);
        e.getOccupation().getStats().modHardiness(10);
        e.getOccupation().getStats().modAgility(10);
    }

}
