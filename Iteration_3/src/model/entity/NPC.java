package model.entity;

import model.ability.Ability;
import model.gameMap.Location;
import model.inventory.EquipableItem;
import model.inventory.EquipmentContainer;
import model.inventory.Inventory;
import model.inventory.TakeableItem;
import model.occupation.Occupation;

public abstract class NPC extends Entity {
	public NPC(Location location, Occupation occupation, Inventory inventory, EquipmentContainer equicontainer) {
        super(occupation, inventory, equicontainer);

    }
    @Override
    public abstract void addToInventory(TakeableItem takeableitem);
    @Override
    public abstract void equipItem(EquipableItem equiItem);
    @Override
    public abstract void removeItem(TakeableItem ti);
    @Override
    public abstract void unequipItem(EquipableItem eqi);



}

