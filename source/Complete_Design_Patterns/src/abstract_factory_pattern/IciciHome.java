package abstract_factory_pattern;

public class IciciHome implements IciciLoan{

	@Override
	public Loan processLoan() {
		System.out.println("your loan is processing");
		return new HousingLoan(100,"icici");
	}

}
