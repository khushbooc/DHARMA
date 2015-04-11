public class Smash extends LinearAbility
{
	private int damage;

	public Smash()
	{
		this.damage = 60;
		this.setCost(1);
		this.setLevelRequirement(1);
		this.setName("Smash");
		this.setRadius(1);
	}

	public Smash(String name, int cost, int levelRequirement, int radius, int damage)
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
}