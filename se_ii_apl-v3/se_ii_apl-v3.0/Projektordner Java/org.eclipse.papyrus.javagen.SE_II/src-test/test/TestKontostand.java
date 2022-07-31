package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.ATM;

public class TestKontostand {

	@Test
	public void test() {
		ATM atm;
	    atm=new ATM();
	    // sign in with test customer data
	 	boolean anmeldung = atm.signIn("46467", "4543");
		/*
		 * wir wollen zum Beispiel 10 euro einzahlen.
		 * danach Kontostand überprüfen		
		 */
		
		Double resultKontostand;
		if(anmeldung) {
			atm.payIn(10.0);
			resultKontostand=atm.getBalance();
			assertEquals(10.0,resultKontostand,0);
		}
		
	}

}
