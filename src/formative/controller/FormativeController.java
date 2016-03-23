package formative.controller;

import formative.model.Formative;
import formative.view.FormativeFrame;
import formative.view.FormativeView;

/**
 * Controller for the SLO Formative project.
 */
public class FormativeController
{
	private Formative myFormative;
	private FormativeView display;
	private FormativeFrame baseFrame;
	
	public FormativeController()
	{
		display = new FormativeView();
		String userName = display.collectUserText("Please type in an M, C, or I.");
		myFormative = new Formative(userName);
		baseFrame = new FormativeFrame(this);
	}
	
	public void start()
	{
		display.displayText("Hello" + myFormative.getUserName());
		chat();
	}
	
	private void chat()
	{
		String conversation = display.collectUserText("M stands for mathematics, C stands for Computer Technology, and I stands for Information Technology");
		while (myFormative.lengthChecker(conversation))
		{
			if (myFormative.contentChecker(conversation))
			{
				display.displayText("Put 1 if you're a freshman, 2 if you're a sophmore, 3 if you're a junior, and 4 if you're a senior. " + myFormative.getContent());
			}
			else if (myFormative.contentChecker(conversation))
			{
				display.displayText("You clearly did not follow the instructions.");
			}

			conversation = display.collectUserText(conversation);
		}
	}
	
	public Formative getFormative()
	{
		return myFormative;
	}
	
	private void shutDown()
	{
	}

	public Object getFormativeView()
	{
		// TODO Auto-generated method stub
		return null;
	}

	public FormativeFrame getBaseFrame()
	{
		// TODO Auto-generated method stub
		return null;
	}
	
	public void handleErrors(String errorMessage)
	{
		display.displayText(errorMessage);
	}
}
