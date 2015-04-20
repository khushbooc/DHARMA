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

import java.util.ArrayList;

/**
 * Created by giangnguyen on 4/16/15.
 */
public abstract class Entity extends MapObject{
    protected Occupation occupation;
    protected Inventory inventory ;
    protected EquipmentContainer equicontainer;
    protected int direction;

    public Entity(Location location, Occupation occupation, Inventory inventory , EquipmentContainer equicontainer) {
        this(occupation);
        this.occupation = occupation;
        this.inventory = inventory;
        this.equicontainer= equicontainer;
        this.location = location;
    }
    public Entity(Occupation oc){
        super();
        this.occupation  = oc;
        this.inventory = new Inventory();
        this.equicontainer = new EquipmentContainer();
        ArrayList<Ability> abilities = this.occupation.getAbilityLibrary().getAllAbilities();

        for(Ability a : abilities) {
            a.setAvatar(this);
        }
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

