package main;

import java.util.ArrayList;

// --------------------------------------------------------
// Code generated by Papyrus Java
// Comments and functionality added manually
// --------------------------------------------------------

/************************************************************/
/**
 * Class that handles the department store data and its customer accounts
 */
public class DepartmentStore {
	
	/**
	 * Name of the department store
	 */
	private String name;
	
	/**
	 * ArrayList of assigned customer accounts
	 */
	private ArrayList<CustomerAccount> customerAccounts;

	/**
	 * Standard constructor for instance creation
	 * @param name	Name of the department store
	 */
	public DepartmentStore(String name) {
		this.name=name;
		this.customerAccounts=new ArrayList<CustomerAccount>();
		CustomerAccount person1=new CustomerAccount("Mohammed",25891,2233);
		this.customerAccounts.add(person1);
		CustomerAccount person2=new CustomerAccount("Tim",25892,1233);
		this.customerAccounts.add(person2);
		CustomerAccount person3=new CustomerAccount("John",74125,1244);
		this.customerAccounts.add(person3);
		CustomerAccount person4=new CustomerAccount("Hamza",45687,1244);
		this.customerAccounts.add(person4);
		CustomerAccount person5=new CustomerAccount("Jannik",45685,2233);
		this.customerAccounts.add(person5);
		CustomerAccount person6=new CustomerAccount("Marie",45634,1144);
		this.customerAccounts.add(person6);
		CustomerAccount person7=new CustomerAccount("Melina",54645,5874);
		this.customerAccounts.add(person7);
		CustomerAccount person8=new CustomerAccount("Adel",78688,4578);
		this.customerAccounts.add(person8);
		CustomerAccount person9=new CustomerAccount("Osaid",44545,7458);
		this.customerAccounts.add(person9);
		CustomerAccount person10=new CustomerAccount("Amir",74567,4225);
		this.customerAccounts.add(person10);
	}

	/**
	 * Get a specific customer account by its customer id
	 * @param id	Customer ID
	 * @return		Customer account with specified id (null if no account was found)
	 */
	public CustomerAccount getCustomerAccountById(int id) {
		for (CustomerAccount person: this.customerAccounts) {
			if (person.getID() == id)
				return person;
		}
		return null;
	}

	/**
	 * Assign a new customer account to the department store
	 * @param customerAccount	Customer account to be added
	 */
	public void addCustomerAccount(CustomerAccount customerAccount) {
		this.customerAccounts.add(customerAccount);
	}

	/**
	 * Remove a specific customer account by its customer id
	 * @param id	Customer ID
	 */
	public void removeCustomerAccountById(int id) {
		ArrayList<CustomerAccount> newList=new ArrayList<CustomerAccount>();
		for (CustomerAccount person: this.customerAccounts) {
			if (person.getID() != id)
				newList.add(person);
		}
		this.customerAccounts = newList;
	}

	/**
	 * Return the name of the department store
	 * @return		Department store name
	 */
	public String getName() {
		 return this.name;
	}

	/**
	 * Set a new department store name
	 * @param name	New name
	 */
	public void setName(String name) {
		this.name=name;
	}
}
