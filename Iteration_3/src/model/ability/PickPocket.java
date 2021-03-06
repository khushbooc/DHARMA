package model.ability;

import model.entity.Entity;
import model.entity.Gold;
import model.statistics.SneakStats;
import model.statistics.Stats;

import java.util.ArrayList;

/*
 * @author Aaron Iglesias
 */
public class PickPocket extends RadialAbility {

    public PickPocket()
    {
        base = 10;
        cost = 1;
        levelRequirement = 1;
        name = "Pick Pocket";
        radius = 3;
        degree = 360;
    }

    public PickPocket(String name, int cost, int levelRequirement, int radius, int base, int degree)
    {
        super(name, cost, levelRequirement, radius, base, degree);
    }

    @Override
    public void use()
    {
        ArrayList<Entity> entityList = gameMap.getMapObjectList();
        SneakStats stats = (SneakStats) avatar.getOccupation().getStats();
        Stats entityStats;
        Gold gold = avatar.getGold();
        if(stats.getCurrentMana() - this.cost < 0)
            return;

        for(Entity entity : entityList) {

            if (!inRadius(entity) || avatar == entity)
                continue; // do nothing
            else // do damage
            {
                entityStats = entity.getOccupation().getStats();
                scaleEffect(entity);
                gold.increaseGoldCount(effect);
            }
        }
        return;
    }

    @Override
    protected void scaleEffect(Entity entity)
    {
        int critical;
        int avatarCrit, base, moneyStolen;
        double random, criticalBonus, defense, offense, modifier, level, skill;

        base = getBase();

        SneakStats stats = (SneakStats) avatar.getOccupation().getStats();
        Stats entityStats = entity.getOccupation().getStats();

        level = stats.getLevel();
        skill = stats.getPickPocket();
        avatarCrit = (int) Math.pow(2,stats.getCritical());

        random = (double) random(85,100) / 100;

        offense = stats.getAgility();
        defense = entityStats.getArmor();

        critical = random(1,16 / avatarCrit);
        if(critical == 1)
            criticalBonus = 1.5;
        else
            criticalBonus = 1;

        modifier = random * criticalBonus * (1 + 0.5 * skill / 125);

        moneyStolen = (int) Math.floor(((2 * level + 10) / 250 * offense/defense * base + 2) * modifier);

        setEffect(moneyStolen);
    }


}
