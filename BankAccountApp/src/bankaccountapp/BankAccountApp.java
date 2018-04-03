package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Checking chkAccount1 = new Checking("Tom Wilson", "232323254", 1500);
		Savings savAccount1 = new Savings("Maria Johnson", "346789098", 2500);
		chkAccount1.showInfo();
		System.out.println("*****************************");
		savAccount1.showInfo();
		// Read a CSV File then create new accounts based on that data
		// lecture 33
		// https://www.udemy.com/practice-java-by-building-projects/learn/v4/t/lecture/8099010?start=0
	}

}
