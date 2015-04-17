public class Frostbolt extends LinearAbility
{
	private int damage;
	// private String type;

	public Frostbolt()
	{
		this.damage = 90;
		this.setCost(1);
		this.setLevelRequirement(1);
		this.setName("Frostbolt");
		this.setRadius(100);
		// this.type = "bane";
	}

	public Frostbolt(String name, int cost, int levelRequirement, int radius, int damage)
	{
		this.name = name;
		this.cost = cost;
		this.levelRequirement = levelRequirement;
		this.radius = radius;
		this.damage = damage;
	}

	public void getDamage()
	{
		return damage;
	}

	public void setDamage(int damage)
	{
		this.damage = damage;
	}

	public abstract boolean use()
}