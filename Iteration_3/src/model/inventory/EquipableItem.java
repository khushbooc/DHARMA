import model.GameMap;


public class EquipableItem extends TakeableItem{
	
	public EquipableItem(Location location, String name){
        super(location);
        this.name = name;
    }

}
