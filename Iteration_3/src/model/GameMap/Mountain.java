package model.gameMap;

/**
 * Created by giangnguyen on 4/16/15.
 */
public class Mountain extends Terrain {

    public Mountain(String name){
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
