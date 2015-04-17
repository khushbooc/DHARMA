package model.gameMap;

/**
 * Created by giangnguyen on 4/16/15.
 */
public class Water extends Terrain {

    public Water(String name){
        super(name);
    }
    @Override
    public boolean isPassable(){
        return false;
    }

    String getName(){
        return name;
    }
}
