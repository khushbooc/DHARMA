package model.gameMap;

import model.entity.Entity;

/**
 * Created by giangnguyen on 4/16/15.
 */
public class HealDamage extends AreaEffect {

    public HealDamage(String name){
        super(name);
    }

    @Override
    public void applyEffect(Entity e){
        e.getOccupation().getStats().modCurrentHealth(-5);
        e.getOccupation().getStats().modStrength(-2);
        e.getOccupation().getStats().modHardiness(-2);
    }
    public String getName(){
        return name;
    }
    
    public String getAreaEffectType(){
    	return "Heal Damage";
    }
}
