package adapter_pattern;

//This is the client class.

public class AdapterPatternTest {
	public static void main(String args[]) {
		CreditCard targetInterface = new BankCustomerAdapter();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());
	}
}
