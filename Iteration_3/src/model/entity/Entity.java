package model.entity;

import model.ability.Ability;
import model.ability.AbilityLibrary;
import model.gameMap.Location;
import model.gameMap.MapObject;
import model.inventory.EquipableItem;
import model.inventory.EquipmentContainer;
import model.inventory.Inventory;
import model.inventory.TakeableItem;
import model.occupation.Occupation;

/**
 * Created by giangnguyen on 4/16/15.
 */
public abstract class Entity extends MapObject{
    protected Occupation occupation;
    protected Inventory inventory ;
    protected EquipmentContainer equicontainer;
    protected int direction;

    public Entity(Location location, Occupation occupation, Inventory inventory , EquipmentContainer equicontainer) {
        super(location);
        this.occupation = occupation;
        this.inventory = inventory;
        this.equicontainer= equicontainer;
    }
    public Entity(Occupation oc){
        super();
        this.occupation  = oc;
        this.inventory = new Inventory();
        this.equicontainer = new EquipmentContainer();
    }




    public Occupation getOccupation(){
        return this.occupation;
    }
    public Inventory getInventory(){
        return this.inventory;
    }
    public EquipmentContainer getEquipmentContainer(){
        return this.equicontainer;
    }

    public abstract void addToInventory(TakeableItem takeableitem);
    public abstract void equipItem(EquipableItem equiItem);
    public abstract void removeItem(TakeableItem ti);
    public abstract void unequipItem(EquipableItem eqi);
    public void setDirection(int direction){
        this.direction = direction;
    }
}

