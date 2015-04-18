package model.ability;
import model.entity.Entity;

import java.util.Random;
public abstract class RadiusAbility extends Ability
{
	private int effect;
	private int radius;

	public RadiusAbility()
	{
		super();
		radius = 1;
	}

	public Ability(String name, int cost, int levelRequirement, int radius, int base)
	{
		super(name, cost, levelRequirement);
		this.radius = radius;
	}

	public int getEffect()
	{
		return effect;
	}

	public void setEffect(int effect)
	{
		this.effect = effect;
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

	public abstract boolean inRadius(Entity avatar, Entity entity);
	public abstract void scaleEffect(Entity avatar, Entity entity);
	public abstract void use(Entity avatar, Entity entity);
}