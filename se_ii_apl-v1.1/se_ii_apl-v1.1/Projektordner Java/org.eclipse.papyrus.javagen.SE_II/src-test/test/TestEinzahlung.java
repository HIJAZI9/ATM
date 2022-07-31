
package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.ATM;

public class TestEinzahlung {

	@Test
	public void test() {
		ATM atm;
	    atm=new ATM("Shoppinghaus Dresden");
		// Mohammed als Kunde --> Kundennummer ist 25891 und PIN ist 2233
		Boolean anmeldung=atm.signIn(2233, 25891);
		/*
		 * wir wollen zum Beispiel 99 euro einzahlen.
		 * 		
		 */
		
		Boolean result;
		if(anmeldung) {
			result=atm.payIn(10.0);
			assertEquals(true,result);
		}
		
	}

}