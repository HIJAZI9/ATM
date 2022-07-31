package main;
import javax.swing.border.EmptyBorder;

import java.awt.*;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
/**
 * This class is used to show the developer information
 *
 */
public class GUIFrameAbout extends JFrame {

	/**
	 * Panel to add some Elements
	 *  
	 */
	private JPanel contentPane;
	
	/**
	 * Reference to the ATM instance that should be handled
	 * 
	 */
	private ATM atm;
	
	/**
	 * Button to navigate back to main menu 
	 * 
	 */
	private JButton btnGoBack;
	
	/**
	 * ArrayList of all used labels
	 */
	private ArrayList<JLabel> displayLabels;

	/**
	 * Create the frame.
	 */
	public GUIFrameAbout(final ATM atm) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 958, 675);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		displayLabels = new ArrayList<JLabel>();
		
		displayLabels.add(new JLabel("About IT Solutions Dresden GmbH"));
		displayLabels.get(0).setForeground(Color.BLUE);
		displayLabels.get(0).setFont(new Font("Tahoma", Font.PLAIN, 36));
		displayLabels.get(0).setHorizontalAlignment(SwingConstants.CENTER);
		displayLabels.get(0).setBounds(10, 37, 924, 95);
		contentPane.add(displayLabels.get(0));
		
		displayLabels.add(new JLabel("IT Solutions Dresden ist eine Firma, die im Bereich der Informationstechnologie tätig ist"));
		displayLabels.get(1).setHorizontalAlignment(SwingConstants.CENTER);
		displayLabels.get(1).setFont(new Font("Tahoma", Font.PLAIN, 22));
		displayLabels.get(1).setBounds(10, 110, 924, 61);
		contentPane.add(displayLabels.get(1));
		
		displayLabels.add(new JLabel("Gegründet wurde das Unternehmen im Jahr 2011 und hat seitdem seinen Sitz im Dresdner "));
		displayLabels.get(2).setHorizontalAlignment(SwingConstants.LEFT);
		displayLabels.get(2).setFont(new Font("Tahoma", Font.PLAIN, 22));
		displayLabels.get(2).setBounds(10, 142, 924, 61);
		contentPane.add(displayLabels.get(2));
		
		displayLabels.add(new JLabel("Stadtteil Pieschen im Nordwesten der Stadt. Die Zielgruppe besteht vor allem aus kleinen \r\n"));
		displayLabels.get(3).setFont(new Font("Tahoma", Font.PLAIN, 22));
		displayLabels.get(3).setHorizontalAlignment(SwingConstants.LEFT);
		displayLabels.get(3).setBounds(10, 181, 924, 46);
		contentPane.add(displayLabels.get(3));
		
		displayLabels.add(new JLabel("und mittelständigen Unternehmen, die trotz ihres verhältnismäßig geringen Budgets nach "));
		displayLabels.get(4).setFont(new Font("Tahoma", Font.PLAIN, 22));
		displayLabels.get(4).setBounds(10, 213, 924, 46);
		contentPane.add(displayLabels.get(4));
		
		displayLabels.add(new JLabel("qualitativ hochwertigen IT-Lösungen suchen. Auch größere Unternehmen, staatliche "));
		displayLabels.get(5).setHorizontalAlignment(SwingConstants.LEFT);
		displayLabels.get(5).setFont(new Font("Tahoma", Font.PLAIN, 22));
		displayLabels.get(5).setBounds(10, 248, 924, 43);
		contentPane.add(displayLabels.get(5));
		
		displayLabels.add(new JLabel("Organisationen und Privatkunden werden gelegentlich betreut."));
		displayLabels.get(6).setFont(new Font("Tahoma", Font.PLAIN, 22));
		displayLabels.get(6).setHorizontalAlignment(SwingConstants.LEFT);
		displayLabels.get(6).setBounds(10, 286, 924, 32);
		contentPane.add(displayLabels.get(6));
		
		btnGoBack = new JButton("Zurück");
		btnGoBack.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnGoBack.setBounds(348, 570, 221, 32);
		contentPane.add(btnGoBack);
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnGoBack) {
					setVisible(false);
					GUIFrameMenu scr8=new GUIFrameMenu(atm);
					scr8.setVisible(true);
				}
			}
		});
		
		displayLabels.add(new JLabel("Anschrift"));
		displayLabels.get(7).setHorizontalAlignment(SwingConstants.LEFT);
		displayLabels.get(7).setFont(new Font("Tahoma", Font.BOLD, 20));
		displayLabels.get(7).setForeground(Color.BLACK);
		displayLabels.get(7).setBounds(10, 397, 199, 26);
		contentPane.add(displayLabels.get(7));
		
		displayLabels.add(new JLabel("Kontakt"));
		displayLabels.get(8).setHorizontalAlignment(SwingConstants.LEFT);
		displayLabels.get(8).setFont(new Font("Tahoma", Font.BOLD, 20));
		displayLabels.get(8).setBounds(688, 398, 246, 24);
		contentPane.add(displayLabels.get(8));
		
		displayLabels.add(new JLabel("IT Solutions Dresden GmbH"));
		displayLabels.get(9).setFont(new Font("Tahoma", Font.PLAIN, 18));
		displayLabels.get(9).setBounds(10, 433, 248, 32);
		contentPane.add(displayLabels.get(9));
		
		displayLabels.add(new JLabel("Leipziger Straße 102a"));
		displayLabels.get(10).setFont(new Font("Tahoma", Font.PLAIN, 18));
		displayLabels.get(10).setBounds(10, 457, 248, 26);
		contentPane.add(displayLabels.get(10));
		
		displayLabels.add(new JLabel("01127 Dresden"));
		displayLabels.get(11).setFont(new Font("Tahoma", Font.PLAIN, 18));
		displayLabels.get(11).setBounds(10, 482, 248, 26);
		contentPane.add(displayLabels.get(11));
		
		displayLabels.add(new JLabel("Telefon: 0351 / 336002"));
		displayLabels.get(12).setFont(new Font("Tahoma", Font.PLAIN, 18));
		displayLabels.get(12).setBounds(688, 434, 246, 31);
		contentPane.add(displayLabels.get(12));
		
		displayLabels.add(new JLabel("Fax: 0351 / 3360029"));
		displayLabels.get(13).setFont(new Font("Tahoma", Font.PLAIN, 18));
		displayLabels.get(13).setBounds(688, 457, 246, 26);
		contentPane.add(displayLabels.get(13));
		
		displayLabels.add(new JLabel("E-Mail: kontakt@it-dresden.de"));
		displayLabels.get(14).setFont(new Font("Tahoma", Font.PLAIN, 18));
		displayLabels.get(14).setBounds(688, 479, 246, 32);
		contentPane.add(displayLabels.get(14));
		
		displayLabels.add(new JLabel(""));
		displayLabels.get(15).setHorizontalAlignment(SwingConstants.CENTER);
		displayLabels.get(15).setIcon(new ImageIcon("res/Logo_AN.png"));
		displayLabels.get(15).setBounds(229, 328, 449, 232);
		contentPane.add(displayLabels.get(15));
	}
	
	/**
	 * Returns all labels used in this view as an ArrayList
	 * @return ArrayList<JLabel> List of all labels of the view
	 */
	public ArrayList<JLabel> getLabels() {
		return this.displayLabels;
	}
}
