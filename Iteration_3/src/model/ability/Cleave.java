package model.ability;

import model.entity.Entity;
import model.statistics.SmasherStats;
import model.statistics.Stats;
import model.statistics.SummonerStats;

public class Cleave extends RadialAbility {

    public Cleave()
    {
        base = 110;
        cost = 3;
        levelRequirement = 2;
        name = "Cleave";
        radius = 2;
        degree = 120;
    }

    public Cleave(String name, int cost, int levelRequirement, int radius, int base)
    {
        setName(name);
        setCost(cost);
        setLevelRequirement(levelRequirement);
        setRadius(radius);
        setBase(base);
    }

    @Override
    public void use(Entity avatar)
    {
//        SmasherStats stats = (SmasherStats) avatar.getOccupation().getStats();
//        Stats entityStats;
//        if(stats.getCurrentMana() - this.cost < 0)
//            return;
//
//        // for(all entities on map)
//        if(!inRadius(avatar, entity) || avatar == entity)
//            continue; // do nothing
//        else // do damage
//        {
//            entityStats = entity.getOccupation().getStats();
//            scaleEffect(avatar, entity);
//            entityStats.modCurrentHealth(-effect);
//            entityStats.modCurrentMana(-cost);
//        }
        return;
    }

    @Override
    public void scaleEffect(Entity avatar, Entity entity)
    {
        int critical;
        int avatarCrit, base, damage;
        double random, criticalBonus, modifier, offense, defense, level, skill;

        base = getBase();

        SmasherStats stats = (SmasherStats) avatar.getOccupation().getStats();

        level = stats.getLevel();
        offense = stats.getOffense();
        defense = stats.getArmor();
        skill = stats.getTwoHandedWeapon(); // fix this later
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

    @Override
    public void activate()
    {
        return;
    }
}
