package controller;

import java.awt.event.KeyEvent;

import model.ability.GameAbility;

public class DharmaKeyListener {
    private GameAbility ability; //the ability associated with this KeyListener
    private int key_code; //the integer value of the key
    private boolean isEnabled;

    public DharmaKeyListener(GameAbility abile, int key_code) {
        this.key_code = key_code;
        this.ability = abile;
        this.isEnabled = true; //all key listeners are enabled by default
    }

    public DharmaKeyListener(GameAbility abile, char key_char) {
        this(abile, KeyEvent.getExtendedKeyCodeForChar(key_char));
    }

    public int getKeyCodeBinding() {
        return key_code;
    }

    public void onPress(KeyEvent e) {
        //call this method when this KeyListener's key was pressed.
        //the listener may forward the action to its ability, if it is currently enabled
        if(this.isEnabled && e.getKeyCode() == this.key_code) {
            System.out.println("(Debug) Key " + this.key_code + " was pressed, and its Listener is enabled");
            this.ability.activate();
        }
        else if(e.getKeyCode() == this.key_code)
            System.out.println("(Debug) Key " + this.key_code + " was pressed, and its Listener is disabled :(");
    }

    public void onRelease(KeyEvent e) {
        //TBD if necessary.
    }

    public static int getJavaKeyCodeForKeyBoardUp() {
        return KeyEvent.VK_UP;
    }

    public static int getJavaKeyCodeForKeyBoardDown() {
        return KeyEvent.VK_DOWN;
    }

    public static int getJavaKeyCodeForKeyBoardLeft() {
        return KeyEvent.VK_LEFT;
    }

    public static int getJavaKeyCodeForKeyBoardRight() {
        return KeyEvent.VK_RIGHT;
    }
}
