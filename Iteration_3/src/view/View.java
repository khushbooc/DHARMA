package view;



import controller.Controller;


public class View {
    private AbstractView currentView;

    public View(){
        setMainMenuState();
    }

    public void setMainMenuState() {
        currentView = new MainMenuView();
    }
    public void render(){
        currentView.render();
    }

    public void updateView() {
        currentView.render();
    }

    //advance to next page
    public void nextView() {
        currentView.nextView();
    }

    //retreat one page
    public void prevView() {
        currentView.prevView();
    }

    public void addKeyListenersToCurrentView(Controller controller) {
        this.currentView.addKeyListenerToCurrentView(controller);
    }

    public AbstractView getCurrentView() {
        //forgive me father for I have sinned :(
        return this.currentView;
    }
}
