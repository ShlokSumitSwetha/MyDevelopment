package factory_pattern;

public class HousingLoan implements Loan{
	@Override
	public int getLoanAmount() {
		return  250000;
	}
	@Override
	public String getBankName() {
		return "LICHFL";
	}
}
