package model.ability;
import model.entity.Entity;

import java.util.Random;

/*
 * @author Aaron Iglesias
 */
public abstract class ProjectileAbility extends Ability
{
    private int radius;

    public ProjectileAbility()
    {
        super();
        radius = 1;
    }

    public ProjectileAbility(String name, int cost, int levelRequirement, int radius, int base)
    {
        super(name, cost, levelRequirement, radius, base);
    }

    public int getRadius()
    {
        return radius;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public int getBase()
    {
        return base;
    }

    public void setBase(int base)
    {
        this.base = base;
    }

    protected abstract boolean inRadius(Entity entity);
    protected abstract void scaleEffect(Entity entity);
    public abstract void use();
}