package model.ability;
public class FireNova extends RadialAbility
{
	private int damage;
	// private String type;

	public FireNova()
	{
		this.damage = 90;
		this.setCost(1);
		this.setLevelRequirement(10);
		this.setName("Fire Nova");
		this.setRadius(3);
	}

	public Frostbolt(String name, int cost, int levelRequirement, int radius, int damage)
	{
        super(name, cost, levelRequirement, radius);
		setName(name);
		setCost(cost);
		setLevelRequirement(levelRequirement);
		setRadius(radius);
		setDamage(damage);
	}

	public int getDamage()
	{
		return damage;
	}

	public void setDamage(int damage)
	{
		this.damage = damage;
	}
	
    @Override
	public boolean use(Entity caster, Entity )
	{
        return true; //temporary
    }

    @Override
    public boolean inRadius(){
        return true; //temporary
    }

    @Override
    private void scaleEffect(Entity avatar, Entity entity)
    {
    	int critical;
		int damage;
		double base, avatarCrit, random, criticalStrike, modifier, offense, defense, level, skill;

		level = avatar.getLevel();
		offense = avatar.getBoon();
		defense = entity.getArmor();
		skill = avatar.getBoon();
		avatarCrit = Math.pow(2,avatar.getCritical());

		random = (double) random(85,100) / 100;
		critical = random(1,16 / avatarCrit);

		if(critical == 1)
			criticalStrike = 1.5;
		else
			criticalStrike = 1;

		modifier = random * criticalStrike * (1 + 0.5 * skill / 125);

		damage = (int) Math.floor(((2 * level + 10) / 250 * offense / defense * base + 2) * modifier);

		setEffect(damage);    	
    }

}