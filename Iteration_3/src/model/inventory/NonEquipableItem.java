
package model.inventory;
import model.entity.Entity;
import model.gameMap.Location;



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
        e.addToInventory(this);
    }

    @Override
    public abstract void use(Entity e);
}
