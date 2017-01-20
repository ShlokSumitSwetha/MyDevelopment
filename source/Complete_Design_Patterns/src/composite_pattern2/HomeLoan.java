package composite_pattern2;

public class HomeLoan implements Loan{

	@Override
	public void sanctionLoan() {
		System.out.println("  Sanctioning Home Loan");		
	}
}
