package abstract_factory_pattern;

public class EducationLoan implements Loan{

	int loanAmount=0;
	String bankName=null;
	
	public EducationLoan(int loanAmount,String name){
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
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}
	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}
	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	

}
