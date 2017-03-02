package composite_pattern2;

import java.util.ArrayList;
import java.util.List;

public class CompositeLoan implements Loan{
	
	private String branchName;
	
	CompositeLoan(String s){
		this.branchName=s;
	}

	@Override
	public void sanctionLoan() {
		System.out.println("Sanctioning Loans for the "+branchName+" Branch:");
		print();
		
	}
	//Collection of child Loans.
    private List<Loan> childLoans = new ArrayList<Loan>();

    //Prints the Loans.
    private void print() {
    	if(childLoans.size()==0){
    		System.out.println("  No Loans processes for this branch");
    	}
        for (Loan loan : childLoans) {
            loan.sanctionLoan();
        }
    }

    //Adds the loan to the composition.
    public void add(Loan loan) {
    	childLoans.add(loan);
    }

    //Removes the loan from the composition.
    public void remove(Loan loan) {
    	childLoans.remove(loan);
    }
}
