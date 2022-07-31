package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.ATM;

public class TestKontostand {

	@Test
	public void test() {
		ATM atm;
	    atm=new ATM("Shoppinghaus Dresden");
		// Mohammed als Kunde --> Kundennummer ist 25891 und PIN ist 2233
		Boolean anmeldung=atm.signIn(2233, 25891);
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
