package composite_pattern2;

public class CompositeDemo {

	public static void main(String[] args) {

		// creating composites
		CompositeLoan hydBranch=new CompositeLoan("Hyderabad");
		CompositeLoan wglBranch=new CompositeLoan("Warangal");
		CompositeLoan khmBranch=new CompositeLoan("Khammam");
		
		
		hydBranch.add(new CarLoan());
		hydBranch.add(new PersonalLoan());
		hydBranch.add(new HomeLoan());
		hydBranch.sanctionLoan();
		
		wglBranch.add(new CarLoan());
		wglBranch.add(new HomeLoan());
		wglBranch.sanctionLoan();
		
		khmBranch.sanctionLoan();
		
		
	}

}
