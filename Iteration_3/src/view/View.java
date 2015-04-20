package view;

import sun.plugin.dom.views.AbstractView;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLayeredPane;


@SuppressWarnings("serial")
public class View {
    private MainMenuView mainMenuView;

    public View(){
        mainMenuView = new MainMenuView();
    }
}
