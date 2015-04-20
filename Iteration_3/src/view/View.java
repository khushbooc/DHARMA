package view;


public class View {
    private MainMenuView mainMenuView;

    public View(){
        mainMenuView = new MainMenuView();
    }

    public void renderMainMenu(){
        mainMenuView.render();
    }
}
