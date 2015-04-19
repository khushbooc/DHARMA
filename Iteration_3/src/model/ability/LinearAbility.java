package model.ability;

import model.entity.Entity;

public abstract class LinearAbility extends RadiusAbility
{
	protected int radius;

	public LinearAbility()
	{
		super();
		radius = 1;
	}

	public LinearAbility(String name, int cost, int levelRequirement, int radius, int base)
	{
		super(name, cost, levelRequirement, radius, base);
	}

	public abstract void use(Entity avatar, Entity entity);
}