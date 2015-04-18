package model.occupation;

import model.ability.AbilityLibrary;
import model.statistics.Stats;
import utilities.SpriteSheetUtility;

public class Sneak extends Occupation {
	private AbilityLibrary abl;
	private Stats stat;

	public Sneak(){
		
	}
	public SpriteSheetUtility getSpriteSheet() {
		return new SpriteSheetUtility(this);
	}

}
