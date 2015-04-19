import model.ability.Ability;
import model.entity.Entity;

import java.util.ArrayList;
import java.util.List;
/*
 * @author Aaron Iglesias
 */
public abstract class AbilityLibrary {
    private ArrayList<Ability> learnedAbilities;
    private ArrayList<Ability> unlearnedAbilities;

    private Entity avatar;

    public AbilityLibrary(Entity myEntity){
        learnedAbilities = new ArrayList<Ability>();
        unlearnedAbilities = new ArrayList<Ability>();
        Entity owner = myEntity;
        this.addToLibrary(new BasicAttack());
        this.addToLibrary(new HealAbility());
    }

    protected void addAbility(Ability ability){
        learnedAbilities.add(ability);
        unlearnedAbilities.remove(ability);
    }

    protected void addToLibrary(Ability ability){
        learnedAbilities.add(ability);
    }

    protected boolean removeFromLibrary(Ability ability){
        return (learnedAbilities.remove(ability) || unlearnedAbilities.remove(ability));
    }

    public boolean hasAbility(String abilityName){
        for(Ability s : learnedAbilities) {
            if (abilityName.equals(s.getName())) {
                return true;
            }
        }
        return false;
    }
    
    public boolean use(Ability ability, Entity avatar){
        for(Ability a : learnedAbilities) {
            if (a == ability) {
                a.use(avatar);
                return true;
            }
        }
        return false;
    }

    public void update(){
        for (Ability ability : unlearnedAbilities){
            if (ability.meetsStatRequirements(owner)){
                addAbility(ability);
            }
        }
    }

    public boolean performActiveAbility(int position, Entity callingEntity){
        position = position -1;
        if(position >= learnedAbilities.size())
            return false;
        learnedAbilities.get(position).performAbility(callingEntity);
        return true;
    }

    public List<Ability> getAbilities() {
        return this.learnedAbilities;
    }
}
