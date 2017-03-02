package abstract_factory_pattern;

public class LoanFactory {

public static IciciLoan createLoanFactory(String loanBank,String loanType){
	
	IciciLoan IciciLoan=null;
	if(loanBank.equalsIgnoreCase("ICICI")&& loanType.equalsIgnoreCase("homeloan")){
		IciciLoan= new IciciHome();
	}
	if(loanBank.equalsIgnoreCase("ICICI")&& loanType.equalsIgnoreCase("educationloan")){
		IciciLoan= new IciciHome();
	}
	if(loanBank.equalsIgnoreCase("ICICI")&& loanType.equalsIgnoreCase("businessloan")){
		IciciLoan= new IciciHome();
	}
	return IciciLoan;
}
}