package view;

import controller.Controller;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class CreateCharacterView extends AbstractView {
    private GameLabel backLabel;
    private GameLabel sneakLabel;
    private GameLabel smasherLabel;
    private GameLabel summonerLabel;
    private JLabel enterNameLabel;
    private JTextField enterNameField;
    private JLabel title;
    private JPanel backgroundPanel;
    private JFrame frame;

    private ArrayList<GameLabel> labels;
    private GameLabel selected;


    public CreateCharacterView(View view){
        super(view);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setFocusable(true);
        frame.setPreferredSize(new Dimension(1280, 800));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        backgroundPanel = new ImagePanel("Iteration_3/src/res/main_menu.gif");
        backgroundPanel.setPreferredSize(new Dimension(600, 600));
        Container content = frame.getContentPane();
        backgroundPanel.setLayout(new BorderLayout());
        content.add(backgroundPanel);


        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        topPanel.setPreferredSize(new Dimension(600, 100));
        title =  new JLabel("PICK YOUR AVATAR");
        title.setFont(new Font("serif", Font.PLAIN, 24).deriveFont(40f));
        topPanel.add(title);

        JPanel center = new JPanel();
        center.setLayout(new FlowLayout(FlowLayout.CENTER));
        center.setPreferredSize(new Dimension(600, 100));
        summonerLabel = new SummonerLabel("SUMMONER", this);
        summonerLabel.setFont(new Font("serif", Font.PLAIN, 24).deriveFont(40f));
        center.add(summonerLabel);

        JPanel west = new JPanel();
        west.setLayout(new FlowLayout(FlowLayout.CENTER));
        sneakLabel = new SneakLabel("SNEAK", this);
        sneakLabel.setFont(new Font("serif", Font.PLAIN, 24).deriveFont(40f));
        setForeground(Color.BLACK);
        west.add(sneakLabel);

        JPanel east = new JPanel();
        east.setLayout(new FlowLayout(FlowLayout.CENTER));
        smasherLabel = new SmasherLabel("SMASHER", this);
        smasherLabel.setFont(new Font("serif", Font.PLAIN, 24).deriveFont(40f));
        east.add(smasherLabel);

        JPanel bottom = new JPanel();
        bottom.setLayout(new FlowLayout(FlowLayout.CENTER));
        backLabel = new BackLabel("BACK", this);
        backLabel.setFont(new Font("serif", Font.PLAIN, 24).deriveFont(40f));
        bottom.add(backLabel);

        labels = new ArrayList<GameLabel>();
        labels.add(summonerLabel);
        labels.add(smasherLabel);
        labels.add(sneakLabel);
        labels.add(backLabel);

        backgroundPanel.add(topPanel, BorderLayout.PAGE_START);
        backgroundPanel.add(center, BorderLayout.CENTER);
        backgroundPanel.add(west, BorderLayout.LINE_START);
        backgroundPanel.add(east, BorderLayout.LINE_END);
        backgroundPanel.add(bottom, BorderLayout.PAGE_END);
        frame.pack();
    }

    private class SummonerLabel extends GameLabel {
        public SummonerLabel(String str, CreateCharacterView view) {
            super(str, view);
        }

        public void onSelection() {
            //TODO
        }
    }

    private class SneakLabel extends GameLabel {
        public SneakLabel(String str, CreateCharacterView view) {
            super(str, view);
        }

        public void onSelection() {
            //TODO
        }
    }

    private class SmasherLabel extends GameLabel {
        public SmasherLabel(String str, CreateCharacterView view) {
            super(str, view);
        }

        public void onSelection() {
            //TODO
        }
    }

    private class BackLabel extends GameLabel {
        public BackLabel(String str, CreateCharacterView view) {
            super(str, view);
        }

        public void onSelection() {
            //TODO
        }
    }

    public String avatarName(){
        return enterNameField.getText();
    }

    @Override
    public void render() {
        frame.setVisible(true);
    }

    @Override
    public void addKeyListenerToCurrentView(Controller controller) {
        frame.addKeyListener(controller);
        //backgroundPanel.addKeyListener(controller);
    }

    @Override
    public void highlightLabel(int x, int y) {
        for(JLabel l : labels) {
            l.setForeground(Color.black);
        }
        int x_length = 3;
        int y_length = 2;
        y = Math.abs(y)%y_length;
        x = Math.abs(x)%x_length;

        if(y == 1) {
            setSelected(labels.get(labels.indexOf(backLabel)));
        }
        else
            setSelected(labels.get(x));
    }

    private void setSelected(GameLabel selected) {
        selected.setForeground(Color.red);
        this.selected =  selected;
    }

    @Override
    public void onSelection() {
        //TODO
    }

    @Override
    public void killWindow() {
        //TODO
    }
}
