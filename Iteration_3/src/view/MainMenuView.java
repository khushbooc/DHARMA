package view;

import model.Game;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
//	private BufferedImage backgroundImage;

    public MainMenuView(){
        super();
        startGameButton = new NewGameButton("New Game", buttonFont);
        loadGameButton = new LoadGameButton("Load Game", buttonFont);
        quitGameButton = new ExitGameButton("Quit Game", buttonFont);


        title = new JLabel("The Melting Point");
        title.setFont(titleFont.deriveFont(80f));

        backGroundPanel = new ImagePanel("src/res/main_menu.gif");
        backGroundPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 800, 5));
        // Insets insets = backGroundPanel.getInsets();
        // Dimension size = backGroundPanel.getPreferredSize();

		/*JButton ghost = new JButton();
		ghost.setPreferredSize(new Dimension(10, 35));
		ghost.setContentAreaFilled(false);
		ghost.setBorderPainted(false);*/

        setPreferredSize(new Dimension(1280,800));
        setLayout(new BorderLayout());

        startGameButton.setMaximumSize(new Dimension(150,50));
        loadGameButton.setMaximumSize(new Dimension(150,50));
        quitGameButton.setMaximumSize(new Dimension(150,50));

        backGroundPanel.add(title);
        //backGroundPanel.add(ghost);

        backGroundPanel.add(startGameButton);
        backGroundPanel.add(loadGameButton);
        backGroundPanel.add(quitGameButton);

        add(backGroundPanel);

    }
    public void render(){
        System.out.println("I am in render");
        JFrame frame = new JFrame();
        frame.setFocusable(true);
        frame.setLayout(new FlowLayout());
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = frame.getContentPane();
        content.add(backGroundPanel,BorderLayout.CENTER);
        //frame.repaint();
        frame.pack();
        frame.setVisible(true);

    }
    private class NewGameButton extends JButton{

        public NewGameButton(String str, Font font){
            super();
            setForeground(Color.WHITE);
            setFont(font.deriveFont(40f));
            setContentAreaFilled(false);
            setBorderPainted(false);
        }
        public void activate(){

        }

    }
    private class LoadGameButton extends JButton{
        public LoadGameButton(String str, Font font){
            super();
            setForeground(Color.WHITE);
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

}
