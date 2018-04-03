package bankaccountapp;

public class Savings extends Account {
	// List properties specific to a Savings account
	int safetyDepositBoxId;
	int safetyDepositBoxKey;

	// Constructor to initialize Savings account properties
	public Savings(String name, String sSn, double initDeposit) {
		super(name, sSn, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}

	// List any methods specific to the Savings account
	private void setSafetyDepositBox() {
		safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
	}

	public void showInfo() {
		super.showInfo();
		System.out.println(" Your Savings Account Features" + "\n Safety Deposit Box ID: " + safetyDepositBoxId
				+ "\n Safety Deposit Box Key: " + safetyDepositBoxKey);
	}

}
