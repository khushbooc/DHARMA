
package model.inventory;


import model.gameMap.Entity;
import model.gameMap.Location;

public class Head extends EquipableItem{
	public Head(Location location, String name){
        super(location, name);
    }

    @Override
    public void use (Entity e){
        //TODO
    }


}
