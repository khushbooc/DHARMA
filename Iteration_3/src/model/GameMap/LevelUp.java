package model.gameMap;


public class LevelUp extends AreaEffect {
    private String name;

    public LevelUp(String name){
        this.name = name;
    }
    @Override
    public void applyEffect(Entity e){
        //TODO:
    }
    public String getName(){
        return name;
    }
}
