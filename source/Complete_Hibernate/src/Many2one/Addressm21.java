package Many2one;

public class Addressm21 {
	private int id;
	
	private String street;
	private String city;
	private String state;
	private long pinno;
    Employeem21 employee;
	
	
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
	
	
	public Employeem21 getEmployee() {
		return employee;
	}
	public void setEmployee(Employeem21 employee) {
		this.employee = employee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
