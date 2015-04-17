package model.gameMap;

/**
 * Created by giangnguyen on 4/16/15.
 */
public class HealDamage extends AreaEffect {

    public HealDamage(String name){
        super(name);
    }

    @Override
    public void applyEffect(Entity e){
        //TODO: apply effect when other class is ready
    }
    public String getName(){
        return name;
    }
}
