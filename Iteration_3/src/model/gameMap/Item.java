package model.gameMap;

import model.entity.Entity;
import utilities.ItemImageBuilder;

import java.awt.image.BufferedImage;

/**
 * Created by giangnguyen on 4/16/15.
 */
public abstract class Item extends MapObject{
    protected String name;
    private ItemImageBuilder imageBuilder;

    public Item(Location location, String name){
        super(location);
        imageBuilder = new ItemImageBuilder(location.getX(), location.getY(), this);
        this.name = name;
    }

    public BufferedImage getImage()
    {
        return imageBuilder.getImage();
    }

    public abstract String getItemType();
    public abstract boolean isCollidable();

    public abstract void onTouch(Entity e);

}
