package controller;

import model.GameLogger;

import javax.swing.JFrame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controller implements KeyListener {
    private KeyListenerSet keyListenerSet;

    public Controller() {
        keyListenerSet = new KeyListenerSet();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        GameLogger.getInstance().logMessage("Controller.keyTyped() was called!!");
        //do nothing

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //forward the event to the set to let it handle it
        GameLogger.getInstance().logMessage("Controller.keyPressed() was called!!");
        keyListenerSet.handleKeyPressedEvent(e);

    }

    @Override
    public void keyReleased(KeyEvent e) {
        //do nothing
        //might need this to do something later
        GameLogger.getInstance().logMessage("Controller.keyReleased() was called!!");
    }

    public void setKeyListenerSet(KeyListenerSet newKeySet) {
        keyListenerSet = newKeySet;
    }

    public void addKeyListenerToSet(DharmaKeyListener keyListener) {
        keyListenerSet.addKeyListener(keyListener);
    }


    /*public void addKeyListenersToFrame(JFrame frame) {
        frame.addKeyListener(this);
    }*/
}
