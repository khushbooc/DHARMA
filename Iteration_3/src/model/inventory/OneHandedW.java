<<<<<<< HEAD
import model.gameMap;
=======
package model.inventory;
>>>>>>> 40b07fdd36a97c09e828802d384d89a0cdad894a

import model.gameMap.Entity;
import model.gameMap.Location;

public class OneHandedW extends EquipableItem {
	public OneHandedW(Location location, String name){
        super(location, name);
    }

    @Override
    public void use(Entity e){
        //TODO
    }



}
