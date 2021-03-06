
package model.inventory;

import model.entity.Entity;
import model.gameMap.Location;

public class OneHandedW extends EquipableItem {
	public OneHandedW(Location location, String name){
        super(location, name);
    }

    @Override
    public void use(Entity e){
        e.equipItem(this);
        e.getOccupation().getStats().modStrength(10);
    }

    public String getItemType() {
		return "One Handed W";
	}

}
