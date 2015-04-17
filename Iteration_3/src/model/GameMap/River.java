package model.gameMap;

/**
 * Created by giangnguyen on 4/16/15.
 */
public class River extends Terrain {

    public River(String name){
        super(name);
    }
    @Override
    public boolean isPassable(){
        return true;
    }

    String getName(){
        return name;
    }

    public void affectEntity(){
        //TODO
    }

}
