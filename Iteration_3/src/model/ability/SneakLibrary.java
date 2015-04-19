package model.ability;

public class SneakLibrary extends AbilityLibrary
{
    public void SneakLibrary()
    {
        DetectRemoveTrap detectRemoveTrap = new DetectRemoveTrap();

        addAbility(detectRemoveTrap, abilities);
        addAbility(detectRemoveTrap, learnedAbilities);
    }
}