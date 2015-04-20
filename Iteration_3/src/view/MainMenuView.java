package view;

import controller.Controller;
import model.Game;
import model.GameLogger;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;


@SuppressWarnings("serial")
public class MainMenuView extends AbstractView{
    private Font titleFont = new Font("serif", Font.PLAIN, 20);
    private Font buttonFont = new Font("serif", Font.PLAIN, 18);

    private JLabel startGameLabel;
    private JLabel loadGameLabel;
    private JLabel quitGameLabel;
    // private JLabel background;
    private JLabel title;
    private Game game;

    private JPanel backGroundPanel;
    private JFrame frame;

    private ArrayList<JLabel> labels;


    public MainMenuView(){
        super();
        frame = new JFrame();
        startGameLabel = new NewGameLabel("New Game", buttonFont);
        loadGameLabel = new LoadGameLabel("Load Game", buttonFont);
        quitGameLabel = new ExitGameLabel("Quit Game", buttonFont);


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

        labels = new ArrayList<JLabel>();
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
    private class NewGameLabel extends JLabel{

        public NewGameLabel(String str, Font font){
            super(str);
            setForeground(Color.BLACK);
            setFont(font.deriveFont(40f));

        }
        public void activate(){

        }

    }
    private class LoadGameLabel extends JLabel{
        public LoadGameLabel(String str, Font font){
            super(str);
            setForeground(Color.BLACK);
            setFont(font.deriveFont(40f));
        }
    }
    private class ExitGameLabel extends JLabel{
        public ExitGameLabel(String str, Font font){
            super(str);
            setForeground(Color.BLACK);
            setFont(font.deriveFont(40f));
        }
    }

    public void highlightLabel(int y_toHighlight) {
        for(JLabel l : labels) {
            l.setForeground(Color.black);
        }
        int length = labels.size();
        //GameLogger.getInstance().logMessage("length is " + length);
        //GameLogger.getInstance().logMessage("y is " + y_toHighlight);
        labels.get(y_toHighlight%length).setForeground(Color.red);
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

    @Override
    public void nextView() {
        //advance to avatar selection
    }

    @Override
    public void prevView() {
        //go back duh
    }

}
