package model.gameMap;

import java.awt.image.*;
import java.awt.*;
import java.io.File;
import java.util.Observable;

public abstract class MapObject extends Observable{
    protected Location location;
    
    private BufferedImage image;
    
    public void draw(Graphics2D g)
    {
    	if(image != null)
    		GameMech.fillHex(location.getX(),location.getY(),image, g);
    }

    public MapObject(Location location){
        this.location = location;
    }

    public Location getLocation(){
        return this.location;
    }
    public void setLocation(Location location){
        this.location = location;
    }

    public void setLocation(int x, int y){
        this.location = new Location(x,y);
    }


}
