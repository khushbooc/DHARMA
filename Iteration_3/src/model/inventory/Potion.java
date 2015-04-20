package model.inventory;


import model.entity.Entity;
import model.gameMap.Location;

public class Potion extends NonEquipableItem {

    public Potion(Location location, String name){
        super(location, name);

    }

    @Override
    public void use(Entity e){
        e.getOccupation().getStats().modHardiness(5);
        e.getOccupation().getStats().modCurrentHealth(5);
        e.getOccupation().getStats().modCurrentMana(5);
    }
    public String getItemType() {
		return "Potion";
	}
}
