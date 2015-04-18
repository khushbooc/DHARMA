package utilities;

import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import model.occupation.Summoner;
import model.occupation.Smasher;
import model.occupation.Sneak;

public class SpriteSheetUtility {
	private String imagePath="";
	private BufferedImage image;
	private BufferedImage[] spriteArray = new BufferedImage[10];
	private final int width = 50;
	private final int height = 50;
	private int offsetX, offsetY;

	public SpriteSheetUtility() {
		//DEFAULT WILL JUST BE A Summoner FOR SAFETY REASONS
		imagePath = "src/res/summoner.gif";
		initialize();
	}
	
	public SpriteSheetUtility(Summoner s) {
		imagePath = "src/res/summoner.gif";
		initialize();
	}
	
	public SpriteSheetUtility(Sneak sn) {
		imagePath = "src/res/sneak.png";
		initialize();
	}
	public SpriteSheetUtility(Smasher s) {
		imagePath = "src/res/summoner.gif";
		initialize();
	}
	protected void initialize() {
		try {
		 image = ImageIO.read(new File(imagePath));
		} 
		
		catch(IOException e) {
			System.err.println(" 404 IMAGE NOT FOUND");
		}
		initializeSpriteArray();
	}
	public BufferedImage[] getSpriteArray() {
		return spriteArray;
	}
	
	public String getPath() {
		return imagePath;
	}
	
	protected void initializeSpriteArray() {
		for (int i=0; i<10; i++) {
			spriteArray[i] = getSpriteDirection(i);
		}
	}
	private BufferedImage getSpriteDirection(int direction) {
		switch (direction) {
		
		case 0: { //DANCING PART 1
			return getSprite(142,781);
		}
		case 1: { //SOUTH_WEST
			return getSprite(13,332);
		}
		case 2: { //SOUTH
			return getSprite(13,140);
		}
		case 3: { //SOUTH_EAST
			return getSprite(13,460);
		}
		case 4: { //WEST
			return getSprite(332,588);
		}
		case 5: { //DANCING PART 2
			return getSprite(270,781);
		}
		case 6: { //EAST
			return getSprite(332,716);
		}
		case 7: { //NORTH_WEST
			BufferedImage temp = getSprite(140,1038);
			
			AffineTransform tx = AffineTransform.getScaleInstance(-1, 1);
		    tx.translate(-temp.getWidth(null), 0);
		    AffineTransformOp op = new AffineTransformOp(tx,
		        AffineTransformOp.TYPE_NEAREST_NEIGHBOR);
		    return op.filter(temp, null);
		}
		case 8: { //NORTH
			return getSprite(13,13);
		}
		case 9: { //NORTH_EAST
			return getSprite(140,1038);
		}
		default: {//NORTH??
			return getSprite(13,13);
		}
		}
	}
	
	private BufferedImage getSprite(int offsetX, int offsetY) {
		BufferedImage subSprite = image.getSubimage(offsetX , offsetY , width, height);
		return subSprite;
	}
	
}
