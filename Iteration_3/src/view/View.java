package view;



import controller.Controller;
import model.Game;


public class View {
    private AbstractView currentView;
    private Game game;
    private Controller controller;

    public View(){
        setMainMenuState();
    }

    public void setGameParent(Game game) {
        this.game = game;
    }

    public void setMainMenuState() {
        currentView = new MainMenuView(this);
    }
    public void render(){
        currentView.render();
    }

    public void updateView() {
        currentView.render();
    }

    public void addKeyListenersToCurrentView(Controller controller) {
        this.controller = controller;
        this.currentView.addKeyListenerToCurrentView(controller);
    }

    public AbstractView getCurrentView() {
        //forgive me father for I have sinned :(
        return this.currentView;
    }

    public void onSelection() {
        currentView.onSelection();
    }

    protected void advanceViewState(AbstractView next_view) {
        currentView = next_view;
        currentView.addKeyListenerToCurrentView(controller);
    }

    protected void exitGame() {
        this.game.exitGame();
    }

    public void killWindow() {
        this.currentView.killWindow();
    }
}
