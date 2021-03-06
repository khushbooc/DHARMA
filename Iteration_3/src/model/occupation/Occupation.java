package model.occupation;


import utilities.SpriteSheetUtility;
import model.ability.AbilityLibrary;
import model.statistics.Stats;
import utilities.SpriteSheetUtility;

public abstract class Occupation {
	 protected AbilityLibrary abilitylibrary ;
	 protected Stats stat;
	 protected SpriteSheetUtility spritesheet;

	 public Occupation() {
		 this.abilitylibrary = getDefaultAbilityLibrary();
	 }

	 public Occupation (AbilityLibrary abilitylibrary, Stats stat)
	 {
		 this.abilitylibrary = abilitylibrary;
		 this.stat = stat;
	 }

    public AbilityLibrary getAbilityLibrary(){
		 return abilitylibrary;
	 }
	public Stats getStats(){
		 return stat;
	 }
	public abstract SpriteSheetUtility getSpriteSheet();
    public abstract AbilityLibrary getDefaultAbilityLibrary();

    public static Smasher smasherFactory() {
        return new Smasher();
    }

    public static Sneak sneakFactory() {
        return new Sneak();
    }

    public static Summoner summonerFactory() {
        return new Summoner();
    }
    
    public abstract String getOcc();
}
