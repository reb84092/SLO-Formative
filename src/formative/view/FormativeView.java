package formative.view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FormativeView
{
	private String windowMessage;
	private ImageIcon chatIcon;
	
	public FormativeView()
	{
		windowMessage = "Tell me about your college status!";
	}
	
	public String collectUserText(String textDisplay)
	{
		String userInput = "";
		
		userInput = JOptionPane.showInputDialog(null, "Answer here :)")+"";
		
		return userInput;
	}
	
	public void displayText(String textDisplay)
	{
		JOptionPane.showMessageDialog(null, textDisplay);
	}
}
