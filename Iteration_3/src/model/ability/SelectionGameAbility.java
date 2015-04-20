package model.ability;

import model.entity.Cursor;

/**
 * Created by agemery on 4/20/15.
 */
public class SelectionGameAbility extends GameAbility {

    public SelectionGameAbility(Cursor owner) {
        super(owner);
    }

    public void use() {
        ((Cursor) owner).setSelected();
    }
}
