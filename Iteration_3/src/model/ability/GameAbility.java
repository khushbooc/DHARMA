package model.ability;

import controller.DharmaKeyListener;
import model.gameMap.MapObject;

/**
 * Created by agemery on 4/18/15.
 */

//this is a super class of Ability.
//Game abilities are functions like movement, pausing, and selection - not casting spells, sneaking, etc
//this is what controller will use to activate stuff that isnt a normal ability
public abstract class GameAbility {

    protected MapObject owner;
    protected DharmaKeyListener keyListener; //not sure if this is needed

    public GameAbility(MapObject owner) {
        this.owner = owner;
    }

    public abstract void use();
}
