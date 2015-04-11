package model;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.event.*; 
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
 
 
public class GameMap
{
  private GameMap() {
		initGame();
		createAndShowGUI();
	}
 
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable() {
				public void run() {
				new GameMap();
				}
				});
	}
 
	final static Color COLOURBACK =  Color.WHITE;
	final static Color COLOURCELL =  Color.CYAN;	 
	final static Color COLOURGRID =  Color.BLACK;	 
	final static Color COLOURONE = new Color(255,255,255,200);
	final static Color COLOURONETXT = Color.BLUE;
	final static Color COLOURTWO = new Color(0,0,0,200);
	final static Color COLOURTWOTXT = new Color(255,100,255);
	final static int EMPTY = 0;
	final static int BSIZE = 15; //board size.
	final static int HEXSIZE = 80;	//hex size in pixels
	final static int BORDERS = 10;  
	final static int SCRSIZE = HEXSIZE * (BSIZE + 1) + BORDERS*3; //screen size (vertical dimension).
 
	int[][] board = new int[BSIZE][BSIZE];
	private BufferedImage stone;
	 Tile[][] map;
 
	void initGame(){
		
 
		GameMech.setXYasVertex(false); //RECOMMENDED: leave this as FALSE.
 
		GameMech.setHeight(HEXSIZE); //Either setHeight or setSize must be run to initialize the hex
		GameMech.setBorders(BORDERS);
 
		for (int i=0;i<BSIZE;i++) {
			for (int j=0;j<BSIZE;j++) {
				board[i][j]=EMPTY;
			}
		}
		try {
		    stone = ImageIO.read(new File("src/res/Geomorph.png"));
		} catch (IOException e) {
			System.out.println(e);
		}
		//set up board here
		//board[3][3] =(int)'A' ;
		//board[4][3] = (int)'Q';
		//board[4][4] = -(int)'B';
	}
 
	private void createAndShowGUI()
	{
		DrawingPanel panel = new DrawingPanel();
 
 
		//JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Hex Testing 4");
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		Container content = frame.getContentPane();
		content.add(panel);
		
		
		frame.setSize( (int)(SCRSIZE/1.23), SCRSIZE);
		frame.setResizable(false);
		frame.setLocationRelativeTo( null );
		frame.setVisible(true);
	}
 
 
	@SuppressWarnings("serial")
	class DrawingPanel extends JPanel
	{		
		
 
		public DrawingPanel()
		{	
			setBackground(COLOURBACK);
 
		
		}
 
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D)g;
			g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
			super.paintComponent(g2);
			//draw grid
			for (int i=0;i<BSIZE;i++) {
				for (int j=0;j<BSIZE;j++) {
					GameMech.drawHex(i,j,g2);
				}
			}
			
			for (int i=0;i<BSIZE;i++) {
				for (int j=0;j<BSIZE;j++) {					
					GameMech.fillHex(i,j,board[i][j],g2);
				}
			}
 

		}
 
	
	}
}