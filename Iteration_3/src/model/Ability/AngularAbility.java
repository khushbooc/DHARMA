package model.ability;
public abstract class AngularAbility extends Ability
{
	private int degree;

	public AngularAbility()
	{
		super();
		degree = 90;
//		radius = 1; commemented out to avoid compile error
	}

	public AngularAbility(String name, int cost, int levelRequirement, int degree, int radius)
	{
		super(name, cost, levelRequirement, radius);
		this.degree = degree;
//		this.radius = radius;
	}

	public int getDegree()
	{
		return degree;
	}

	public void setDegree(int degree)
	{
		this.degree = degree;
	}

	public abstract boolean use();
}