package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.ATM;

public class TestAnmeldungsfehler {

   
	ATM atm;
	
	
	@Before
	public void init() {
		atm=new ATM();
		
	}
	@Test
	public void testAnmelden() {
		// sign in with wrong test customer data (PIN 4998 does not match real PIN 4543)
		boolean anmeldung = atm.signIn("46467", "4998");
		assertEquals(false, anmeldung);
	}
}
