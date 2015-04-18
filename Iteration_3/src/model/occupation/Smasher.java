package model.occupation;

import model.ability.AbilityLibrary;
import model.statistics.Stats;
import utilities.SpriteSheetUtility;

public class Smasher extends Occupation {

	public Smasher(AbilityLibrary abilitylibrary, Stats stat) {
		super(abilitylibrary, stat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public SpriteSheetUtility getSpriteSheet() {
		return new SpriteSheetUtility(this);
}
	
}
