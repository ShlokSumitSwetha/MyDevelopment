package composite_pattern2;

public class PersonalLoan implements Loan{

	@Override
	public void sanctionLoan() {
		System.out.println("  Sanctioning Personal Loan");		
	}
}
