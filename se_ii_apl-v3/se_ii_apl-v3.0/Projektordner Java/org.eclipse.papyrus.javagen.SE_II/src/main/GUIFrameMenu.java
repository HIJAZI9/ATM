package main;

import javax.swing.border.EmptyBorder;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;


/**
 * This class is used to To display a List of Transactions
 *
 */
public class GUIFrameMenu extends JFrame {
	
	/**
	 * Panel to add some Elements
	 *  
	 */
	private JPanel contentPane;
	
	/**
	 * A button to return to the registering screen
	 */
	private JButton btnExit;
	
	/**
	 * A button to show the current balance screen
	 */
	private JButton btnBalance;
	
	/**
	 * A button to show with Pay In screen
	 */
	private JButton btnPayIn;
	
	/**
	 * A button to show with Pay Off screen
	 */
	private JButton btnPayOff;
	
	/**
	 * Button to display "About" view
	 */
	private JButton btnAbout;
	
	/**
	 * Reference to the ATM instance that should be handled
	 */
	private ATM atm;

	/**
	 * Create the frame.
	 * @param atm 
	 */
	public GUIFrameMenu(final ATM atm) {
		this.atm = atm;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 675);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//create and adding Label 
		JLabel LabelInfo1 = new JLabel("Willkommen im Shoppinghaus Dresden!");
		LabelInfo1.setHorizontalAlignment(SwingConstants.CENTER);
		LabelInfo1.setForeground(Color.BLUE);
		LabelInfo1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 28));
		LabelInfo1.setBounds(10, 101, 924, 30);
		contentPane.add(LabelInfo1);
		//create and adding Label 
		JLabel lblBitteWhlenSie = new JLabel("Bitte Wählen Sie eine Aktion:");
		lblBitteWhlenSie.setHorizontalAlignment(SwingConstants.CENTER);
		lblBitteWhlenSie.setForeground(Color.BLACK);
		lblBitteWhlenSie.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblBitteWhlenSie.setBounds(10, 155, 924, 30);
		contentPane.add(lblBitteWhlenSie);
		/*
		 * create and adding Abbrechen Button
		 * When the button is pressed, the process will be canceled and return to the registering screen 
		 */
		btnExit = new JButton("Abmelden");
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnExit.setBounds(346, 449, 248, 51);
		contentPane.add(btnExit);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== btnExit) {
					atm.signOut();
					setVisible(false);
					GUIFrameAnmeldung scr2 = new GUIFrameAnmeldung(atm);
					scr2.setVisible(true);
				}
			}
		});
		btnAbout = new JButton("About");
		btnAbout.setForeground(Color.BLACK);
		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnAbout.setBounds(346, 369, 248, 51);
		contentPane.add(btnAbout);
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== btnAbout) {
					setVisible(false);
					GUIFrameAbout scr8 = new GUIFrameAbout(atm);
					scr8.setVisible(true);
				}
			}
		});
		/*
		 * create and adding Auszahlung Button
         *You will go to another screen to request the Amount for the work of 'Auszahlung'
		 */
		btnPayOff = new JButton("Auszahlung");
		btnPayOff.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPayOff.setBounds(346, 286, 248, 51);
		contentPane.add(btnPayOff);
		btnPayOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== btnPayOff) {
					setVisible(false);
					GUIFrameAuszahlung scr7 = new GUIFrameAuszahlung(atm);
					scr7.setVisible(true);
				}
			}
		});
		/*
		 * create and adding Einzahlung Button
         *You will go to another screen to request the Amount for the work of 'Einzahlung'
		 */
		btnPayIn = new JButton("Einzahlung");
		btnPayIn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnPayIn.setBounds(61, 286, 248, 51);
		contentPane.add(btnPayIn);
		btnPayIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()== btnPayIn) {
					setVisible(false);
					GUIFrameEinzahlung scr5 = new GUIFrameEinzahlung(atm);
					scr5.setVisible(true);
				}
			}
		});
		/*
		 *create and adding Kontostand Button
         *You will go to another screen to  display the  Balance of the current account
		 */
		btnBalance = new JButton("Kontostand");
		btnBalance.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBalance.setBounds(635, 286, 248, 51);
		contentPane.add(btnBalance);
		btnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnBalance) {
					setVisible(false);
					GUIFrameKontostand scr8 = new GUIFrameKontostand(atm);
					scr8.setVisible(true);
				}
			}
		});
	}
}
