
package model.inventory;

import model.entity.Entity;
import model.gameMap.Location;

public class TwoHandedW extends EquipableItem{
	public TwoHandedW(Location location, String name){
        super(location, name);
    }

    @Override
    public void use(Entity e){
        e.equipItem(this);
        e.getOccupation().getStats().modStrength(15);
    }
    public String getItemType() {
		return "Two Handed W";
	}
}
