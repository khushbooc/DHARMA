package model.entity;

import model.gameMap.Location;
import model.inventory.NonEquipableItem;

/**
 * Created by giangnguyen on 4/19/15.
 */
public class Gold{
    private int count;
    public Gold(int count){
        this.count = count;
    }
    public void setCount(int count){
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }
    public void increaseGoldCount(int delta){
        count += delta;
    }
}
