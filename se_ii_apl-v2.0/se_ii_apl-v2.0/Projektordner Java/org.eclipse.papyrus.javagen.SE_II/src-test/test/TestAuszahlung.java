
package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.ATM;

public class TestAuszahlung {

	@Test
	public void test() {
		ATM atm;
	    atm=new ATM("Shoppinghaus Dresden");
		// Mohammed als Kunde --> Kundennummer ist 25891 und PIN ist 2233
		Boolean anmeldung=atm.signIn(2233, 25891);
		/*
		 * Aktueller Kontostand = 0.
		 * wir wollen zum Beispiel 100.0 Euro einzahlen.
		 * danach davon 20.0 Euro auszahlen.
		 *-->Ergebnis ist true		
		 */
		
		Boolean result;

		if(anmeldung) {
			atm.payIn(100.0);
			result=atm.payOut(10.0);
			assertEquals(true,result);
			
			}
		}
		
	}