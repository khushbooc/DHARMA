package model;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Created by agemery on 4/20/15.
 */
public class GameLogger {

    private static GameLogger game_logger = new GameLogger();
    private Deque<String> messageQueue = new LinkedList<String>();

    private GameLogger() {}

    public static GameLogger getInstance() {
        return game_logger;
    }

    public void logMessage(String message) {
        messageQueue.addLast(message);
    }

    public boolean isEmpty() {
        return messageQueue.isEmpty();
    }

    public String getMessage() {
        return messageQueue.pollFirst();
    }

}
