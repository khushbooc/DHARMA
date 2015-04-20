package model.ability;

/*
 * @author Aaron Iglesias
 */
public class SneakLibrary extends AbilityLibrary
{
    public void SneakLibrary()
    {
        DetectRemoveTrap detectRemoveTrap = new DetectRemoveTrap();
        PickPocket pickPocket = new PickPocket();

        addAbility(detectRemoveTrap, abilities);
        addAbility(detectRemoveTrap, learnedAbilities);

        addAbility(pickPocket, abilities);
        addAbility(pickPocket, learnedAbilities);
    }
}