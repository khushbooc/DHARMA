package model.occupation;

import model.ability.AbilityLibrary;
import model.statistics.Stats;
import utilities.SpriteSheetUtility;

public class Summoner extends Occupation {
	public SpriteSheetUtility getSpriteSheet() {
		return new SpriteSheetUtility(this);
}

    public Summoner(AbilityLibrary abilitylibrary, Stats stat) {
        super(abilitylibrary, stat);
        // TODO
    }
}
