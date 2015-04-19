package model.statistics;
public class SmasherStats extends Stats
{
	private int oneHandedWeapon;
	private int twoHandedWeapon;
	private int brawling;

	public SmasherStats()
	{
		super();
		oneHandedWeapon = 1;
		twoHandedWeapon = 1;
		brawling = 1;
	}

	@Override
	public void levelUp()
	{
		modLives(1);
		modStrength(4);
		modAgility(3);
		modIntellect(3);
		modHardiness(3);
		modMovement(3);
		modSkillPoints(5);
	}

	public void modOneHandedWeapon()
	{
		if(getSkillPoints() <= 0 || oneHandedWeapon == 125)
			return;
		modSkillPoints(-1);
		++oneHandedWeapon;
	}

	public int getOneHandedWeapon()
	{
		return oneHandedWeapon;
	}

	public void modTwoHandedWeapon()
	{
		if(getSkillPoints() <= 0 || twoHandedWeapon == 125)
			return;
		modSkillPoints(-1);
		++twoHandedWeapon;
	}

	public int getTwoHandedWeapon()
	{
		return twoHandedWeapon;
	}

	public void modBrawling()
	{
		if(getSkillPoints() <= 0 || brawling == 125)
			return;
		modSkillPoints(-1);
		++brawling;
	}

	public int getBrawling()
	{
		return brawling;
	}
}