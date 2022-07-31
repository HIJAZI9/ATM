package main;

// --------------------------------------------------------
// Code generated by Papyrus Java
// Comments and functionality added manually
// --------------------------------------------------------

/************************************************************/
/**
 * Not instantiable entry class of the application that handles GUI
 */
public final class ATMApplication {

	/**
	 * Private standard constructor (to prevent the creation of instances)
	 */
	private ATMApplication() {}

	/**
	 * Static main method (entry point of application)
	 * @param args	Overpassed arguments (currently not used)
	 */
	public static void main(String[] args) {
		GUI gui = new GUI(new ATM("Shoppinghaus Dresden"));
		try {
			gui.start();
		}	catch (Exception e) {
			e.printStackTrace();
			gui.stop();
		}
	}
}
