package model.entity;

import model.ability.Ability;
import model.ability.AbilityLibrary;
import model.inventory.EquipableItem;
import model.inventory.EquipmentContainer;
import model.inventory.Inventory;
import model.inventory.TakeableItem;
import model.occupation.Occupation;
import model.statistics.Stats;

/**
 * Created by giangnguyen on 4/16/15.
 */
public abstract class Entity {
	protected Occupation occupation;
	protected Inventory inventory ;
	protected EquipmentContainer equicontainer;
	
	
	public Entity(Occupation occupation, Inventory inventory , EquipmentContainer equicontainer) {
		this.occupation = occupation;
		this.inventory = inventory;
		this.equicontainer= equicontainer;
	}
	public abstract Occupation getOccupation();
	public abstract Inventory getInventory();
	public abstract EquipmentContainer getEquipmentContainer();
	
	public abstract void addToInventory(TakeableItem takeableitem);
	
	public abstract void equipItem(EquipableItem equiItem);
    public abstract void removeItem(TakeableItem ti);
    public abstract void unequipItem(EquipableItem eqi);
    public abstract void useAbility(Ability ability);
}

