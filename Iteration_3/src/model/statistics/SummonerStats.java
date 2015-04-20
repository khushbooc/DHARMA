package model.statistics;

/*
 * @author Aaron Iglesias
 */
public class SummonerStats extends Stats
{
	private int enchantment;
	private int boon;
	private int bane;
	private int staff;
	private int spellPower;

	public SummonerStats()
	{
		super();
		enchantment = 1;
		boon = 1;
		bane = 1;
		staff = 1;
		spellPower = 1;
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

	public int getEnchantment()
	{
		return enchantment;
	}

	public void setEnchanment(int enchantment)
	{
		if(enchantment < 0 || enchantment > 125)
			return;
		else
			this.enchantment = enchantment;
	}

	public void modBoon()
	{
		if(getSkillPoints() <= 0 || boon == 125)
			return;
		modSkillPoints(-1);
		++boon;
	}

	public int getBoon()
	{
		return boon;
	}

	public void setBoon(int boon)
	{
		if(boon < 0 || boon > 125)
			return;
		else
			this.boon = boon;
	}

	public void modBane()
	{
		if(getSkillPoints() <= 0 || bane == 125)
			return;
		modSkillPoints(-1);
		++bane;
	}

	public int getBane()
	{
		return bane;
	}

	public void setBane(int bane)
	{
		if(boon < 0 || boon > 125)
			return;
		else
			this.bane = bane;
	}

	public void modStaff()
	{
		if(getSkillPoints() <= 0 || staff == 125)
			return;
		modSkillPoints(-1);
		++staff;
	}

	public int getStaff()
	{
		return staff;
	}

	public void setStaff(int staff)
	{
		if(staff < 0 || staff > 125)
			return;
		else
			this.staff = bane;
	}

	@Override
	public void modIntellect(int n)
	{
		intellect = adjust(intellect + n);
		spellPower = spellPower + n;
	}


	@Override
	public void setIntellect(int intellect)
	{
		int difference = intellect - this.intellect;
		this.intellect = adjust(intellect);
		spellPower = spellPower + difference;
	}

	public int getSpellPower()
	{
		return spellPower;
	}

	public void modSpellPower(int n)
	{
		spellPower = adjust(spellPower + n);
	}
}