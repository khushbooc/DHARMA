// mainly for testing combat code, not an actualy class we will use.

import java.util.Random;
import java.lang.*;

public class DamageController
{
	public static void main(String[] args)
	{
		int damage;
		for(int i = 0; i < 100; ++i)
		{
			damage = damage();
			System.out.println(damage);
		}
	}

	public static int damage()
	{
		int critical;
		int damage;
		double base, random, criticalStrike, modifier, offense, defense, level, skill;

		level = 100;
		offense = 450;
		defense = 300;
		base = 90;
		skill = 50;

		random = (double) random(85,100) / 100;
		critical = random(1,16);

		if(critical == 1)
			criticalStrike = 1.5;
		else
			criticalStrike = 1;

		modifier = random * criticalStrike * (1 + 0.5 * skill/125);
		damage = (int) Math.floor(((2 * level + 10) / 250 * offense / defense * base + 2) * modifier);

		return damage;
	}

	public static int random(int min, int max)
	{
		Random random = new Random();
		int randomNumber = random.nextInt(max - min + 1) + min;

		return randomNumber;
	}
}