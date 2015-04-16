package model.gameMap;



public class Tile {	
	
	
	private Location location;
	
	// private AreaEffect areaEffect;
	

	public Tile(int x,int y){ //will take more parameters(maybe)
		
		location= new Location(x,y);
	}  
	
	public Tile (Tile tile) {
		this.location = tile.getLocation();
	}
	
	/*
	public Tile getTile(){  //not sure if this is needed. Leaving it here for later
		return this;
	}
	*/ 
	
	public Location getLocation(){  // can be deleted later. Used for debugging.
		return location;
	}

	
	
	public String toString() {
		String result = "";
		result += "Tile:" + this.location.getX() + "," + this.location.getY();
		
		return result;
	}
	
	
}
