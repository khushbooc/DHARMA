package model.ability;

import model.entity.Entity;
import model.statistics.Stats;
import model.statistics.SummonerStats;

import java.util.ArrayList;

/*
 * @author Aaron Iglesias
 */
public class ConeOfCold extends RadialAbility {

    public ConeOfCold()
    {
        base = 90;
        cost = 1;
        levelRequirement = 2;
        name = "Cone of Cold";
        radius = 3;
        degree = 90;
    }

    public ConeOfCold(String name, int cost, int levelRequirement, int radius, int base)
    {
        setName(name);
        setCost(cost);
        setLevelRequirement(levelRequirement);
        setRadius(radius);
        setBase(base);
    }

    @Override
    public void use()
    {
        ArrayList<Entity> entityList = gameMap.getMapObjectList();
        SummonerStats stats = (SummonerStats) avatar.getOccupation().getStats();
        Stats entityStats;
        if(stats.getCurrentMana() - this.cost < 0)
            return;

        for(Entity entity : entityList) {

            if (!inRadius(entity) || avatar == entity)
                continue; // do nothing
            else // do damage
            {
                entityStats = entity.getOccupation().getStats();
                scaleEffect(entity);
                entityStats.modCurrentHealth(-effect);
                entityStats.modCurrentMana(-cost);
            }
        }
        return;
    }

    @Override
    protected void scaleEffect(Entity entity)
    {
        int critical;
        int avatarCrit, base, damage;
        double random, criticalBonus, modifier, offense, defense, level, skill;

        base = getBase();

        SummonerStats stats = (SummonerStats) avatar.getOccupation().getStats();
        Stats entityStats = entity.getOccupation().getStats();

        level = stats.getLevel();
        offense = stats.getSpellPower();
        defense = entityStats.getArmor();
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
