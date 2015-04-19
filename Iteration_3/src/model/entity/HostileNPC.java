package model.entity;

import model.gameMap.Location;
import model.inventory.EquipableItem;
import model.inventory.EquipmentContainer;
import model.inventory.Inventory;
import model.inventory.TakeableItem;
import model.occupation.Occupation;

/**
 * Created by giangnguyen on 4/18/15.
 */
public abstract class HostileNPC extends NPC {
    public HostileNPC(Location loc, Occupation oc, Inventory in, EquipmentContainer eq){
        super(loc, oc, in, eq);
    }
    public abstract void attack(Avatar avatar);
    @Override
    public abstract void addToInventory(TakeableItem takeableitem);
    @Override
    public abstract void equipItem(EquipableItem equiItem);
    @Override
    public abstract void removeItem(TakeableItem ti);
    @Override
    public abstract void unequipItem(EquipableItem eqi);



}
