package model.gameMap;


import model.entity.Entity;

public class Trap extends AreaEffect{

    public Trap(String name){
        super(name);
    }

    @Override
    public void applyEffect(Entity e){
        int movement = e.getOccupation().getStats().getMovement();
        e.getOccupation().getStats().modMovement(movement*(-1));
    }
    public String getName(){
        return name;
    }
    
    public String getAreaEffectType(){
    	return "Trap";
    }
}
