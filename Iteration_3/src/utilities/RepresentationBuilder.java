package utilities;

import model.gameMap.Location;

/**
 * Created by Poxoti on 4/20/2015.
 */
public abstract class RepresentationBuilder {
    private int offSetX, offSetY;
    private Object representation;

    public RepresentationBuilder(){
        offSetX = 0;
        offSetY = 0;
        setRepresentation(null);
    }

    public RepresentationBuilder(int x, int y, Object rep){
        offSetX = x;
        offSetY = y;
        setRepresentation(rep);
    }

    public Object getRepresentation()
    {
        return representation;
    }

    public int getOffSetX()
    {
        return offSetX;
    }

    public int getOffSetY()
    {
        return offSetY;
    }

    public void setLocation(int offSetX, int offSetY)
    {
        this.offSetY = offSetY;
        this.offSetX = offSetX;
    }
    
    public abstract void setRepresentation(Object representation);
}
