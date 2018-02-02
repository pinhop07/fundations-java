import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TravelExpensesWindow extends JFrame
{
	private JPanel panel;
	private JLabel messageLabel1;
	private JLabel messageLabel2;
	private JLabel messageLabel3;
	private JLabel messageLabel4;
	private JLabel messageLabel5;
	private JLabel messageLabel6;
	private JLabel messageLabel7;
	private JLabel messageLabel8;
	private JTextField totalDaysField;
	private JTextField totalAirfairField;
	private JTextField totalCarRentalField;
	private JTextField totalMilesField;
	private JTextField totalParkingField;
	private JTextField totalTaxiField;
	private JTextField totalRegistrationField;
	private JTextField totalLodgingField;
	private JButton calcButton;

	private final int WINDOW_WIDTH = 500;
	private final int WINDOW_HEIGHT = 350;

	public TravelExpensesWindow()
	{
		super("Travel Expenses");

		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buildPanel();

		add(panel);

		setVisible(true);
	}

	private void buildPanel()
	{

		setLayout(new GridLayout(8, 1));

		messageLabel1 = new JLabel("Enter number of days on trip.");
		totalDaysField = new JTextField(10);

		messageLabel2 = new JLabel("\nEnter amount of airfare, if any.");
		totalAirfairField = new JTextField(10);

		messageLabel3 = new JLabel("Enter amount of car rental fees, if any.");
		totalCarRentalField = new JTextField(10);

		messageLabel4 = new JLabel("Enter number of miles driven, if a private vehicle was used.");
		totalMilesField = new JTextField(10);

		messageLabel5 = new JLabel("Enter amount of parking fees, if any.");
		totalParkingField = new JTextField(10);

		messageLabel6 = new JLabel("Enter amount of taxi charges, if any.");
		totalTaxiField = new JTextField(10);

		messageLabel7 = new JLabel("Enter conference or seminar registration fees, if any.");
		totalRegistrationField = new JTextField(10);

		messageLabel8 = new JLabel("Enter lodging charges per night.");
		totalLodgingField = new JTextField(10);

		calcButton = new JButton("Calculate");





		panel = new JPanel();

		panel.add(messageLabel1);
		panel.add(totalDaysField);
		panel.add(messageLabel2);
		panel.add(totalAirfairField);
		panel.add(messageLabel3);
		panel.add(totalCarRentalField);
		panel.add(messageLabel4);
		panel.add(totalMilesField);
		panel.add(messageLabel5);
		panel.add(totalParkingField);
		panel.add(messageLabel6);
		panel.add(totalTaxiField);
		panel.add(messageLabel7);
		panel.add(totalRegistrationField);
		panel.add(messageLabel8);
		panel.add(totalLodgingField);
		panel.add(calcButton);
	}

}