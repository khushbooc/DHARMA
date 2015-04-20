package utilities;

import model.gameMap.Item;
import model.inventory.Chest;
import model.inventory.Head;
import model.inventory.OneHandedW;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Poxoti on 4/20/2015.
 */
public class ItemImageBuilder extends RepresentationBuilder {

    public ItemImageBuilder(){}

    public ItemImageBuilder(int x, int y, Item item)
    {
        super(x, y, "src/res/placeholder.jpg");
    }

    public ItemImageBuilder(int x, int y, Chest chest)
    {
        super(x, y, "src/res/chest_armor.png");
    }

    public ItemImageBuilder(int x, int y, Head head) {
        super(x, y, "src/res/helm_armor.png");
    }

    public ItemImageBuilder(int x, int y, OneHandedW weap) {
        super(x, y, "src/res/1h_w.png");
    }

    public void setURL(String urlImage) {
        setRepresentation(urlImage);
    }

    private BufferedImage image;

    public BufferedImage getImage()
    {
        return image;
    }

    public void setRepresentation(String url)
    {
        try {
            setRepresentation(ImageIO.read(new File(url)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setRepresentation(Object representation) {
            image = ((BufferedImage) representation).getSubimage(super.getOffSetX(),
                super.getOffSetY(), 32, 32);
    }
}
