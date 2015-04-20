package model.ability;
import model.entity.Entity;

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
	
	@Override
	protected boolean inRadius(Entity entity)
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