package model.gameMap;

import model.entity.Entity;

public class TakeDamage extends AreaEffect {

    public TakeDamage(String name){
        super(name);
    }

    @Override
    public void applyEffect(Entity e){
        e.getOccupation().getStats().modCurrentHealth(-5);
        e.getOccupation().getStats().modStrength(-2);
        e.getOccupation().getStats().modHardiness(-2);
    }
    
    public String getAreaEffectType(){
    	return "Take Damage";
    }
}
