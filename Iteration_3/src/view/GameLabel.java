package view;

import javax.swing.JLabel;
import java.awt.*;

/**
 * Created by agemery on 4/20/15.
 */

public abstract class GameLabel extends JLabel {
    protected AbstractView parent_view;

    public GameLabel(String str, AbstractView view) {
        super(str);
        this.parent_view = view;
    }

    public GameLabel(String str, Font font, AbstractView view) {
        this(str, view);
        this.setFont(font);
    }

    public abstract void onSelection();
}