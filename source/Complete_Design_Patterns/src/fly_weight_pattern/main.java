package fly_weight_pattern;

public class main {

	public static void main(String[] args) {
		Chemical c=ChemicalFactory.getChemical("oxygen");
		System.out.println(c.getName()+c.getAtomicWeight()+c.getSymbol());
		
	}

}
