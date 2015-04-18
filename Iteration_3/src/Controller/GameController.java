package Controller;

import model.gameMap.GameMap;

public class GameController {
	private MapViewController  mvc;
	private GameMap map;
	public GameController(){
		
		map=new GameMap();
		mvc=new MapViewController(map);
		
	}

}
