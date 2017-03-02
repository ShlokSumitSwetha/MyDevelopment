package composite_pattern2;

public class CarLoan implements Loan{

	@Override
	public void sanctionLoan() {
		System.out.println("  Sanctioning Car Loan");		
	}

}
