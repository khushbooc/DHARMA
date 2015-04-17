<<<<<<< HEAD
import model.gameMap;
=======
package model.inventory;
import model.gameMap.Entity;
import model.gameMap.Location;
>>>>>>> 40b07fdd36a97c09e828802d384d89a0cdad894a


public abstract class NonEquipableItem extends TakeableItem {
	
	public NonEquipableItem(Location location, String name){
        super(location, name);
    }

    @Override
    public boolean isCollidable(){
        return true;
    }

    @Override
    public void onTouch(Entity e){
        //TODO
    }

    @Override
    public void use(Entity e){
        //TODO: affect entity stats
    }



}
