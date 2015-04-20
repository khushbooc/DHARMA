package model.ability;
import model.entity.Entity;

import java.util.Random;

/*
 * @author Aaron Iglesias
 */
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

    protected boolean inRadius(Entity entity)
    {
        int aLx = avatar.getLocation().getX();
        int eLx = entity.getLocation().getX();

        int aLy = avatar.getLocation().getY();
        int eLy = entity.getLocation().getY();

        boolean inRadius = Math.pow(eLx - aLx,2) + Math.pow(eLy - aLy, 2) <= Math.pow(radius,2);

        if(inRadius)
            return true;
        else
            return false;
    }
    protected abstract void scaleEffect(Entity entity);
    public abstract void use();
}