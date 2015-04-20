package model.ability;

/*
 * @author Aaron Iglesias
 */
public class SmasherLibrary extends AbilityLibrary
{
    public void SmasherLibrary()
    {
        Cleave cleave = new Cleave();
        RoundHouseSmash roundHouseSmash = new RoundHouseSmash();

        addAbility(roundHouseSmash, abilities);
        addAbility(cleave, abilities);
    }
}