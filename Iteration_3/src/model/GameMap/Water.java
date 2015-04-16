package model.gameMap;

/**
 * Created by giangnguyen on 4/16/15.
 */
public class Water extends Terrain {
    private String name;

    public Water(String name){
        this.name = name;
    }
    @Override
    public boolean isPassable(){
        return false;
    }

    String getName(){
        return name;
    }
}
