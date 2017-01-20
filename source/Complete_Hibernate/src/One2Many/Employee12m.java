package One2Many;

import java.util.HashSet;
import java.util.Set;

public class Employee12m {
	
	private int empno;
	private String empName;
	
	Set address=new HashSet();
	
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
	public Set getAddress() {
		return address;
	}
	public void setAddress(Set address) {
		this.address = address;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	

}
