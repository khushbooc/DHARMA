package model.gameMap;

import java.awt.Point;

public class Location{
    int x;
    int y;
    private int max_x_value;
    private int max_y_value;

	public Location(int x,int y){
		this.x = x;
        this.y = y;
	}

    public Location(int x, int y, int max_x, int max_y) {
        this(x, y);
        this.max_x_value = max_x;
        this.max_y_value = max_y;
    }

	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void add(int x,int y){
		this.x += x;
		this.y += y;
	}
	
	public String toString(){
        return "Location:" + this.x + "," + this.y;
	}
	public void add(Point point) {  
		this.x += point.getX();
		this.y += point.getY();
	}

	public Location addLocation(int x, int y){
		this.x+=x;
		this.y+=y;
		return this;
	}

    public void setLimitX(int max_x) {
        this.max_x_value = x;
    }

    public void setLimitY(int max_y) {
        this.max_y_value = y;
    }

    //will work on this later
    /*public void dx(int dx) {
        if(Math.abs(this.x+dx) < max_x_value) {
            this.x = this.x + dx;
        }
        else
    }

    public void incrementY() {
        if(this.y < max_y_value) {
            ++this.x
        }
    }*/
}
