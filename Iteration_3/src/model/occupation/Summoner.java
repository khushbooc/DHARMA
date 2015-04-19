package model.occupation;

import model.ability.AbilityLibrary;
import model.statistics.Stats;
import model.statistics.SummonerStats;
import utilities.SpriteSheetUtility;

public class Summoner extends Occupation {
	private SummonerLibrary summonerLibrary;
	private SummonerStats summonerStats;


    public Summoner(AbilityLibrary abilitylibrary, Stats stat) {
        super(abilitylibrary, stat);
        // TODO
    }
	public SpriteSheetUtility getSpriteSheet() {
		return new SpriteSheetUtility(this);
}

}
