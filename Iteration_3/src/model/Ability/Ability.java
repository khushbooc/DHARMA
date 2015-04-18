package model.ability;
public abstract class Ability
{
	private String name;
	private int cost;
	private int levelRequirement;
	private int radius;

	public Ability()
	{
		name = "";
		cost = 0;
		levelRequirement = 0;
		radius = 1;
	}

	public Ability(String name, int cost, int levelRequirement, int radius)
	{
		this.name = name;
		this.cost = cost;
		this.levelRequirement = levelRequirement;
		this.radius = radius;
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

	public int getRadius()
	{
		return radius;
	}

	public void setRadius(int radius)
	{
		this.radius = radius;
	}

	// random number generator for all abilities
	// generate a random int within [min, max]
	public static int random(int min, int max)
	{
		Random random = new Random();
		int randomNumber = random.nextInt(max - min + 1) + min;

		return randomNumber;
	}

	public abstract boolean use();
	public abstract boolean inRadius();
}