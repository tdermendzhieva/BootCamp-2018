package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for saving and checking account
	String name;
	String sSn;
	double balance;
	String accountNumber;
	double rate;
	static int index = 10000;

	// Constructor to set base properties and initialize the account
	public Account(String name, String sSn, double initDeposit) {

		this.name = name;
		this.sSn = sSn;
		balance = initDeposit;
		// increment index every time we create new account
		index++;
		// Set account number
		this.accountNumber = setAccountNumber();

	}

	private String setAccountNumber() {
		String lastTwoOfSsN = sSn.substring(sSn.length() - 2, sSn.length());
		int uniqueId = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSsN + uniqueId + randomNumber;
	}

	// List common methods

	public void showInfo() {
		System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBALANCE: " + balance);
	}

}
