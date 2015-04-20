package model.gameMap;

import model.entity.Entity;

public class InstantDeath extends AreaEffect{

    public InstantDeath(String name){
        super(name);
    }

    @Override
    public void applyEffect(Entity e){
        int lives = e.getOccupation().getStats().getLives();
        e.getOccupation().getStats().modLives(lives * (-1));
    }
    public String getName(){
        return name;
    }
    public String getAreaEffectType(){
    	return "Instant Death";
    }

}
