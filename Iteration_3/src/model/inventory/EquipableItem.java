<<<<<<< HEAD
import model.gameMap;
=======
package model.inventory;
>>>>>>> 40b07fdd36a97c09e828802d384d89a0cdad894a

import model.gameMap.Entity;
import model.gameMap.Location;

public abstract class EquipableItem extends TakeableItem{
	
	public EquipableItem(Location location, String name){
        super(location, name);
    }

    @Override
    public boolean isCollidable(){
        return true;
    }

    @Override
    public void onTouch(Entity e){
        //TODO:
    }

    @Override
    public abstract void use(Entity e);

}
