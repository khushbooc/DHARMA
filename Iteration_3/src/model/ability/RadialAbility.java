package model.ability;
import model.entity.Entity;
import model.gameMap.Location;

/*
 * @author Aaron Iglesias
 */
public abstract class RadialAbility extends RadiusAbility
{
	protected int degree;

	public RadialAbility()
	{
		super();
		this.degree = 360;
	}

	public RadialAbility(String name, int cost, int levelRequirement, int radius, int base, int degree)
	{
		super(name, cost, levelRequirement, radius, base);
		this.degree = degree;
	}

	public int getDegree()
	{
		return degree;
	}

	public void setDegree(int degree)
	{
		this.degree = degree;
	}

	public abstract void use();

	protected abstract void scaleEffect(Entity avatar);
}