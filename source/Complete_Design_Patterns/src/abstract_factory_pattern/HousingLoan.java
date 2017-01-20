package abstract_factory_pattern;

public class HousingLoan implements Loan{

	int loanAmount=0;
	String bankName=null;
	
	public HousingLoan(int loanAmount,String name){
		this.loanAmount=loanAmount;
		this.bankName=name;
	}
	
	/**
	 * @return the loanAmount
	 */
	public int getLoanAmount() {
		return loanAmount;
	}
	
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	
}
