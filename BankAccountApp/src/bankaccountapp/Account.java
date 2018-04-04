package bankaccountapp;

public abstract class Account implements IBaseRate {
	// List common properties for saving and checking account
	private String name;
	private String sSn;
	private double balance;
	protected String accountNumber;
	protected double rate;
	private static int index = 10000;

	// Constructor to set base properties and initialize the account
	public Account(String name, String sSn, double initDeposit) {

		this.name = name;
		this.sSn = sSn;
		balance = initDeposit;
		// increment index every time we create new account
		index++;
		// Set account number
		this.accountNumber = setAccountNumber();
		setRate();
	}

	public abstract void setRate();

	private String setAccountNumber() {
		String lastTwoOfSsN = sSn.substring(sSn.length() - 2, sSn.length());
		int uniqueId = index;
		int randomNumber = (int) (Math.random() * Math.pow(10, 3));
		return lastTwoOfSsN + uniqueId + randomNumber;
	}

	public void compound() {
		double accruedInterest = balance * (rate / 100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interest: $" + accruedInterest);
		printBalance();
	}

	// List common methods
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("Depositing $" + amount);
		printBalance();
	}

	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}

	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}

	public void showInfo() {
		System.out.println("NAME: " + name + "\nACCOUNT NUMBER: " + accountNumber + "\nBALANCE: " + balance + "\nRATE:"
				+ rate + "%");
	}

}
