package model.ability;
import model.entity.Entity;

import java.util.Random;
public abstract class RadiusAbility extends Ability
{
    protected int radius;

    public RadiusAbility()
    {
        super();
        radius = 1;
    }

    public RadiusAbility(String name, int cost, int levelRequirement, int radius, int base)
    {
        super(name, cost, levelRequirement, radius, base);
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public abstract boolean inRadius(Entity avatar, Entity entity);
    public abstract void scaleEffect(Entity avatar, Entity entity);
    public abstract void use(Entity avatar);
}