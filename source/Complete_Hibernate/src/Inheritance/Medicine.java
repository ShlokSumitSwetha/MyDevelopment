package Inheritance;

public class Medicine extends College{
	
	
	String mbbs;
	String dentist;
	
	public void collegeMethod() {
		System.out.println("in mediciene method");
		
	}

	public String getDentist() {
		return dentist;
	}

	public void setDentist(String dentist) {
		this.dentist = dentist;
	}

	public String getMbbs() {
		return mbbs;
	}

	public void setMbbs(String mbbs) {
		this.mbbs = mbbs;
	}

}
