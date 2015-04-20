package model.ability;
import model.entity.Entity;

import java.util.Random;

/*
 * @author Aaron Iglesias
 */
public abstract class SelfAbility extends Ability
{
    public SelfAbility()
    {
        super();
    }

    public SelfAbility(String name, int cost, int levelRequirement, int base, int effect)
    {
        super(name, cost, levelRequirement, base, effect);
    }

    public abstract void scaleEffect(Entity avatar);
    public abstract void use(Entity avatar);
}