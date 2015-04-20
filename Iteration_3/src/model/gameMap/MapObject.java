package model.gameMap;

import java.awt.image.*;
import java.awt.*;
import java.util.Observable;

public abstract class MapObject extends Observable{
    protected Location location;

    //why is this here?
    private BufferedImage image;

    public MapObject() {
        this.location = new Location(0, 0);
    }

    public MapObject(Location location){
        this.location = location;
    }

    //this shouldn't be a part of the model
    public void draw(Graphics2D g)
    {
    	if(image != null)
    		GameMech.fillHex(location.getX(),location.getY(),image, g);
    }

    public Location getLocation(){
        return this.location;
    }
    public void setLocation(Location location){
        this.location = location;
    }

    //use locationDelta in favor of this method
    public void setLocation(int x, int y){
        this.location = new Location(x,y);
    }

    public void locationDelta(int x, int y) {

    }


}
