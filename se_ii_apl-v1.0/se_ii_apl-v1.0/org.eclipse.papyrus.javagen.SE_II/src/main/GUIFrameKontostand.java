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
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 * This class is used to To display the current Balance of the account
 *
 */
public class GUIFrameKontostand extends JFrame {
	/**
	 * Panel to add some Elements
	 *  
	 */
	private JPanel contentPane;
	/**
	 * Textfield to show the current balance
	 *  
	 */
	private JTextField txtGeben;
	/**
	 * A button to show Menu screen to choose one Transaction
	 */
	private JButton btnNewButton;
	
	/**
	 * Reference to the ATM instance that should be handled
	 */
	private ATM atm;

	/**
	 * Create the frame.
	 * @param atm 
	 */
	public GUIFrameKontostand(final ATM atm) {
		this.atm = atm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 675);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//create and adding Label 
		JLabel lblNewLabel = new JLabel("Kontostand");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 34));
		lblNewLabel.setBounds(10, 210, 924, 55);
		contentPane.add(lblNewLabel);
		//create and adding Label 
		JLabel lblNewLabel_1 = new JLabel("Ihr Kontostand beträgt derzeit");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setBounds(10, 294, 924, 44);
		contentPane.add(lblNewLabel_1);
		//create and adding TextField 
		txtGeben = new JTextField();
		txtGeben.setHorizontalAlignment(SwingConstants.CENTER);
		txtGeben.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		txtGeben.setForeground(Color.BLACK);
		txtGeben.setBounds(10, 415, 924, 55);
		txtGeben.setText(atm.getBalance().toString());
		contentPane.add(txtGeben);
		txtGeben.setColumns(10);
		/*
		 * create and adding OK Button
         *You will go to   Menu screen to choose one Transaction 
		 */
		btnNewButton = new JButton("OK");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(397, 507, 163, 49);
		contentPane.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton) {
					setVisible(false);
					GUIFrameMenu scr4=new GUIFrameMenu(atm);
					scr4.setVisible(true);
				}
			}
		});

	}
}
