package model.gameMap;



public class Tile extends MapObject{
	// private AreaEffect areaEffect;

	public Tile(Location location){ //will take more parameters(maybe)
        super(location);
	}
	
//	public Tile (Tile tile) {
//		this.location = tile.getLocation();
//	}

	
	public Location getLocation(){  // can be deleted later. Used for debugging.
		return location;
	}

	
	
	public String toString() {
		String result = "";
		result += "Tile:" + this.location.getX() + "," + this.location.getY();
		
		return result;
	}
	
	
}
