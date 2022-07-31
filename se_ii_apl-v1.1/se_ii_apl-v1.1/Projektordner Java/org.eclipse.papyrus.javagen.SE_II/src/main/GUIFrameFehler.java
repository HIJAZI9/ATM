package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *   This class is used to Display an error message,
 *   that the current Transaction cannot succeed,
 *   and the reason is that the Amount to be withdrawn is greater or not equal to the Amount in the account
 */
public class GUIFrameFehler extends JFrame {
	/**
	 * Panel to add some Elements
	 *  
	 */
	private JPanel contentPane;
	/**
	 * Reference to the ATM instance that should be handled
	 */
	private ATM atm;
	/**
	 * A back button to show Menu screen to choose one Transaction
	 */
	private JButton Button_zurueck ;
	/**
	 * Create the frame.
	 * @param atm 
	 */
	public GUIFrameFehler(final ATM atm) {
		this.atm = atm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 675);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//create and adding Label
		JLabel lblNewLabel = new JLabel("Fehler");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 235, 924, 50);
		contentPane.add(lblNewLabel);
		
		//create and adding Label to show Error Message for Customer that the current Transaction cannot succeed 
		JLabel lblEsGabEinen = new JLabel("Es gab einen Fehler bei der Transaktion, bitte versuchen Sie es erneut.");
		lblEsGabEinen.setHorizontalAlignment(SwingConstants.CENTER);
		lblEsGabEinen.setForeground(Color.BLACK);
		lblEsGabEinen.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblEsGabEinen.setBounds(10, 317, 924, 50);
		contentPane.add(lblEsGabEinen);
		
		/*
		 * create and adding Back Button
         *You will go to   Menu screen to choose one Transaction 
		 */
		Button_zurueck = new JButton("Zurück");
		Button_zurueck.setFont(new Font("Tahoma", Font.PLAIN, 20));
		Button_zurueck.setBounds(398, 395, 143, 44);
		contentPane.add(Button_zurueck);
		Button_zurueck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==Button_zurueck) {

	     			setVisible(false);
					GUIFrameMenu scr4=new GUIFrameMenu(atm);
					scr4.setVisible(true);
				}
			}
		});

	}

}
