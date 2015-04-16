package model.gameMap;

/**
 * Created by giangnguyen on 4/16/15.
 */
public class Mountain extends Terrain {
    private String name;

    public Mountain(String name){
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
