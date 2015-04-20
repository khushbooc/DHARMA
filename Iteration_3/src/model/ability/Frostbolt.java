package model.ability;

import model.entity.Entity;
import model.statistics.SummonerStats;

/*
 * @author Aaron Iglesias
 */
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

	@Override
	public boolean inRadius(Entity avatar, Entity entity) {
		return false;
	}

	@Override
	public void scaleEffect(Entity avatar, Entity entity) {
		int critical;
		int avatarCrit, base, damage;
		double random, criticalBonus, modifier, offense, defense, level, skill;

		base = getBase();

		SummonerStats stats = (SummonerStats) avatar.getOccupation().getStats();

		level = stats.getLevel();
		offense = stats.getSpellPower();
		defense = stats.getArmor();
		skill = stats.getBoon();
		avatarCrit = (int) Math.pow(2,stats.getCritical());

		random = (double) random(85,100) / 100;
		critical = (int) random(1,16 / avatarCrit);
		if(critical == 1)
			criticalBonus = 1.5;
		else
			criticalBonus = 1;

		modifier = random * criticalBonus * (1 + 0.5 * skill / 125);

		damage = (int) Math.floor(((2 * level + 10) / 250 * offense / defense * base + 2) * modifier);

		setEffect(damage);
	}

	@Override
	public void use(Entity avatar) {

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
	public void activate()
	{
		return;
	}
}