package model.entity;

import model.gameMap.Location;
import model.inventory.*;
import model.occupation.Occupation;

import java.awt.*;

public class Avatar extends Entity {
    private Gold gold;

    public Avatar(Occupation oc){
        super(oc);
    }

    public Avatar(Location location, Occupation occupation, Inventory inventory, EquipmentContainer equipmentContainer){
        super(location, occupation,inventory, equipmentContainer);
        gold = new Gold(10);// avatar has 10 golds initially

    }

    public Gold getGold(){
        return this.gold;
    }

    @Override
    public void addToInventory(TakeableItem takeableitem) {
        this.getInventory().add(takeableitem);

    }

    @Override
    public void equipItem(EquipableItem equiItem) {
        this.getEquipmentContainer().add(equiItem);
        this.getInventory().remove(equiItem);
    }

    @Override
    public void removeItem(TakeableItem ti) {
        this.getInventory().remove(ti);

    }
    @Override
    public void unequipItem(EquipableItem eqi) {
        this.getEquipmentContainer().remove(eqi);
        this.getInventory().add(eqi);
    }
    public void move(Point step, int direction ){
        return;
    }


}
