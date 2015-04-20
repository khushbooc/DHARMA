package model.ability;

import model.entity.Entity;
import model.statistics.SummonerStats;

/**
 *
 * @author Aaron_Iglesias
 */
public class ManaTap extends SelfAbility
{
    public ManaTap()
    {
        name = "Mana Tap";
        base = 0;
        cost = 0;
        levelRequirement = 2;
        effect = 0;
    }

    public ManaTap(String name, int cost, int levelRequirement, int base, int effect)
    {
        super(name, cost, levelRequirement, base, effect);
    }

    @Override
    protected void scaleEffect()
    {
        int randNum;
        int avatarCrit, damage;
        double base, criticalBonus, modifier, skill;

        SummonerStats stats = (SummonerStats) avatar.getOccupation().getStats();

        skill = stats.getBoon();
        avatarCrit = (int) Math.pow(2,stats.getCritical());

        randNum = (int) random(1,16 / avatarCrit);

        if(randNum == 1)
            criticalBonus = 1.5;
        else
            criticalBonus = 1;

        modifier = criticalBonus * (1 + 0.5 * skill / 125);
        damage = (int) Math.floor((stats.getMaxMana() / 2) * modifier);

        setEffect(damage);
    }

    @Override
    public void use()
    {
        int cost = getCost();
        SummonerStats stats = (SummonerStats) avatar.getOccupation().getStats();
        cost = stats.getMaxMana() / 2;

        if(stats.getCurrentMana() < cost)
            return;

        else
        {
            scaleEffect();
            setCost((int) stats.getMaxMana() / 2);
            stats.modCurrentMana(-cost);
            stats.modCurrentHealth(effect);
        }
    }


}