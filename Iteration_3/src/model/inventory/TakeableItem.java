import model.GameMap;

//created by ashish aggarwal

public class TakeableItem extends Item{
	 public TakeableItem(Location location, String name){
	        super(location);
	        this.name = name;
	    }

	    public boolean isCollidable();
	    {
	    	return true;
	    }

	    public void onTouch(Entity e);
	    { 
	        
	    }

}
