package Controller;

import java.awt.Point;



import model.entity.Avatar;
import model.gameMap.GameMap;
import model.gameMap.Location;

public class AvatarMovementController extends MovementController {
	private Avatar avatar;
	public AvatarMovementController(GameMap mapView){
		this.mapView = mapView;
	}
	public void move(Point step, int direction) {
		mapView.update(step);
		
		
	}

}