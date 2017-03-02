package abstract_factory_pattern;

public class IciciBusiness implements IciciLoan{

	@Override
	public Loan processLoan() {
		
		return new HousingLoan(1000,"icici");
	}

}
