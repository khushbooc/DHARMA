package model.entity;

import model.inventory.EquipableItem;
import model.inventory.EquipmentContainer;
import model.inventory.Inventory;
import model.inventory.TakeableItem;
import model.occupation.Occupation;
import model.statistics.Stats;

/**
 * Created by giangnguyen on 4/16/15.
 */
public class Entity {
	protected Occupation occupation;
	protected Inventory inventory ;
	protected EquipmentContainer equicontainer;
	
	
	public Entity(Occupation occupation, Inventory inventory , EquipmentContainer equicontainer) {
		this.occupation = occupation;
		this.inventory = inventory;
		this.equicontainer= equicontainer;
	}
	public Occupation getOccupation()
	{
		return this.occupation;
		
	}
	public Inventory getInventory(){
		 return this.inventory;
		 
	}
	public EquipmentContainer getEquipmentContainer()
	{
		return this.equicontainer;
	}
	
	public void addToInventory(TakeableItem takeableitem){
		inventory.add(takeableitem);
		
	}
	
	public void EquipItem(EquipableItem equiItem)
	{
		equicontainer.add(equiItem);
		inventory.remove(equiItem);
	}
}

