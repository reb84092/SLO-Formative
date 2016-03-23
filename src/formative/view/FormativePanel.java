package formative.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.JPanel;

import formative.controller.FormativeController;

public class FormativePanel extends JPanel
{
	private FormativeController baseController;
	private SpringLayout baseLayout;
	private JButton chatButton;
	private JTextField chatTextField;

	public FormativePanel(FormativeController baseController)
	{
		this.baseController = baseController;

		baseLayout = new SpringLayout();
		chatButton = new JButton("Please do not click the button");
		chatTextField = new JTextField("Words can be typed here");
	
		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(chatButton);
		this.add(chatTextField);
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.WEST, chatButton, 107, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, chatButton, -32, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, chatTextField, 37, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, chatTextField, -24, SpringLayout.EAST, this);
	}

	private void setupListeners()

	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				chatTextField.setText("Wow, this is the most amazing click event ever! WOW!");
			}
		});
	}
	
	public JComponent getTextField()
	{
		// TODO Auto-generated method stub
		return null;

	}
}


