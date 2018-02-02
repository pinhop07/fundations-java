import javax.swing.*;
import java.awt.event.*;

public class MonthlySalesTaxWindow extends JFrame
{
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField totalSalesField;
	private JButton calcButton;
	private final int WINDOW_WIDTH = 320;
	private final int WINDOW_HEIGHT = 100;

	/*
	*  Constructor
	*/

	public MonthlySalesTaxWindow()
	{

		//Call the JFrame Constructor.
		super("Monthly Sales Tax");

		//Set the size of the window.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		//Specify what happens when the close.
		//button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Build the panel and add it to the frame.
		buildPanel();

		//Add the panel to the frames content pane.
		add(panel);

		//Display the window.
		setVisible(true);

	}

	/**
	*  The buildPanel method adds a label, text feild, and
	*  a button to a panel.
	*/

	private void buildPanel()
	{

		//Create the label, text field, and button components.
		messageLabel = new JLabel("Enter total monthly sales tax.");
		totalSalesField = new JTextField(10);
		calcButton = new JButton("Calculate");

		//Add the action listener to the button.
		calcButton.addActionListener(new CalcButtonListener());

		//Create a panel to hold the components.
		panel = new JPanel();

		//Add the label, text field, and button to the panel.
		panel.add(messageLabel);
		panel.add(totalSalesField);
		panel.add(calcButton);

	}

	/**
	*  Private inner class that holds the event when
	*  the user clicks the calculate button.
	*/

	public class CalcButtonListener implements ActionListener
	{

		public void actionPerformed(ActionEvent e)
		{

			String str;				//To hold the text entered
			double monthlySalesTax; //Calculate monthly sales tax
			double stateTaxRate;	//State tax rate
			double countyTaxRate;	//County tax rate
			double stateTax;		//Calculate state tax
			double countyTax;		//Calculate county tax
			int repeat;				//Confirm dialog box clicked

			do
			{

				//Get the total amount of sales
				str = totalSalesField.getText();

				stateTaxRate = 0.02;

				countyTaxRate = 0.04;

				//Calculate state sales tax.
				stateTax = Double.parseDouble(str) * stateTaxRate;
				JOptionPane.showMessageDialog(null, "The total state "
									  + "sales tax is: $" + stateTax);

				//Calculate county sales tax.
				countyTax = Double.parseDouble(str) * countyTaxRate;
				JOptionPane.showMessageDialog(null, "The total county "
					 				  + "sales tax is: $" + countyTax);

				//Calculate total sales tax.
				monthlySalesTax = stateTax + countyTax;
				JOptionPane.showMessageDialog(null, "The total monthly "
								 + "sales tax is: $" + monthlySalesTax);

				//Does the user want to calculate another set?
				repeat = JOptionPane.showConfirmDialog(null, "Would you "
							  + "like to calcualte another total monthly"
								        + "sales tax?", "Please Confirm.",
								               JOptionPane.YES_NO_OPTION);

			}while (repeat == JOptionPane.YES_OPTION);

			System.exit(0);
		}

	}

} //End
