package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import utilities.Directions;
import model.entity.Avatar;
import model.gameMap.GameMap;

public class MapViewController {
	private GameMap map;
	private boolean keyReleased;
	private JFrame frame; 
	private boolean active;
	
	public MapViewController(GameMap map,JFrame frame){
		this.map=map;
		keyReleased=true;
		this.frame=frame;
		active=true;
		frame.addKeyListener(new CharacterKeyboardController(map));
	}
	
public class CharacterKeyboardController implements KeyListener{
		
		private final int baseDelay = 5000;
		private final int developmentDelay = 0;
		private Timer timer;
		private MovementController movement;
		
		public CharacterKeyboardController(GameMap map){
			this.movement = new AvatarMovementController(map);
			
		}
		
		public void SyncDelay(){
			
		}
		
		public void keyPressed(KeyEvent e) {
			
			//timer.start();
			
			int key = e.getKeyCode();
			if(!active){
				return;
			}
			if(key == KeyEvent.VK_NUMPAD1){
				
				this.movement.move(MovementController.SOUTHWEST, Directions.SOUTHWEST);
			}
			else if(key == KeyEvent.VK_NUMPAD2){
				this.movement.move(MovementController.SOUTH, Directions.SOUTH);
			}
			else if(key==KeyEvent.VK_NUMPAD3){
				this.movement.move(MovementController.SOUTHEAST, Directions.SOUTHEAST);
			}
			else if(key==KeyEvent.VK_NUMPAD6){
				this.movement.move(MovementController.EAST, Directions.EAST);
			}
			else if(key==KeyEvent.VK_NUMPAD9){
				this.movement.move(MovementController.NORTHEAST, Directions.NORTHEAST);
			}
			else if(key==KeyEvent.VK_NUMPAD8){
				this.movement.move(MovementController.NORTH, Directions.NORTH);
			}
			else if(key==KeyEvent.VK_NUMPAD7){
				this.movement.move(MovementController.NORTHWEST, Directions.NORTHWEST);
			}
			else if(key==KeyEvent.VK_NUMPAD4 ){
				this.movement.move(MovementController.WEST, Directions.WEST);
			}
		}

		public void keyReleased(KeyEvent e) {}
		public void keyTyped(KeyEvent arg0) {}
		
	}

}
