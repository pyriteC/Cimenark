package view;

import java.awt.Color;

import javax.swing.JPanel;

import controller.Controller;

public class Panel extends JPanel 
{
	Controller app;
	public Panel(Controller app)
	{
		super();
		this.app = app;
		setupPanel();
		setupListeners();
		setupLayout();
		
	}
	
	private void setupPanel()
	{
		this.setBackground(new Color(200, 150, 50 ));
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
	
	}
	
	
}
