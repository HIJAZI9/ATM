package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.ATM;

public class TestAuszahlungFehler {

	@Test
	public void test() {
		ATM atm;
	    atm=new ATM();
	    // sign in with test customer data
	 	boolean anmeldung = atm.signIn("46467", "4543");
		/*
		 *  Aktueller Kontostand = 0.
		 * wir wollen zum Beispiel 100.0 Euro einzahlen.
		 * danach davon 200.0 Euro auszahlen.
		 * -->Ergebnis ist false 	
		 */
		
		boolean result;

		if(anmeldung) {
			atm.payIn(100.0);
			result=atm.payOut(200.0);
			assertEquals(false,result);
			
			}
		}
		
	}