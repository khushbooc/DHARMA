import model.GameMap;


public class NonEquipableItem extends TakeableItem{
	
	public NonEquipableItem(Location location, String name){
        super(location);
        this.name = name;
    }


}
