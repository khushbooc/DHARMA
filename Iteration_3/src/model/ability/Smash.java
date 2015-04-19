package model.ability;

import model.entity.Entity;
import model.statistics.SmasherStats;

public class Smash extends LinearAbility
{
	public Smash()
	{
		base = 100;
		cost = 1;
		levelRequirement = 2;
		name = "Smash";
		radius = 1;
	}

	public Smash(String name, int cost, int levelRequirement, int radius, int base)
	{
		super(name, cost, levelRequirement, radius, base);
	}

	@Override
	public void scaleEffect(Entity avatar, Entity entity)
	{
		int critical;
		int avatarCrit, base, damage;
		double random, criticalBonus, modifier, offense, defense, level, skill;

		base = getBase();

		SmasherStats stats = (SmasherStats) avatar.getOccupation().getStats();

		level = stats.getLevel();
		offense = stats.getOffense();
		defense = stats.getArmor();
		skill = stats.getTwoHandedWeapon();
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
	public boolean inRadius(Entity avatar, Entity entity)
	{
		return false;
	}

	@Override
	public void use(Entity avatar)
	{
		return;
	}

	@Override
	public void activate()
	{
		return;
	}
}