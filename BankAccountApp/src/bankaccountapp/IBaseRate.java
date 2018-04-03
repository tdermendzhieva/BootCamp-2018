package bankaccountapp;

public interface IBaseRate {
	// Imagine that this is something that comes from other api/bank
	// Write a method that returns the base rate
	default double getBaseRate() {
		return 2.5;
	}

}
