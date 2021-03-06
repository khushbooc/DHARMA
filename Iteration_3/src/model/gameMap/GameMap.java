package model.gameMap;
import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.Position.Bias;

import model.entity.Avatar;
import model.inventory.Head;
import utilities.ImageProcessing;
import utilities.ShapeAdjust;
import utilities.SpriteSheetUtility;
import view.InventoryPanel;
import view.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class GameMap extends View
{

    private DrawingPanel panel;
    private InventoryPanel inventoryPanel;
    private Avatar avatar;
    private JFrame frame;
    private int min_x=3;
    private int min_y=3;
    private int max_x=3;
    private int max_y=3;
    private ArrayList<MapObject> mapObjectList;
    //private Terrain[][] terrain;

    public GameMap(Avatar avatar,JFrame frame) {
        this.avatar=avatar;
        this.frame=frame;
        initGame();
        createAndShowGUI();
        for(MapObject mapObject : mapObjectList) {
            mapObject.setGameMap(this);
        }
    }

    public ArrayList getMapObjectList()
    {
        return mapObjectList;
    }

//	public static void main(String[] args)
//	{
//		SwingUtilities.invokeLater(new Runnable() {
//				public void run() {
//				new gameMap();
//				}
//				});
//	}

    final static Color COLOURBACK =  Color.WHITE;
    final static Color COLOURCELL =  Color.CYAN;
    final static Color COLOURGRID =  Color.BLACK;
    final static Color COLOURONE = new Color(255,255,255,200);
    final static Color COLOURONETXT = Color.BLUE;
    final static Color COLOURTWO = new Color(0,0,0,200);
    final static Color COLOURTWOTXT = new Color(255,100,255);
    final static int EMPTY = 0;
    final static int BSIZE = 30; //board size.
    final static int HEXSIZE = 80;	//hex size in pixels
    final static int BORDERS = 10;
    //final static int SCRSIZE = HEXSIZE * (BSIZE + 1) + BORDERS*3; //screen size (vertical dimension).
    public final static int WORLD_SIZE_X=1600;
    public final static int WORLD_SIZE_Y=700;
    public final static int VIEWPORT_SIZE_X=800;
    public final static int VIEWPORT_SIZE_Y=600;
    //int[][] board = new int[BSIZE][BSIZE];
    private BufferedImage stone;
    private BufferedImage grass;
    private BufferedImage mountain;
    private BufferedImage river;
    Tile[][] map=new Tile[BSIZE][BSIZE];

    void initGame(){
        //stone= ImageIO.read(new File("src/res/stone.png"));
        try {
            grass = ImageIO.read(new File("src/res/grass.png"));
            mountain = ImageIO.read(new File("src/res/custom_mountain.png"));
            // stone = ImageIO.read(new File("src/res/stone.png"));
        } catch (IOException e) {
            System.out.println(e);
        }
        //terrain =new Terrain[BSIZE][BSIZE];

        GameMech.setXYasVertex(false); //RECOMMENDED: leave this as FALSE.

        GameMech.setHeight(HEXSIZE); //Either setHeight or setSize must be run to initialize the hex
        GameMech.setBorders(BORDERS);

        //frame = new JFrame("Hex Testing 4");
        try {
            stone= ImageIO.read(new File("src/res/stone.png"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //set up board here
        //board[3][3] =(int)'A' ;
        //board[4][3] = (int)'Q';
        //board[4][4] = -(int)'B';
    }

    public void createAndShowGUI()
    {
        for (int i=0;i<BSIZE;i++) {
            for (int j=0;j<BSIZE;j++) {
                //board[i][j]=EMPTY;
                Location loc=new Location(i,j);
                if(i>=min_x && j>=min_y){

                    //terrain[i][j] = new Grass("Grass",grass);
                    map[i][j]=new Tile(loc, new Grass("Grass",grass));
                }
                else{
                    //terrain[i][j] = new Mountain("Mountain",mountain);
                    map[i][j]=new Tile(loc,new Mountain("Mountain",mountain));
                }
            }
        }

        panel = new DrawingPanel();
        inventoryPanel = new InventoryPanel();
        inventoryPanel.setPreferredSize(new Dimension(200, 300));
        //JFrame.setDefaultLookAndFeelDecorated(true);


        //frame.getContentPane().setLayout(null);
        Container content = frame.getContentPane();
        frame.setLayout(new BorderLayout());
        content.add(panel,BorderLayout.CENTER);
        content.add(inventoryPanel,BorderLayout.WEST);

        //panel.setLocation(100,100);
        panel.setPreferredSize(new Dimension(800,600));

        //panel.setLayout(null);

        // setup our canvas size and put it into the content of the frame
        //frame.setBounds(0,0,800,600);
        //panel.add(this);
		/*
		frame.pack();
		frame.setSize( VIEWPORT_SIZE_X, VIEWPORT_SIZE_Y);
		frame.setResizable(false);
		//frame.setLocationRelativeTo( null );
		frame.setVisible(true);

		frame.setFocusable(true);
        frame.setLayout(new FlowLayout());
        //frame.setExtendedState(Frame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.repaint();
        */
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
            //g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            //g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
            super.paintComponent(g2);
            //draw grid

            for (int i=0;i<BSIZE;i++) {
                for (int j=0;j<BSIZE;j++) {
                    GameMech.drawHex(i,j,map[i][j],g2);
                }
            }

            for (int i=0;i<BSIZE;i++) {
                for (int j=0;j<BSIZE;j++) {
                    map[i][j].draw(g2);
                }
            }
			/*
			for (int i=0;i<BSIZE;i++) {
				for (int j=0;j<BSIZE;j++) {
					//GameMech.fillHex(i,j,map[i][j],g2);
				}
			}*/

            BufferedImage image= avatar.getOccupation().getSpriteSheet().getSpriteArray()[0];
            GameMech.fillHex(3,3, image,g2);
            GameMech.fillHex(2,2,stone,g2);
        }


    }
    public void update(Point step){
        setLocation(step);
        for (int i=0;i<BSIZE;i++) {
            for (int j=0;j<BSIZE;j++) {
                //board[i][j]=EMPTY;
                Location loc=new Location(i,j);
                if(i>=min_x  &&j >= min_y){

                    //terrain[i][j] = new Grass("Grass",grass);
                    map[i][j]=new Tile(loc, new Grass("Grass",grass));
                }
                else{
                    //terrain[i][j] = new Mountain("Mountain",mountain);
                    map[i][j]=new Tile(loc,new Mountain("Mountain",mountain));
                }
            }
        }
        panel.repaint();

    }
    public void setLocation(Point step){
        System.out.println("Location:"+min_x+","+min_y);
        min_x=min_x-(int)step.getX();
        min_y=min_y-(int)step.getY();
        if(min_x<-24)
            min_x=-24;
        if(min_y<-24)
            min_y=-24;
        if(min_x>3)
            min_x=3;
        if(min_y>3)
            min_y=3;


    }
    
    public Tile[][] getMap(){
    	return map;
    }
    
    public void saveGame() throws IOException{
    	BufferedWriter bw = new BufferedWriter(new FileWriter(new File("/src/res/file")));
    	for(int i = 0; i < map.length; i++){
    		for(int j = 0; j < map[0].length; j++){
    			bw.write(map[i][j].getLocation() + "," + map[i][j].getAreaEffect().getAreaEffectType() + "," +
    					map[i][j].getTerrain().getTerrainType() + "," + map[i][j].getItem().getItemType() + "," +	
    					map[i][j].getEntity().getOccupation().getOcc() + "," + map[i][j].getEntity().getOccupation().getStats() + "," + map[i][j].getEntity().getInventory().getTakeableItems() + "," + 
    					map[i][j].getEntity().getInventory().getFirstFreeSlot() + "," + map[i][j].getEntity().getInventory().getCount() + "," +
    					map[i][j].getEntity().getEquipmentContainer().getEquipmentContainer() + "," + 
    					map[i][j].getEntity().getEquipmentContainer().getFirstFreeSlot() + "," + map[i][j].getEntity().getEquipmentContainer().getCount() +
    					"\n");
    		}
    	}
    	bw.flush();
    	bw.close();
    }

}