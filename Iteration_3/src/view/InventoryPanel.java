package view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class InventoryPanel extends JPanel {

	public InventoryPanel() {
		super();
		setSize(200,200);
		setPreferredSize(new Dimension(200,200));
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.fillRect(50, 50, 50, 50);
	}
}
