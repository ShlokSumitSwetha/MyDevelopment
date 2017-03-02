package Inheritance;

public abstract  class College {
	
	 Integer collegecode;
	String  collegeName;
	
	public  abstract void collegeMethod();

	public Integer getCollegecode() {
		return collegecode;
	}

	public void setCollegecode(Integer collegecode) {
		this.collegecode = collegecode;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
