package model.gameMap;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Decal {
	private String urlImage = "";
	private BufferedImage image;

	public Decal(String url){
		urlImage = url;

		try {
			image = ImageIO.read(new File(urlImage)).getSubimage(0,0,32,32);
		} catch(IOException e) {
			System.err.println(" 404 IMAGE NOT FOUND");
		}
	}

	public Decal(String url, int x, int y){
		urlImage = url;

		try {
			image = ImageIO.read(new File(urlImage)).getSubimage(x,y,32,32);
		} catch(IOException e) {
			System.err.println(" 404 IMAGE NOT FOUND");
		}
	}

	public Decal(String url, int x, int y, int width, int height){
		urlImage = url;

		try {
			image = ImageIO.read(new File(urlImage)).getSubimage(x,y,32,32);
		} catch(IOException e) {
			System.err.println(" 404 IMAGE NOT FOUND");
		}
	}
	
	public String getUrlImage(){
		return this.urlImage;
	}

	public void setUrlImage(String url)
	{
		this.urlImage = url;
	}

	public BufferedImage getImage()
	{
		return image;
	}
}
