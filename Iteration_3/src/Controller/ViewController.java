package Controller;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import model.entity.Avatar;
import model.gameMap.GameMap;
// All controllers to be created over here and this is the main controller class
public class ViewController {
	private MainMenuController mmc;
	private CreateCharacterController ccc;
	private MapViewController  mvc;
	private GameMap map;
	private JFrame mainFrame;
	public ViewController(){
		
		mainFrame=new JFrame("Hex Board");
		map=new GameMap(mainFrame);
		mainFrame.pack();
		mainFrame.setSize( GameMap.VIEWPORT_SIZE_X, GameMap.VIEWPORT_SIZE_Y);
		mainFrame.setResizable(false);
		//frame.setLocationRelativeTo( null );
		mainFrame.setVisible(true);
		
		mainFrame.setFocusable(true);
		mainFrame.setLayout(new FlowLayout());
        //frame.setExtendedState(Frame.MAXIMIZED_BOTH);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.repaint();
		mvc=new MapViewController(map,mainFrame);
		
	}

}
