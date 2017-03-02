package factory_pattern;

public class BusinessLoan implements Loan{

	@Override
	public int getLoanAmount() {
		return 100000;
	}

	@Override
	public String getBankName() {
		return "ICICI";
	}

}
