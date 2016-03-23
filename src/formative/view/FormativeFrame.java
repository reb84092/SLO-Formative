package formative.view;

import java.awt.Container;

import formative.controller.FormativeController;

import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class FormativeFrame extends JFrame
{
	private FormativeController baseController;
	private FormativePanel basePanel;
	
	public FormativeFrame(FormativeController baseController)
	{
		this.baseController = baseController;
		basePanel = new FormativePanel(baseController);
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	private void setContentPane(FormativePanel basePanel2)
	{
		// TODO Auto-generated method stub
		
	}

	public FormativeController getBaseController()
	{
		return baseController;
	}
}
