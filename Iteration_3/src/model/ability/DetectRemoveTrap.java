package model.ability;

import model.entity.Entity;
import model.occupation.Summoner;
import model.statistics.SneakStats;
import model.statistics.Stats;
import model.statistics.SummonerStats;

public class DetectRemoveTrap extends RadialAbility {

    public DetectRemoveTrap()
    {
        base = 0;
        cost = 1;
        levelRequirement = 1;
        name = "Detect and Remove Trap";
        radius = 4;
        degree = 360;
    }

    public DetectRemoveTrap(String name, int cost, int levelRequirement, int radius, int base, int degree)
    {
        super(name, cost, levelRequirement, radius, base, degree);
    }

    @Override
    public void use(Entity avatar)
    {
        SneakStats stats = (SneakStats) avatar.getOccupation().getStats();
        if(stats.getCurrentMana() - this.cost < 0)
            return;

        // for(all entities on map)
        if(!inRadius(avatar, entity) || avatar == entity)
            continue; // do nothing
        else // do damage
        {
            scaleEffect(avatar, entity);
            entity.modHealth(-effect);
            entity.modMana(-cost);
        }
    }

    @Override
    public void scaleEffect(Entity avatar, Entity entity)
    {
        int critical;
        int avatarCrit, base, damage;
        double random, criticalBonus, modifier, offense, defense, level, skill;

        base = getBase();

        SummonerStats stats = (SummonerStats) avatar.getOccupation().getStats();

        level = stats.getLevel();
        offense = stats.getBoon();
        defense = stats.getArmor();
        skill = stats.getBoon();
        avatarCrit = (int) Math.pow(2,stats.getCritical());

        random = (double) random(85,100) / 100;
        critical = (int) random(1,16 / avatarCrit);
        if(critical == 1)
            criticalBonus = 1.5;
        else
            criticalBonus = 1;

        modifier = random * criticalBonus * (1 + 0.5 * skill / 125);

        damage = (int) Math.floor(((2 * level + 10) / 250 * offense / defense * base + 2) * modifier);

        setEffect(damage);
    }

}
