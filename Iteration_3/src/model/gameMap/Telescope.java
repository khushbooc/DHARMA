package model.gameMap;


import model.entity.Entity;

public class Telescope extends InteractiveItem {
    public Telescope(Location loc, String name){
        super(loc, name);
    }
    @Override
    public void onTouch(Entity e){ //telescope increases observation
        int observation = e.getOccupation().getStats().getObservation();
        e.getOccupation().getStats().setObservation(observation * 2);
    }
}
