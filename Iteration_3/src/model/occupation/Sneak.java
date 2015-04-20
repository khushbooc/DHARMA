package model.occupation;

import model.ability.*;
import model.statistics.SneakStats;
import model.statistics.Stats;
import utilities.SpriteSheetUtility;

public class Sneak extends Occupation {
	public Sneak(){
        super();
        this.stat = new SneakStats();
	}

    public Sneak(AbilityLibrary abilityLibrary, Stats stats) {
        super(abilityLibrary, stats);
    }
	public SpriteSheetUtility getSpriteSheet() {
		return new SpriteSheetUtility(this);
	}

    @Override
    public AbilityLibrary getDefaultAbilityLibrary() {
        return new SneakLibrary();
    }
    public String getOcc(){
		return "Sneak";
	}
}
