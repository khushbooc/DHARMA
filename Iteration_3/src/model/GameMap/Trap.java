package model.gameMap;


public class Trap extends AreaEffect{
    private String name;

    public Trap(String name){
        this.name = name;
    }

    @Override
    public void applyEffect(Entity e){
        //TODO
    }
    public String getName(){
        return name;
    }
}
