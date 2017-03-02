package factory_pattern;

public class FactoryPatternMain {
public static void main(String[] args) {
	Loan loan=LoanFactory.getLoanType("Housing");
	System.out.println(loan.getLoanAmount()+loan.getBankName());
}
}
