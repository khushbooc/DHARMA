package view;



import controller.Controller;


public class View {
    private MainMenuView mainMenuView;

    public View(){
        mainMenuView = new MainMenuView();
    }

    public void displayMainMenu(){
        mainMenuView.render();
    }

    public void addKeyListenersToCurrentView(Controller controller) {
        this.mainMenuView.addKeyListenerToCurrentView(controller);
    }
}
