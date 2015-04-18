package model.occupation;

import model.ability.AbilityLibrary;
import utilities.SpriteSheetUtility;
import model.statistics.Stats;

public class Sneak extends Occupation {

    public Sneak(AbilityLibrary abilityLibrary, Stats stats) {
        //TODO
        super(abilityLibrary, stats);
    }

	public SpriteSheetUtility getSpriteSheet() {
		return new SpriteSheetUtility(this);
	}

}
