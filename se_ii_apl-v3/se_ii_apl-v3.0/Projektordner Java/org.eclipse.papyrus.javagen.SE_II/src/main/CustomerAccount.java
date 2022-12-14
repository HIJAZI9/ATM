package main;

// --------------------------------------------------------
// Code generated by Papyrus Java
// Comments and functionality added manually
// --------------------------------------------------------

/************************************************************/
/**
 * Class that handles the data of a specific customer account
 */
public class CustomerAccount {
	
	/**
	 * Customer name
	 */
	private String customerName;
	
	/**
	 * Customer PIN
	 */
	private String PIN;
	
	/**
	 * Customer ID
	 */
	private String ID;
	
	/**
	 * Current account balance
	 */
	private Double balance;

	/**
	 * Standard constructor for instance creation
	 * @param customerName		Initial cutsomer name
	 * @param id				Initial ID
	 * @param pin				Initial PIN
	 * @param currentBalance	Initial account balance
	 */
	public CustomerAccount(String customerName, String id, String pin, Double currentBalance) {
		this.customerName = customerName;
		this.ID = id;
		this.PIN = pin;
		this.balance = currentBalance;
	}

	/**
	 * Method to update the account balance
	 * @param diff		Value that should be added/removed to/from the balance
	 */
	public void updateBalance(Double diff) {
		this.balance += diff;
	}

	/**
	 * Return the current customer name
	 * @return		Customer name
	 */
	public String getName() {
		return this.customerName;

	}

	/**
	 * Return the current customer PIN
	 * @return		Customer PIN
	 */
	public String getPIN() {
		return this.PIN;
	}

	/**
	 * Return the current customer ID
	 * @return		Customer ID
	 */
	public String getID() {
		return this.ID;
	}

	/**
	 * Return the current account balance
	 * @return		Account balance
	 */
	public Double getBalance() {
		return this.balance;
	}

	/**
	 * Set a new customer name
	 * @param customerName	New name
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
