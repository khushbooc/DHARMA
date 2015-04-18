package model.occupation;

import model.ability.AbilityLibrary;
import model.statistics.Stats;
import utilities.SpriteSheetUtility;

public class Summoner extends Occupation {
	private AbilityLibrary abl;
	private Stats stat;

	
	public Summoner()
	{
		
	}
	public SpriteSheetUtility getSpriteSheet() {
		return new SpriteSheetUtility(this);
}
}
