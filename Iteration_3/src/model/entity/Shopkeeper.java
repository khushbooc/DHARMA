package model.entity;

import model.gameMap.Location;
import model.inventory.EquipableItem;
import model.inventory.EquipmentContainer;
import model.inventory.Inventory;
import model.inventory.TakeableItem;
import model.occupation.Occupation;

import java.util.Random;

public class Shopkeeper extends FriendlyNPC{
    private Gold gold;
    public Shopkeeper(Location loc, Occupation oc, Inventory inv, EquipmentContainer eq){
        super(loc, oc, inv, eq);
        gold = new Gold(20); // shopkeeper initially has 20 golds
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
    public Gold getGold(){
        return this.gold;
    }
    public String dialogue(){
        return "Hey! check out my gear";
    }
    public void trade(Avatar avatar){

        Random numberGenerator = new Random();
        int num1 = numberGenerator.nextInt(avatar.getGold().getCount()); //number of gold involved in trade
        if(num1 == 0){
            return; //decide not to trade
        }
        int num2 = numberGenerator.nextInt(getInventory().getCount());
        avatar.getGold().increaseGoldCount(num1*(-1));
        this.getGold().increaseGoldCount(num1);
        TakeableItem ti = this.getInventory().getItem(num2);
        this.getInventory().remove(ti);
        avatar.getInventory().add(ti); // add to avatar's inventory
    }
}
