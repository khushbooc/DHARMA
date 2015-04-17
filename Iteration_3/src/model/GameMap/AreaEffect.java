package model.gameMap;

public abstract class AreaEffect {
    String name;
    public AreaEffect(String name){
        this.name = name;
    }
    public abstract void applyEffect(Entity e);

}
