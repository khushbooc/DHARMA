package model.gameMap;


public abstract class Terrain {
    protected String name;
    public Terrain(String name){
        this.name  = name;
    }
    public abstract boolean isPassable();

}
