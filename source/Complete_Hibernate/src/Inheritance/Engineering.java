package Inheritance;

public class Engineering extends College{
	
	
	String EEE;
	String ECE;
	String CSE;
	
	public void collegeMethod() {
		System.out.println("college method");
		
	}

	public String getCSE() {
		return CSE;
	}

	public void setCSE(String cse) {
		CSE = cse;
	}

	public String getECE() {
		return ECE;
	}

	public void setECE(String ece) {
		ECE = ece;
	}

	public String getEEE() {
		return EEE;
	}

	public void setEEE(String eee) {
		EEE = eee;
	}

}
