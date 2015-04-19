package model.statistics;
public class SummonerStats extends Stats
{
	private int enchantment;
	private int boon;
	private int bane;
	private int staff;

	public SummonerStats()
	{
		super();
		enchantment = 1;
		boon = 1;
		bane = 1;
		staff = 1;
	}

	@Override
	public void levelUp()
	{
		modLives(1);
		modStrength(3);
		modAgility(3);
		modIntellect(4);
		modHardiness(3);
		modMovement(3);
		modSkillPoints(5);
	}

	public void modEnchantment()
	{
		if(getSkillPoints() <= 0 || enchantment == 125)
			return;
		modSkillPoints(-1);
		++enchantment;
	}

	public void modBoon()
	{
		if(getSkillPoints() <= 0 || boon == 125)
			return;
		modSkillPoints(-1);
		++boon;
	}

	public void modBane()
	{
		if(getSkillPoints() <= 0 || bane == 125)
			return;
		modSkillPoints(-1);
		++bane;
	}

	public void modStaff()
	{
		if(getSkillPoints() <= 0 || staff == 125)
			return;
		modSkillPoints(-1);
		++staff;
	}
}