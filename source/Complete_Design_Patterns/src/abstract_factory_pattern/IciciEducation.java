package abstract_factory_pattern;

public class IciciEducation implements IciciLoan{

	@Override
	public Loan processLoan() {
		
		return new HousingLoan(10,"icici");
	}

}
