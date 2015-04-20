package view;

import controller.Controller;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class CreateCharacterView extends AbstractView {
    private JLabel backLabel;
    private JLabel sneakLabel;
    private JLabel smasherLabel;
    private JLabel summonerLabel;
    private JLabel enterNameLabel;
    private JTextField enterNameField;
    private JLabel title;
    private JPanel backgroundPanel;
    private JFrame frame;


    public CreateCharacterView(View view){
        super(view);
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setFocusable(true);
        frame.setPreferredSize(new Dimension(1280, 800));
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));

        backgroundPanel = new ImagePanel("src/res/main_menu.gif");
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
        summonerLabel = new JLabel("SUMMONER");
        summonerLabel.setFont(new Font("serif", Font.PLAIN, 24).deriveFont(40f));
        center.add(summonerLabel);

        JPanel west = new JPanel();
        west.setLayout(new FlowLayout(FlowLayout.CENTER));
        sneakLabel = new JLabel("SNEAK");
        sneakLabel.setFont(new Font("serif", Font.PLAIN, 24).deriveFont(40f));
        setForeground(Color.BLACK);
        west.add(sneakLabel);

        JPanel east = new JPanel();
        east.setLayout(new FlowLayout(FlowLayout.CENTER));
        smasherLabel = new JLabel("SMASHER");
        smasherLabel.setFont(new Font("serif", Font.PLAIN, 24).deriveFont(40f));
        east.add(smasherLabel);

        JPanel bottom = new JPanel();
        bottom.setLayout(new FlowLayout(FlowLayout.CENTER));
        backLabel = new JLabel("BACK");
        backLabel.setFont(new Font("serif", Font.PLAIN, 24).deriveFont(40f));
        bottom.add(backLabel);

        backgroundPanel.add(topPanel, BorderLayout.PAGE_START);
        backgroundPanel.add(center, BorderLayout.CENTER);
        backgroundPanel.add(west, BorderLayout.LINE_START);
        backgroundPanel.add(east, BorderLayout.LINE_END);
        backgroundPanel.add(bottom, BorderLayout.PAGE_END);
        frame.pack();
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
        //TODO
    }

    @Override
    public void nextView() {
        //TODO
    }

    @Override
    public void prevView() {
        //TODO
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
