package model.gameMap;

/**
 * Created by giangnguyen on 4/16/15.
 */
public class Grass extends Terrain{

    public Grass (String name){
        super(name);
    }
    @Override
    public boolean isPassable(){
        return true;
    }

    String getName(){
        return name;
    }
}
