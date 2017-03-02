package factory_pattern;

public class LoanFactory {
	public static Loan getLoanType(String loanType){
		Loan loan=null;
		if(loanType.equals("Education")){
			loan=new EducationLoan();
		}
		if(loanType.equals("Housing")){
			loan=new HousingLoan();
		}
		if(loanType.equals("Business")){
			loan=new BusinessLoan();
		}
		return loan;
	}
}
