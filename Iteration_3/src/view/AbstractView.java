package view;

import controller.Controller;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.JLayeredPane;


@SuppressWarnings("serial")
public abstract class AbstractView extends JLayeredPane {

    private boolean redraw;
    protected View parent_view;

    public AbstractView(View view) {
        this.parent_view  = view;
        setRedraw(false);
        setBackground(Color.BLACK);
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        setFocusable(true);
        setVisible(true);
    }

    public void reset(){
        setRedraw(false);
    }
    public boolean getRedraw() {
        return redraw;
    }
    public void setRedraw(boolean redraw) {
        this.redraw = redraw;
    }
    public void setBackground(String s) {
        add(new ImagePanel(s));
    }


    public abstract void render();
    public abstract void addKeyListenerToCurrentView(Controller controller);
    public abstract void nextView();
    public abstract void prevView();
    public abstract void onSelection();
    public abstract void killWindow();
}

