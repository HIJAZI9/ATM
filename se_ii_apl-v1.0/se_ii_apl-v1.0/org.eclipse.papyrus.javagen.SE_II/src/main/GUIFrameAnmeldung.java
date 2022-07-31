package main;

import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * This class is used to enter the user's information (Customer number and PIN)
 *
 */
public class GUIFrameAnmeldung extends JFrame  {
	/**
	 * Panel to add some Elements
	 *  
	 */
	private JPanel contentPane;
	
	/**
	 * Textfield to read customer number
	 *  
	 */
	private JTextField textField_0;
	
	/**
	 * Textfield to read  PIN
	 *  
	 */
	private JTextField textField_1;
	
	/**
	 * A button to check the entered information and move to another screen
	 *  
	 */
	private JButton Button_OK;
	
	/**
	 * Reference to the ATM instance that should be handled
	 */

	private ATM atm;

	/**
	 * Create the frame.
	 * @param atm 
	 */
	public GUIFrameAnmeldung(final ATM atm) {
		this.atm = atm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 956, 675);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//create and adding Label
		JLabel LabelKundennumer = new JLabel("Kundennummer");
		LabelKundennumer.setFont(new Font("Tahoma", Font.BOLD, 18));
		LabelKundennumer.setBounds(282, 255, 180, 60);
		contentPane.add(LabelKundennumer);
		
		//create and adding Label
		JLabel LabelPin = new JLabel("PIN");
		LabelPin.setFont(new Font("Tahoma", Font.BOLD, 18));
		LabelPin.setBounds(282, 347, 180, 60);
		contentPane.add(LabelPin);
		
		//create and adding TextField
		textField_0 = new JTextField();
		textField_0.setBounds(282, 312, 339, 36);
		contentPane.add(textField_0);
		textField_0.setColumns(10);
		
		//create and adding TextField
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(282, 399, 339, 36);
		contentPane.add(textField_1);
		
		//create and adding Label
		JLabel LabelInfo2 = new JLabel("Bitte Geben Sie ihre Kundennummer und PIN ein:");
		LabelInfo2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelInfo2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelInfo2.setBounds(10, 177, 922, 36);
		contentPane.add(LabelInfo2);
		
		//create and adding Label
		JLabel LabelInfo1 = new JLabel("Willkommen im Shoppinghaus Dresden!");
		LabelInfo1.setForeground(Color.BLUE);
		LabelInfo1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelInfo1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		LabelInfo1.setBounds(10, 137, 922, 30);
		contentPane.add(LabelInfo1);
		
		
		
		
		/*
		 * create and adding OK Button
         *You will go to   Menu screen to choose one Transaction
         *or getting Error Screen when Kundennummer and PIN are not correct 
		 */
		Button_OK = new JButton("OK");
		Button_OK.setBounds(399, 457, 143, 44);
		contentPane.add(Button_OK);
		Button_OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Button_OK) {
					
					String Kundennummer=textField_0.getText();            //get Text from TextField
					String PIN=textField_1.getText();                     //get Text from TextField
					
					int number_Kundennummer=Integer.valueOf(Kundennummer); //Convert a String to an Integer
					int number_PIN=Integer.valueOf(PIN);                   //Convert a String to an Integer
					
					Boolean anmeldung=atm.signIn(number_PIN, number_Kundennummer);	

					if(anmeldung) {
						setVisible(false);
						GUIFrameMenu scr4=new GUIFrameMenu(atm);
						scr4.setVisible(true);
					}
					else {
						setVisible(false);
						GUIFrameFehlermeldung scr3=new GUIFrameFehlermeldung(atm);
						scr3.setVisible(true);
						
					}
						
				}
			}
		});
		
		
		
	}



	}

