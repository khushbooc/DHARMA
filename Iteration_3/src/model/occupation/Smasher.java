package model.occupation;

import model.ability.AbilityLibrary;
import model.statistics.SmasherStats;
import model.statistics.Stats;
import utilities.SpriteSheetUtility;

public class Smasher extends Occupation {
	private SmasherLibrary smasherLibrary;
	private SmasherStats smasherStats;

	public Smasher() {
		//super(this.abilitylibrary, this.stat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public SpriteSheetUtility getSpriteSheet() {
		return new SpriteSheetUtility(this);
}
	
}
