package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.ATM;

public class TestAnmeldungsfehler {

   
	ATM atm;
	
	
	@Before
	public void init() {
		atm=new ATM("Shoppinghaus Dresden");
		
	}
	@Test
	public void testAnmelden() {
		// Mohammed als Kunde --> Kundennummer ist 25891 und PIN ist 2233
		// wir wollen eine Kunden infos falsch eingeben PIN 1234 statt 2233
		Boolean anmeldung=atm.signIn(1234, 25891);	
		assertEquals(false,anmeldung);
	}
}
