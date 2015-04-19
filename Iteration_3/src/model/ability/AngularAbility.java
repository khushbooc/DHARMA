package model.ability;
import model.entity.Entity;

public abstract class AngularAbility extends RadiusAbility
{
	private int degree;

	public AngularAbility()
	{
		super();
		this.degree = 90;
	}

	public AngularAbility(String name, int cost, int levelRequirement, int radius, int base, int degree)
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

	public abstract void use(Entity avatar);

	public abstract void scaleEffect(Entity entity, Entity avatar);

	@Override
	public boolean inRadius(Entity avatar, Entity entity)
	{
//		Location aLx = avatar.getLocation().getX();
//		Location eLx = entity.getLocation().getX();
//
//		Location aLy = avatar.getLocation().getY();
//		Location eLy = entity.getLocation().getY();
//
//		boolean inRadius = Math.pow(eLx - aLx,2) + Math.pow(eLy - aLy, 2) <= Math.pow(radius,2);

//		if(inRadius)
//			return true;
//		else
//			return false;
		return true; //temporarily only
	}
}