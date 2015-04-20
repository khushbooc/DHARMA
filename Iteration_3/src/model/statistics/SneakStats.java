package model.statistics;

/*
 * @author Aaron Iglesias
 */
public class SneakStats extends Stats
{
	private int pickPocket;
	private int detectRemoveTrap;
	private int creep;
	private int rangedWeapon;

	public SneakStats()
	{
		super();
		pickPocket = 1;
		detectRemoveTrap = 1;
		creep = 1;
		rangedWeapon = 1;
	}

	@Override
	public void levelUp()
	{
		modLevel(1);
		modStrength(3);
		modAgility(4);
		modIntellect(3);
		modHardiness(3);
		modMovement(3);
		modSkillPoints(5);
	}

	public void modPickPocket()
	{
		if(getSkillPoints() <= 0 || pickPocket == 125)
			return;
		modSkillPoints(-1);
		++pickPocket;
	}

	public int getPickPocket()
	{
		return pickPocket;
	}

	public void modDetectRemoveTrap()
	{
		if(getSkillPoints() <= 0 || detectRemoveTrap == 125)
			return;
		modSkillPoints(-1);
		++detectRemoveTrap;
	}

	public int getDetectRemoveTrap()
	{
		return detectRemoveTrap;
	}

	public void modCreep()
    {
		if(getSkillPoints() <= 0 || creep == 125)
			return;
		modSkillPoints(-1);
		++creep;
	}

	public int getCreep()
	{
		return creep;
	}

	public void modRangedWeapon()
	{
		if(getSkillPoints() <= 0 || rangedWeapon == 125)
			return;
		modSkillPoints(-1);
		++rangedWeapon;
	}

	public int getRangedWeapon()
	{
		return rangedWeapon;
	}
}