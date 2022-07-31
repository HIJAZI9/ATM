package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
/**
 * This class is used to read the value of the amount to be withdrawn into the account
 * Just in one Case : the Amount to be withdrawn is greater or not equal to the Amount in the account
 */
public class GUIFrameAuszahlung extends JFrame {
	/**
	 * Panel to add some Elements
	 *  
	 */
	private JPanel contentPane;
	/**
	 * Textfield to read the Amount of Pay Off Transaction
	 *  
	 */
	private JTextField textField;
	
	/**
	 * A button to show Menu screen to choose one Transaction
	 */
	private JButton btnExite;
	/**
	 * A button to start with Pay Off Transaction and confirm it
	 */
	private JButton Button_OK ;
	/**
	 * Reference to the ATM instance that should be handled
	 */
	private ATM atm;
	
	/**
	 * A Lebel to show  € Currency
	 */
	private JLabel lblNewLabel_2;

	/**
	 * Create the frame.
	 * @param
	 */
	public GUIFrameAuszahlung(final ATM atm) {
		this.atm = atm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 675);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//create and adding Label
		JLabel lblAuszahlung = new JLabel("Auszahlung");
		lblAuszahlung.setHorizontalAlignment(SwingConstants.CENTER);
		lblAuszahlung.setForeground(Color.BLUE);
		lblAuszahlung.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblAuszahlung.setBounds(10, 146, 924, 91);
		contentPane.add(lblAuszahlung);
		
		/*
		 * create and adding Abbrechen Button
         *You will go to   Menu screen to choose one Transaction 
		 */
		 btnExite = new JButton("Abbrechen");
		btnExite.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExite.setBounds(268, 404, 143, 44);
		contentPane.add(btnExite);
		btnExite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnExite) {
					setVisible(false);
					GUIFrameMenu scr4=new GUIFrameMenu(atm);
					scr4.setVisible(true);
				}
			}
		});
		/*
		 * create and adding OK Button
         *The Pay out Transaction will be success just if the Amount is equal or greater than the current balance
		 */
		 Button_OK = new JButton("OK");
		Button_OK.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Button_OK.setBounds(565, 404, 143, 44);
		contentPane.add(Button_OK);
		Button_OK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Button_OK) {
					setVisible(false);
					String betrag=textField.getText();                 //get Text from TextField
					double betrage_double=Double.parseDouble(betrag);  //Convert a String to an Integer
					boolean success ;
					double customerBalance=atm.getBalance();
					if((customerBalance-betrage_double)>0 ||(customerBalance-betrage_double)==0) {
						success=atm.payOut(betrage_double);
						if(success) {
							
							setVisible(false);
							GUIFrameMenu scr4=new GUIFrameMenu(atm);
							scr4.setVisible(true);
						}
					}
					else {
						setVisible(false);
						GUIFrameFehler scr10=new GUIFrameFehler(atm);
						scr10.setVisible(true);
					}

					
				}
			}
		});
		
		//create and adding TextField
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(268, 340, 440, 54);
		contentPane.add(textField);
		
		//create and adding Label
		JLabel betrag = new JLabel("Betrag");
		betrag.setFont(new Font("Tahoma", Font.PLAIN, 24));
		betrag.setForeground(Color.BLACK);
		betrag.setBounds(268, 286, 162, 44);
		contentPane.add(betrag);
		
		// create and adding Label for € Currency
		lblNewLabel_2 = new JLabel(" €");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.PLAIN, 34));
		lblNewLabel_2.setBounds(718, 340, 67, 54);
		contentPane.add(lblNewLabel_2);
	}

}
