package One2ManyBirectional;

public class AddressBi {
	private String id;
	
	private String street;
	private String city;
	private String state;
	private long pinno;
    EmployeeBi employee;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPinno() {
		return pinno;
	}
	public void setPinno(long pinno) {
		this.pinno = pinno;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public EmployeeBi getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeBi employee) {
		this.employee = employee;
	}
	
	
	

}
