package model.entity;

import model.ability.Ability;
import model.entity.NPC;
import model.gameMap.Location;
import model.inventory.EquipableItem;
import model.inventory.EquipmentContainer;
import model.inventory.Inventory;
import model.inventory.TakeableItem;
import model.occupation.Occupation;

public abstract class Pet extends HostileNPC {
    private Avatar owner;
    private Attack attack;

    public Pet(Occupation oc, Inventory inv, EquipmentContainer eq, Avatar owner) {
        super(null, oc, inv, eq);
        int x = owner.getLocation().getX();
        int y = owner.getLocation().getY();
        this.setLocation(x,y);
        this.owner = owner;
    }
    @Override
    public void addToInventory(TakeableItem takeableitem){
        inventory.add(takeableitem);
    }
    @Override
    public void equipItem(EquipableItem equiItem){
        equicontainer.add(equiItem);
    }
    @Override
    public void removeItem(TakeableItem ti){ //remove Item from Inventory
        inventory.remove(ti);
    }
    @Override
    public void unequipItem(EquipableItem eqi){
        equicontainer.remove(eqi);
    }
    public void steal(Entity e){
        TakeableItem ti = e.getInventory().getItem(0);
        owner.getInventory().add(ti);
        e.getInventory().remove(ti);
    }
    public void follow(){
        int x = owner.getLocation().getX();
        int y = owner.getLocation().getY();
        this.setLocation(x, y);
    }
    public void attack(Entity e){
       //
    }



}
