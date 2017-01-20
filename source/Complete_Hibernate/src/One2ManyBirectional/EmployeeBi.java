package One2ManyBirectional;

import java.util.HashSet;
import java.util.Set;

public class EmployeeBi {
	
	private long empno;
	private String empName;
	Set address=new HashSet();
	
	
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public long getEmpno() {
		return empno;
	}
	public void setEmpno(long empno) {
		this.empno = empno;
	}
	public Set getAddress() {
		return address;
	}
	public void setAddress(Set address) {
		this.address = address;
	}
	
	
	

	

}
