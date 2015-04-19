package model.ability;

import model.entity.Entity;
import model.statistics.Stats;

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
    public void use(Entity avatar)
    {
        if(avatar.getMana() - this.cost < 0)
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
        int base, damage;
        double avatarCrit, random, criticalBonus, modifier, offense, defense, level, skill;

        base = getBase();

        Stats stats = avatar.getOccupation().getStats();

        level = stats.getLevel();
        offense = stats.getBoon();
        defense = stats.getArmor();
        skill = stats.getBoon();
        avatarCrit = (int) Math.pow(2,avatar.getCritical());

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
