package model.ability;

public class Frostbolt extends ProjectileAbility
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

//		this.type = "bane";

	}

	public Frostbolt(String name, int cost, int levelRequirement, int radius, int damage)
	{
        super(name, cost, levelRequirement, radius, damage);
	}

	public int getDamage()
	{
		return damage;
	}

	public void setDamage(int damage)
	{
		this.damage = damage;
	}



	/*
	public String getType()
	{
		return type;
	}
	*/
    @Override
	public void use(){
        return true; //temporary
    }

    @Override
    public boolean inRadius(){
        return true; //temporary
    }

	@Override
	public void activate()
	{
		return;
	}
}