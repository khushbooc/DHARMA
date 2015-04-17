<<<<<<< HEAD
import model.gameMap;
=======
package model.inventory;

import model.gameMap.Entity;
import model.gameMap.Location;
>>>>>>> 40b07fdd36a97c09e828802d384d89a0cdad894a

public class TwoHandedW extends EquipableItem{
	public TwoHandedW(Location location, String name){
        super(location, name);
    }

    @Override
    public void use(Entity e){
        //TODO
    }

}
