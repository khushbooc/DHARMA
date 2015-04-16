package model.gameMap;

public class InstantDeath extends AreaEffect{
    private String name;

    public InstantDeath(String name){
        this.name = name;
    }

    @Override
    public void applyEffect(Entity e){
        //TOD0: wait for entity to be created
    }
    public String getName(){
        return name;
    }

}
