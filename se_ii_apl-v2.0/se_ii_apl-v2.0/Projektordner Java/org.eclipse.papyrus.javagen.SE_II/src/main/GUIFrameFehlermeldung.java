package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import java.awt.Color;
/**
 * This class is used to enter the user's information (Customer number and PIN)
 * When previous attempts were wrong.
 */
public class GUIFrameFehlermeldung extends JFrame {
	/**
	 * Panel to add some Elements
	 *  
	 */
	private JPanel contentPane;
	/**
	 * Textfield to read PIN
	 *  
	 */
	private JTextField textField_1;
	/**
	 * Textfield to read customer number
	 *  
	 */
	private JTextField textField_0;
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
	public GUIFrameFehlermeldung(final ATM atm) {
		this.atm = atm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 675);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		//create and adding TextField
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(282, 433, 339, 36);
		contentPane.add(textField_1);
		
		//create and adding Label
		JLabel LabelPin = new JLabel("PIN");
		LabelPin.setFont(new Font("Tahoma", Font.BOLD, 18));
		LabelPin.setBounds(282, 381, 180, 60);
		contentPane.add(LabelPin);
		
		//create and adding TextField
		textField_0 = new JTextField();
		textField_0.setColumns(10);
		textField_0.setBounds(282, 346, 339, 36);
		contentPane.add(textField_0);
		
		//create and adding Label
		JLabel LabelKundennumer = new JLabel("Kundennummer");
		LabelKundennumer.setFont(new Font("Tahoma", Font.BOLD, 18));
		LabelKundennumer.setBounds(282, 289, 180, 60);
		contentPane.add(LabelKundennumer);
		
		//create and adding Label
		JLabel LabelInfo2 = new JLabel("Bitte Geben Sie ihre Kundennummer und PIN ein:");
		LabelInfo2.setHorizontalAlignment(SwingConstants.CENTER);
		LabelInfo2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		LabelInfo2.setBounds(10, 211, 922, 36);
		contentPane.add(LabelInfo2);
		
		//create and adding Label
		JLabel LabelInfo1 = new JLabel("Willkommen im Shoppinghaus Dresden!");
		LabelInfo1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelInfo1.setForeground(Color.BLUE);
		LabelInfo1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		LabelInfo1.setBounds(10, 171, 922, 30);
		contentPane.add(LabelInfo1);
		
		//create and adding Label
		JLabel Fehlermeldung = new JLabel("! Anmeldung Fehlgeschlagen");
		Fehlermeldung.setForeground(Color.RED);
		Fehlermeldung.setFont(new Font("Traditional Arabic", Font.PLAIN, 24));
		Fehlermeldung.setBounds(34, 27, 373, 60);
		contentPane.add(Fehlermeldung);
		
		/*
		 * create and adding OK Button
         *You will go to   Menu screen to choose one Transaction
         *or getting Error Screen when Kundennummer and PIN are not correct 
		 */
	    Button_OK = new JButton("OK");
		Button_OK.setBounds(399, 491, 143, 44);
		contentPane.add(Button_OK);
		Button_OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Button_OK) {
					ATM infoTesting=new ATM("Shoppinghaus Dresden");
					
					String Kundennummer=textField_0.getText();             //get Text from TextField
					String PIN=textField_1.getText();                      //get Text from TextField
					
					int number_Kundennummer=Integer.valueOf(Kundennummer); //Convert a String to an Integer
					int number_PIN=Integer.valueOf(PIN);                   //Convert a String to an Integer
					
					Boolean anmeldung=infoTesting.signIn(number_PIN, number_Kundennummer);	
					
					if(anmeldung==true) {
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

