package model.occupation;

import model.ability.AbilityLibrary;
import model.ability.SummonerLibrary;
import model.statistics.Stats;
import model.statistics.SummonerStats;
import utilities.SpriteSheetUtility;

public class Summoner extends Occupation {

	public Summoner(){
		super();
        this.stat = new SummonerStats();
	}

    public Summoner(AbilityLibrary abilitylibrary, Stats stat) {
        super(abilitylibrary, stat);
        // TODO
    }
		
	
	public SpriteSheetUtility getSpriteSheet() {
		return new SpriteSheetUtility(this);
}

    public AbilityLibrary getDefaultAbilityLibrary() {
        return new SummonerLibrary();
    }
    public String getOcc(){
		return "Summoner";
	}

}
