package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import main.ATM;

public class TestAnmeldung {

	ATM atm;
	
	@Before
	public void init() {
		atm = new ATM();
		
	}
	@Test
	public void testAnmelden() {
		// sign in with test customer data
		boolean anmeldung = atm.signIn("46467", "4543");
		assertEquals(true, anmeldung);
	}
}
