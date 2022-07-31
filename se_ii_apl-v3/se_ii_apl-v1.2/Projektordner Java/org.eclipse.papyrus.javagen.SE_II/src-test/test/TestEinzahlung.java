
package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.ATM;

public class TestEinzahlung {

	@Test
	public void test() {
		ATM atm;
	    atm=new ATM();
	    // sign in with test customer data
	 	boolean anmeldung = atm.signIn("46467", "4543");
		/*
		 * wir wollen zum Beispiel 99 euro einzahlen.
		 * 		
		 */
		
		boolean result;
		if(anmeldung) {
			result=atm.payIn(10.0);
			assertEquals(true,result);
		}
		
	}

}