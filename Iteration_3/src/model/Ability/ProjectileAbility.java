package model.ability;
import model.entity.Entity;

import java.util.Random;
public abstract class ProjectileAbility extends Ability
{
	private int radius;

	public RadiusAbility()
	{
		super();
		radius = 1;
	}

	public Ability(String name, int cost, int levelRequirement, int radius)
	{
		super(name, cost, levelRequirement);
		this.radius = radius;
	}

	public abstract boolean inRadius(Entity avatar, Entity entity);
	public abstract void scaleEffect(Entity avatar, Entity entity);
}