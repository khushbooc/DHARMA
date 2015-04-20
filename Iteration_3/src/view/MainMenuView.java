package view;

import controller.Controller;
import model.Game;
import model.GameLogger;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;


@SuppressWarnings("serial")
public class MainMenuView extends AbstractView{
    private Font titleFont = new Font("serif", Font.PLAIN, 20);
    private Font buttonFont = new Font("serif", Font.PLAIN, 18);

    private JButton startGameButton;
    private JButton loadGameButton;
    private JButton quitGameButton;
    // private JLabel background;
    private JLabel title;
    private Game game;

    private JPanel backGroundPanel;
    private JFrame frame;

    private ArrayList<JLabel> labels;


    public MainMenuView(){
        super();
        frame = new JFrame();
        startGameButton = new NewGameButton("New Game", buttonFont);
        loadGameButton = new LoadGameButton("Load Game", buttonFont);
        quitGameButton = new ExitGameButton("Quit Game", buttonFont);


        title = new JLabel("DHARMA");
        title.setFont(titleFont.deriveFont(80f));
//        BufferedImage img = null;
//        try{
//            img = ImageIO.read(new File("src/res/main_menu.gif"));
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

        backGroundPanel = new ImagePanel("Iteration_3/src/res/main_menu.gif");
        backGroundPanel.setPreferredSize(new Dimension(600, 600));
        //backGroundPanel = new ImagePanel();
        backGroundPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 700, 5));


        startGameButton.setMaximumSize(new Dimension(150,50));
        loadGameButton.setMaximumSize(new Dimension(150,50));
        quitGameButton.setMaximumSize(new Dimension(150,50));


        backGroundPanel.add(title);
        backGroundPanel.add(startGameButton);

        backGroundPanel.add(loadGameButton);
//        backGroundPanel.add(quitGameButton);
        frame.setFocusable(true);
        frame.setResizable(true);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setPreferredSize(new Dimension(1280, 800));
        //Container content = frame.getContentPane();
        //content.add(backGroundPanel);
        frame.getContentPane().add(backGroundPanel);
        frame.pack();
    }
    public void render(){
        System.out.println("I am in render");
        frame.setVisible(true);
        frame.repaint();
    }

    private class NewGameButton extends JButton{

        public NewGameButton(String str, Font font){
            super(str);
            setForeground(Color.BLACK);
            setFont(font.deriveFont(40f));
            setContentAreaFilled(true);
            setBorderPainted(true);
        }
        public void activate(){

        }

    }
    private class LoadGameButton extends JButton{
        public LoadGameButton(String str, Font font){
            super();
            setForeground(Color.BLACK);
            setFont(font.deriveFont(40f));
            setContentAreaFilled(false);
            setBorderPainted(false);
        }
    }
    private class ExitGameButton extends JButton{
        public ExitGameButton(String str, Font font){
            super();
            setForeground(Color.WHITE);
            setFont(font.deriveFont(40f));
            setContentAreaFilled(false);
            setBorderPainted(false);
        }
    }

    public void highlightLabel(int y_toHighlight) {
        for(JLabel l : labels) {
            l.setForeground(Color.black);
        }
        labels.get(y_toHighlight).setForeground(Color.red);
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
