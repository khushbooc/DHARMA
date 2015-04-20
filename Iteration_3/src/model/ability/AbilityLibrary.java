package model.ability;

import model.ability.Ability;
import model.entity.Entity;

import java.util.ArrayList;
/*
 * @author Aaron Iglesias
 */
public abstract class AbilityLibrary {
    protected ArrayList<Ability> learnedAbilities;
    protected ArrayList<Ability> abilities;

    public AbilityLibrary()
    {
        Attack attack = new Attack();
        addAbility(attack, abilities);
        addAbility(attack, learnedAbilities);
    }

    public void addAbility(Ability ability, ArrayList<Ability> list)
    {
        list.add(ability);
    }

    public void removeAbility(Ability ability, ArrayList<Ability> list)
    {
        learnedAbilities.remove(ability);
    }

    public void update(Entity avatar)
    {
        int level = avatar.getOccupation().getStats().getLevel();

        for(int i = 0; i < abilities.size(); ++i)
        {
            if(abilities.get(i).getLevelRequirement() == level)
                learnedAbilities.add(abilities.get(i));
        }
    }

    public ArrayList<Ability> getAllAbilities() {
        ArrayList<Ability> abilitiez = new ArrayList<Ability>();
        abilitiez.addAll(abilities);
        abilitiez.addAll(learnedAbilities);
        return abilitiez;
    }
}
