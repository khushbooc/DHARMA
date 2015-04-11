public abstract class LinearAbility extends Ability
{
	private int radius;

	public LinearAbility()
	{
		super();
		radius = 1;
	}

	public LinearAbility(String name, int cost, int levelRequirement, int radius)
	{
		super(name, cost, levelRequirement);
		this.radius = radius;
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