package view;

import controller.Controller;
import model.GameLogger;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


@SuppressWarnings("serial")
public class MainMenuView extends AbstractView{
    private Font titleFont = new Font("serif", Font.PLAIN, 20);
    private Font buttonFont = new Font("serif", Font.PLAIN, 18);

    private GameLabel startGameLabel;
    private GameLabel loadGameLabel;
    private GameLabel quitGameLabel;
    private GameLabel currentSelection;
    // private JLabel background;
    private JLabel title;


    private JPanel backGroundPanel;
    private JFrame frame;

    private ArrayList<GameLabel> labels;


    public MainMenuView(View parent_view){
        super(parent_view);
        frame = new JFrame();
        startGameLabel = new NewGameLabel("New Game", buttonFont, this);
        loadGameLabel = new LoadGameLabel("Load Game", buttonFont, this);
        quitGameLabel = new ExitGameLabel("Quit Game", buttonFont, this);


        title = new JLabel("DHARMA");
        title.setFont(titleFont.deriveFont(80f));

        backGroundPanel = new ImagePanel("Iteration_3/src/res/main_menu.gif");
        backGroundPanel.setPreferredSize(new Dimension(600, 600));
        backGroundPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 700, 5));
        frame.setFocusable(true);
        frame.setResizable(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER) );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1280, 800));
        startGameLabel.setMaximumSize(new Dimension(150,50));
        loadGameLabel.setMaximumSize(new Dimension(150,50));
        quitGameLabel.setMaximumSize(new Dimension(150,50));

        labels = new ArrayList<GameLabel>();
        labels.add(startGameLabel);
        labels.add(loadGameLabel);
        labels.add(quitGameLabel);

        backGroundPanel.add(title);
        backGroundPanel.add(startGameLabel);
        backGroundPanel.add(loadGameLabel);
        backGroundPanel.add(quitGameLabel);
        frame.getContentPane().add(backGroundPanel);
        frame.pack();
    }
    public void render(){
        frame.setVisible(true);
        frame.repaint();
    }

    protected class NewGameLabel extends GameLabel{

        public NewGameLabel(String str, Font font, MainMenuView parent_view){
            super(str, parent_view);
            setForeground(Color.BLACK);
            setFont(font.deriveFont(40f));

        }
        public void onSelection(){
            ((MainMenuView) parent_view).advanceToAvatarCreation();
        }

    }
    protected class LoadGameLabel extends GameLabel{
        public LoadGameLabel(String str, Font font, MainMenuView parent_view){
            super(str, parent_view);
            setForeground(Color.BLACK);
            setFont(font.deriveFont(40f));
        }

        public void onSelection() {
            //TODO
        }
    }
    protected class ExitGameLabel extends GameLabel{
        public ExitGameLabel(String str, Font font, MainMenuView parent_view){
            super(str, parent_view);
            setForeground(Color.BLACK);
            setFont(font.deriveFont(40f));
        }

        public void onSelection() {
            ((MainMenuView) parent_view).exitGame();
        }

    }

    public void highlightLabel(int x, int y_toHighlight) {
        for(JLabel l : labels) {
            l.setForeground(Color.black);
        }
        int length = labels.size();
        //GameLogger.getInstance().logMessage("length is " + length);
        //GameLogger.getInstance().logMessage("y is " + y_toHighlight);
        if(y_toHighlight < 0)
            //getting the highlighter to wrap properly
            y_toHighlight = Math.abs(Math.abs(y_toHighlight) - length);

        setSelected(labels.get(y_toHighlight % length));
    }

    private void setSelected(GameLabel select) {
        select.setForeground(Color.red);
        this.currentSelection = select;
    }


    public void addKeyListenerToCurrentView(Controller controller) {
        frame.addKeyListener(controller);
        backGroundPanel.addKeyListener(controller);
        //content.setFocusable(true);
        //content.addKeyListener(controller);
        /*startGameButton.addKeyListener(controller);
        loadGameButton.addKeyListener(controller);
        quitGameButton.addKeyListener(controller);*/
        GameLogger.getInstance().logMessage("added controller to the views");
    }

    private void advanceToAvatarCreation() {
        parent_view.advanceViewState(new CreateCharacterView(parent_view));
    }

    private void exitGame() {
        parent_view.exitGame();
    }


    @Override
    public void onSelection() {
        this.currentSelection.onSelection();
    }

    @Override
    public void killWindow() {
        this.frame.dispose();
    }

}
