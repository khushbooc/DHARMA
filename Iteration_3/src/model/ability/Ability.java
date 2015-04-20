package model.ability;
import model.entity.Entity;

import java.util.Random;

/*
 * @author Aaron Iglesias
 */
public abstract class Ability extends GameAbility{
	protected String name;
	protected int base;
	protected int cost;
	protected int effect;
	protected int levelRequirement;

	public Ability()
	{
		name = "";
		base = 0;
		cost = 0;
		effect = 0;
		levelRequirement = 0;
	}

	public Ability(String name, int cost, int levelRequirement, int base, int effect)
	{
		this.name = name;
		this.cost = cost;
		this.levelRequirement = levelRequirement;
		this.base = base;
		this.effect = effect;
	}

	public int getBase()
	{
		return base;
	}

	public void setBase(int base)
	{
		this.base = base;
	}

	public int getEffect()
	{
		return effect;
	}

	public void setEffect(int effect)
	{
		this.effect = effect;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getCost()
	{
		return cost;
	}

	public void setCost(int cost)
	{
		this.cost = cost;
	}

	public int getLevelRequirement()
	{
		return levelRequirement;
	}

	public void setLevelRequirement(int levelRequirement)
	{
		this.levelRequirement = levelRequirement;
	}

	public boolean meetsLevelRequirements(Entity avatar)
	{
		if(avatar.getOccupation().getStats().getLevel() >= levelRequirement)
			return true;
		else
			return false;
	}

	// random number generator for all abilities
	// generate a random int within [min, max]
	protected static int random(int min, int max)
	{
		Random random = new Random();
		int randomNumber = random.nextInt(max - min + 1) + min;

		return randomNumber;
	}

	public abstract void use(Entity avatar);
}