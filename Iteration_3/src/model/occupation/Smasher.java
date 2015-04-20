package model.occupation;

import model.ability.AbilityLibrary;
import model.ability.SmasherLibrary;
import model.statistics.SmasherStats;
import utilities.SpriteSheetUtility;

public class Smasher extends Occupation {
	public Smasher() {
        super();
        this.stat = new SmasherStats();
		//super(this.abilitylibrary, this.stat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public SpriteSheetUtility getSpriteSheet() {
		return new SpriteSheetUtility(this);
}

    @Override
    public AbilityLibrary getDefaultAbilityLibrary() {
        return new SmasherLibrary();
    }

	
}
