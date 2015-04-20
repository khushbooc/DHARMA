package model.entity;

import model.gameMap.Location;
import model.inventory.EquipableItem;
import model.inventory.EquipmentContainer;
import model.inventory.Inventory;
import model.inventory.TakeableItem;
import model.occupation.Occupation;

/**
 * Created by giangnguyen on 4/19/15.
 */
public class Mount extends FriendlyNPC {
    private Avatar owner;
    public Mount(Location loc, Occupation oc, Inventory inv, EquipmentContainer eq){
        super(loc, oc, inv, eq);
        owner = null;
    }
    public void setOwner(Avatar owner){
        this.owner = owner;
    }
    public Avatar getOwner(){
        return this.owner;
    }
    //    public void use(){
//        if(owner == null){
//            return;
//        }
//
//  }
    @Override
    public void addToInventory(TakeableItem takeableitem){
        this.getInventory().add(takeableitem);
    }

    @Override
    public void equipItem(EquipableItem equiItem){
        this.getEquipmentContainer().add(equiItem);
        this.getInventory().add(equiItem);
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
