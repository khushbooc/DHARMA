package model.entity;

import model.gameMap.Location;
import model.gameMap.Tile;
import model.inventory.EquipableItem;
import model.inventory.EquipmentContainer;
import model.inventory.Inventory;
import model.inventory.TakeableItem;
import model.occupation.Occupation;

/**
 * Created by giangnguyen on 4/19/15.
 */
public class Barbarian extends HostileNPC {
    public Barbarian(Location loc,  Occupation oc,Inventory inv, EquipmentContainer eq){
        super(loc,oc ,inv , eq);
    }
    @Override
    public void attack(Avatar avatar){
        avatar.getOccupation().getStats().modAgility(-2);
        avatar.getOccupation().getStats().modHardiness(-2);
        avatar.getOccupation().getStats().modIntellect(-2);
        avatar.getOccupation().getStats().currentMana(-2);
    }
    @Override
    public void addToInventory(TakeableItem takeableitem){
        this.getInventory().add(takeableitem);
    }
    @Override
    public void equipItem(EquipableItem equiItem){
        this.getEquipmentContainer().add(equiItem);
        this.getInventory().remove(equiItem);
    }
    @Override
    public void removeItem(TakeableItem ti){
        this.getInventory().remove(ti);
    }
    @Override
    public void unequipItem(EquipableItem eqi){
        this.getEquipmentContainer().remove(eqi);
        this.getInventory().add(eqi);
    }


}
