package model.ability;

public class SneakLibrary extends AbilityLibrary
{
    public void SneakLibrary()
    {
        ConeOfCold coneOfCold = new ConeOfCold();
        FireNova fireNova = new FireNova();
        Frostbolt frostbolt = new Frostbolt();
        ManaTap manaTap = new ManaTap();

        addAbility(coneOfCold, abilities);
        addAbility(fireNova, abilities);
        addAbility(frostbolt, abilities);
        addAbility(manaTap, abilities);
    }
}